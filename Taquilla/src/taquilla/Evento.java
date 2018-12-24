package taquilla;
import org.markdown4j.Markdown4jProcessor;
import java.awt.Dimension;
import java.awt.Point;
import java.io.*;
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

public class Evento 
{
    int eventoid;
    String nombreEvento;
    String descripcion;
    
    Evento()
    { }
    
    Evento(int eVENTOID, String nOMBREEVENTO, String dESCRIPCION)
    {
        this.eventoid = eVENTOID;
        this.nombreEvento = nOMBREEVENTO;
        this.descripcion = dESCRIPCION;
    }
    
    String getEvento()
    { return this.nombreEvento; }
    
    String Texto(String texto) throws IOException
    {
        
        try {
            String fileName = "..\\Taquilla\\src\\Imagenes\\edit.txt";
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            String line;

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '");                
        }
        
        try
        {
            texto = new Markdown4jProcessor().process("This is a **bold** text");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return texto;
    }
    
    /* Create a JFrame with a JButton and a JFXPanel containing the WebView. */
    private void initAndShowGUI() {
        // This method is invoked on Swing thread
        JFrame frame = new JFrame("FX");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setLayout(null); // do the layout manually

        final JButton jButton = new JButton("Button");
        final JFXPanel fxPanel = new JFXPanel();

        frame.add(jButton);
        frame.add(fxPanel);
        frame.setVisible(true);

        jButton.setSize(new Dimension(200, 27));
        fxPanel.setSize(new Dimension(300, 300));
        fxPanel.setLocation(new Point(0, 27));

        frame.getContentPane().setPreferredSize(new Dimension(300, 327));
        frame.pack();
        frame.setResizable(false);

        Platform.runLater(new Runnable() { // this will run initFX as JavaFX-Thread
            @Override
            public void run() {
                try {
                    initFX(fxPanel);
                } catch (IOException ex) {
                    Logger.getLogger(Evento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    /* Creates a WebView and fires up google.com */
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
        
        String line = "";
        try {
            StringBuilder sb = new StringBuilder();
            String fileName = "..\\Taquilla\\src\\Imagenes\\edit.txt";
            // FileReader reads text files in the default encoding.
            
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            /*FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            

            while((line = bufferedReader.readLine()) != null) {
                line = line + line;
            }   
            
            StringBuilder sb = new StringBuilder();
            String line1 = br.readLine();*/

    while ((line = br.readLine()) != null) {
        sb.append(line);
        sb.append(System.lineSeparator());                              
        line = br.readLine();
    }
    String everything = sb.toString();
            
            String texto = new Markdown4jProcessor().process(everything);
        webEngine.loadContent(texto);
        
            // Always close files.
            br.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '");                
        }
        
        
        
    }
    
    void corre() 
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initAndShowGUI();
            }
        });
    }
}
