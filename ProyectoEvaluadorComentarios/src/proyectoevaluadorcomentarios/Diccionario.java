package proyectoevaluadorcomentarios;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Diccionario implements Serializable
{
    int idPalabra;
    String palabra;
    double calificacion;
    
    Diccionario()
    { }
    
    Diccionario(int iDPALABRA, String pALABRA, double cALIFICACION)
    {
        this.idPalabra = iDPALABRA;
        this.palabra = pALABRA;
        this.calificacion = cALIFICACION;
    }
    
    public String MuestraPalabra()
    {
        return "Id: " + Integer.toString(this.idPalabra) + " - "  /*+ "\n\r"*/
                + "Palabra: " + this.palabra + " - "  /*+ "\n\r"*/
                + "Calificacion: " + Double.toString(calificacion) + "\n\r";
    }
    
    public Diccionario GetOnePalbra(int id)
    {
        String rutaArchivos = "..\\ProyectoEvaluadorComentarios\\Archivos";
        String archivoDiccionario = "\\Diccionario.ser";
        Diccionario diccionario[] = null;
        Diccionario palabra = new Diccionario();
        ArchivosObjetos archivo = new ArchivosObjetos();
        
        diccionario = archivo.LeerDiccionario(rutaArchivos + archivoDiccionario);
        
        for(int i = 0; i < diccionario.length; i++)
        {
            if(id == diccionario[i].idPalabra)
            {
                palabra = diccionario[i];
            }
        }
        return palabra;
    }
    
    public boolean GuardaPalabra(String palabra, double calificacion)
    {
        boolean resp;
        String rutaArchivos = "..\\ProyectoEvaluadorComentarios\\Archivos";
        String archivoDiccionario = "\\Diccionario.ser";
        List<Diccionario> diccionario = new ArrayList<>();
        ArchivosObjetos archivo = new ArchivosObjetos();
        
        diccionario.addAll(Arrays.asList(archivo.LeerDiccionario(rutaArchivos + archivoDiccionario)));
        int id = diccionario.size() + 1;
        
        Diccionario nuevaPalabra = new Diccionario();
        nuevaPalabra.idPalabra = id;
        nuevaPalabra.palabra = palabra;
        nuevaPalabra.calificacion = calificacion;
        diccionario.add(nuevaPalabra);
        Diccionario[] array = new Diccionario[diccionario.size()];
        
        try
        {
            archivo.AlmacenarDiccionario(rutaArchivos + archivoDiccionario, diccionario.toArray(array));
            resp = true;
        }
        catch(Exception ex)
        {
            resp = false;
        }
        return resp;
    }
    
    public boolean EliminaPalabra(int idpalabra)
    {
        boolean resp = false;
        String rutaArchivos = "..\\ProyectoEvaluadorComentarios\\Archivos";
        String archivoDiccionario = "\\Diccionario.ser";
        List<Diccionario> diccionario = new ArrayList<>();
        ArchivosObjetos archivo = new ArchivosObjetos();
        
        diccionario.addAll(Arrays.asList(archivo.LeerDiccionario(rutaArchivos + archivoDiccionario)));
        
        try
        {
            diccionario.remove(idpalabra);
            Diccionario[] array = new Diccionario[diccionario.size()];
            archivo.AlmacenarDiccionario(rutaArchivos + archivoDiccionario, diccionario.toArray(array));
            resp = true;
        }
        catch(Exception ex)
        {
            
        }
        return resp;
    }
    
    public boolean ModificaPalbra(Diccionario diccion)
    {
        boolean resp = false;
        String rutaArchivos = "..\\ProyectoEvaluadorComentarios\\Archivos";
        String archivoDiccionario = "\\Diccionario.ser";
        Diccionario diccionario[] = null;
        ArchivosObjetos archivo = new ArchivosObjetos();
        
        diccionario = archivo.LeerDiccionario(rutaArchivos + archivoDiccionario);
        
        for(int i = 0; i < diccionario.length; i++)
        {
            if(diccion.idPalabra == diccionario[i].idPalabra)
            {
                diccionario[i].calificacion = diccion.calificacion;
            }
        }
        
        try
        {
            archivo.AlmacenarDiccionario(rutaArchivos + archivoDiccionario, diccionario);
            resp = true;
        }
        catch(Exception ex)
        {
            
        }
        return resp;
    }
}
