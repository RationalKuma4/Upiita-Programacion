package proyectoevaluadorcomentarios;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.markdown4j.Markdown4jProcessor;
import java.io.FileWriter;

public class Evaluador
{
    String nombreEstablecimiento;
    String fecha;
    int concidencias;
    double calificacion;
    String markText = "";
    JFrame frame = new JFrame("Resultados");
    
    Evaluador()
    { }
    
    public void ProcesaComentario(int establecimiento, int archivoid) throws DocumentException, FileNotFoundException
    {
        Establecimiento est = new Establecimiento();
        Comentario textoEvaluar[] = (new Comentario()).GetComentarioxEstablecimientoArchivo(establecimiento, archivoid);
        String palabras[] = null;
        palabras = textoEvaluar[0].comentario.split(" ");
        Evaluador oEvaluador = new Evaluador();
        oEvaluador = Condidencias(palabras);
        oEvaluador.fecha = textoEvaluar[0].fecha;
        oEvaluador.nombreEstablecimiento = est.GetEstablecimientoxId(textoEvaluar[0].idEstablecimiento).nombre;
        nombreEstablecimiento = oEvaluador.nombreEstablecimiento;
        markText = ProcesaInformacion(oEvaluador);
        
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(oEvaluador.nombreEstablecimiento + ".pdf"));
        document.open();
        document.add(new Paragraph(markText)); 
        document.close();
    }
    
    private Evaluador Condidencias(String palabras[])
    {
        int concidencia = 0;
        double calificaciones = 0;
        String rutaArchivos = "..\\ProyectoEvaluadorComentarios\\Archivos";
        String archivoDiccionario = "\\Diccionario.ser";
        Evaluador con = new Evaluador();
        ArchivosObjetos archivo = new ArchivosObjetos();
        Diccionario[] pala = archivo.LeerDiccionario(rutaArchivos + archivoDiccionario);
        
        for(int i = 0; i < palabras.length; i++)
        {
            for(int j = 0; j < pala.length; j++)
            {
                if(palabras[i].contains(pala[j].palabra))
                {
                    System.out.println(palabras[i]);
                    System.out.println(pala[j].palabra);
                    concidencia = concidencia + 1;
                    calificaciones = calificaciones + pala[j].calificacion;
                }
            }
        }
        con.concidencias = concidencia;
        con.calificacion = PromedioComentario(concidencia, calificaciones);
        return con;
    }
    
    private double PromedioComentario(int numeroCon , double calif)
    {
        double prom = 0;
        prom = calif / numeroCon;
        return prom;
    }
    
    private String ProcesaInformacion(Evaluador informacion)
    {
        String textoMark = "";
        try
        {
            String formato = "# Establecimiento: **" + informacion.nombreEstablecimiento + "**\r\n"
                            + "- Fecha: **" + informacion.fecha + "**.\r\n"
                            + "- Condidencias encontradas: **" + Integer.toString(informacion.concidencias) + "**.\r\n"
                            + "- Calificacion total: **" + Double.toString(informacion.calificacion) + "**.\r\n";
            textoMark = new Markdown4jProcessor().process(formato);
            
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return textoMark;
    }
    
    private void jActionPerformed(java.awt.event.ActionEvent evt)
    {
        try 
        {
            FileWriter escritura = new FileWriter("..\\ProyectoEvaluadorComentarios\\Archivos\\" + nombreEstablecimiento + ".htm", true);
            escritura.write(markText);
            escritura.close();
        } 
        catch (Exception ex) 
        {
            System.err.print(ex.getClass());
            System.err.println();
            System.err.print(ex.getCause());
            System.err.println();
            System.err.print(ex.getMessage());
            System.err.println();
            System.err.print(ex.getStackTrace());
        }
        frame.setVisible(false);
    }
            
    private void initAndShowGUI() {
        // This method is invoked on Swing thread
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setLayout(null); // do the layout manually

        final JButton jButton = new JButton("Salir");
        final JFXPanel fxPanel = new JFXPanel();
        
        jButton.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt) 
                {
                    jActionPerformed(evt);
                }
            });
        frame.add(fxPanel);
        frame.add(jButton);
        frame.setVisible(true);

        jButton.setSize(new Dimension(200, 27));
        fxPanel.setSize(new Dimension(500, 300));
        fxPanel.setLocation(new Point(0, 27));

        frame.getContentPane().setPreferredSize(new Dimension(500, 327));
        frame.pack();
        frame.setResizable(true);

        Platform.runLater(new Runnable() { // this will run initFX as JavaFX-Thread
            @Override
            public void run()
            {
                try
                {
                    initFX(fxPanel);
                } catch (IOException ex) 
                {
                    Logger.getLogger(Evaluador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void initFX(final JFXPanel fxPanel) throws IOException {
        Group group = new Group();
        Scene scene = new Scene(group);
        fxPanel.setScene(scene);
        WebView webView = new WebView();
        group.getChildren().add(webView);
        webView.setMinSize(300, 300);
        webView.setMaxSize(300, 300);
        // Obtain the webEngine to navigate
        WebEngine webEngine = webView.getEngine();
        String texto = new Markdown4jProcessor().process(markText);
        webEngine.loadContent(texto);
    }
    
    public void corre() 
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initAndShowGUI();
            }
        });
    }
    
}
