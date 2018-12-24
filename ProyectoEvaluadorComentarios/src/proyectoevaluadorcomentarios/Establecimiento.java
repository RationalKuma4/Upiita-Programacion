package proyectoevaluadorcomentarios;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Establecimiento implements Serializable
{
    int idEstablecimiento;
    String nombre;
    String giro;
    String direccion;
    double calificacion;
    int comentarios;
    
    Establecimiento()
    { }
    
    Establecimiento(int iDESTABLECIMIENTO, String nOMBRE, String gIRO, String dIRECCION, double cALIFICACION, int cOMENTARIOS)
    {
        this.idEstablecimiento = iDESTABLECIMIENTO;
        this.nombre = nOMBRE;
        this.giro = gIRO;
        this.direccion = dIRECCION;
        this.calificacion = cALIFICACION;
        this.comentarios = cOMENTARIOS;
    }
    
    public String InformacionEstablecimiento()
    {
        return  "/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/\r\n"
                + "Nombre: " + this.nombre + "\r\n"
                + "Giro: " + this.giro + "\r\n"
                + "Direccion: " + this.direccion + "\r\n"
                /*+ "Calificacion: " + Double.toString(this.calificacion) + "\r\n"
                + "N° Comentarios: " + Integer.toString(comentarios) + "\r\n"*/;
    }
    
    public Establecimiento GetEstablecimientoxId(int idEst)
    {
        String rutaArchivos = "..\\ProyectoEvaluadorComentarios\\Archivos";
        String archivoEstablecimientos = "\\Establecimientos.ser";
        List<Establecimiento> listaEstablecimiento = new ArrayList<>();
        ArchivosObjetos archivo = new ArchivosObjetos();
        
        listaEstablecimiento.addAll(Arrays.asList(archivo.LeerEstablecimiento(rutaArchivos + archivoEstablecimientos)));
        listaEstablecimiento.removeIf(s -> s.idEstablecimiento != idEst);
        Establecimiento[] array = new Establecimiento[listaEstablecimiento.size()];
        return listaEstablecimiento.toArray(array)[0];
    }
}
