package proyectoevaluadorcomentarios;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comentario implements Serializable
{
    int idComentario;
    int idEstablecimiento;
    String fecha;
    String comentario;
    double calificacion;
    
    Comentario()
    { }
    
    Comentario(int iDCOMENTARIO, int iDESTABLECIMIENTO, String fECHA, String cOMENTARIO, double cALIFICACION)
    {
        this.idComentario = iDCOMENTARIO;
        this.idEstablecimiento = iDESTABLECIMIENTO;
        this.fecha = fECHA;
        this.comentario = cOMENTARIO;
        this.calificacion = cALIFICACION;
    }
    
    public boolean GuardaComentario(String comentario, String fecha, int idEstablecimiento)
    {
        boolean resp;
        
        String rutaArchivos = "..\\ProyectoEvaluadorComentarios\\Archivos";
        String archivoComentarios = "\\Comentarios.ser";
        List<Comentario> comenta = new ArrayList<>();
        ArchivosObjetos archivo = new ArchivosObjetos();
        
        comenta.addAll(Arrays.asList(archivo.LeerComentario(rutaArchivos + archivoComentarios)));
        int id = comenta.size();
        
        Comentario oComentario = new Comentario();
        oComentario.idComentario = id;
        oComentario.idEstablecimiento = idEstablecimiento;
        oComentario.fecha = fecha;
        oComentario.comentario = comentario;
        oComentario.calificacion = 0;
        comenta.add(oComentario);
        Comentario[] array = new Comentario[comenta.size()];
        
        try
        {
            archivo.AlmacenarComentario(rutaArchivos + archivoComentarios, comenta.toArray(array));
            resp = true;
        }
        catch(Exception ex)
        {
            resp = false;
        }
        return resp;
    }
    
    public Comentario[] GetComentarioxEstablecimiento(int idEstablecimiento)
    {
        String rutaArchivos = "..\\ProyectoEvaluadorComentarios\\Archivos";
        String archivoComentarios = "\\Comentarios.ser";
        List<Comentario> listaComentario = new ArrayList<>();
        ArchivosObjetos archivo = new ArchivosObjetos();
        
        listaComentario.addAll(Arrays.asList(archivo.LeerComentario(rutaArchivos + archivoComentarios)));
        listaComentario.removeIf(s -> s.idEstablecimiento != idEstablecimiento);
        Comentario[] array = new Comentario[listaComentario.size()];
        return listaComentario.toArray(array);
    }
    
    public Comentario[] GetComentarioxEstablecimientoArchivo(int idEstablecimiento, int idArchivo)
    {
        String rutaArchivos = "..\\ProyectoEvaluadorComentarios\\Archivos";
        String archivoComentarios = "\\Comentarios.ser";
        List<Comentario> listaComentario = new ArrayList<>();
        List<Comentario> listaC = new ArrayList<>();
        ArchivosObjetos archivo = new ArchivosObjetos();
        
        listaComentario.addAll(Arrays.asList(archivo.LeerComentario(rutaArchivos + archivoComentarios)));
        listaComentario.removeIf(s -> (s.idEstablecimiento != idEstablecimiento));
        listaC = listaComentario;
        listaC.removeIf(s -> s.idComentario != idArchivo);
        
        Comentario[] array = new Comentario[listaC.size()];
        
        return listaC.toArray(array);
    }
}
