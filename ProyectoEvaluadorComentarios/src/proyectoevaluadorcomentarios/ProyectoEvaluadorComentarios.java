package proyectoevaluadorcomentarios;
import java.io.File;

public class ProyectoEvaluadorComentarios
{
    public static void main(String[] args)
    {
        String rutaArchivos = "..\\ProyectoEvaluadorComentarios\\Archivos";
        String archivoPersonas = "\\Personas.ser";
        String archivoEstablecimientos = "\\Establecimientos.ser";
        String archivoDiccionario = "\\Diccionario.ser";
        String archivoProveedores = "\\Proveedores.ser";
        String archivoComentarios = "\\Comentarios.ser";
        boolean existeArchivo = false;
        ArchivosObjetos oArchivosObjetos = new ArchivosObjetos();
        
        Administrador oCalificador[] = new Administrador[1];
        Establecimiento oEstablecimiento[] = new Establecimiento[1];
        Diccionario oDiccionario[] = new Diccionario[1];
        EvaluadorComentarios oProveedorComentarios[] = new EvaluadorComentarios[1];
        Comentario comen[] = new Comentario[1];
        
        File file = new File(rutaArchivos + archivoPersonas);
        Administrador calif[] = null;
        Establecimiento estable[] = null;
        Diccionario diccion[] = null;
        EvaluadorComentarios oProveedor[] = null;
        existeArchivo = file.exists();
        
        if(!existeArchivo) 
        {
            oCalificador[0] = new Administrador(1, "Admin", "Admin", "admin", "admin");
            oEstablecimiento[0] = new Establecimiento(1, "Los Compaches", "Comida", "Casco", 0.00, 0);
            oDiccionario[0] = new Diccionario(0, "bueno", 8);
            oProveedorComentarios[0] = new EvaluadorComentarios("Evaluador", 2, "Evaluador", "eva", "eva");
            comen[0] = new Comentario(0, 0, "", "", 0);
            //Creamos nuestros archivos con ejemplos
            oArchivosObjetos.AlmacenarCalificador(rutaArchivos + archivoPersonas, oCalificador);
            oArchivosObjetos.AlmacenarEstablecimiento(rutaArchivos + archivoEstablecimientos, oEstablecimiento);
            oArchivosObjetos.AlmacenarDiccionario(rutaArchivos + archivoDiccionario, oDiccionario);
            oArchivosObjetos.AlmacenarProveedorComentarios(rutaArchivos + archivoProveedores, oProveedorComentarios);
            oArchivosObjetos.AlmacenarComentario(rutaArchivos + archivoComentarios, comen);
        }
        else if(existeArchivo)
        {
            calif = oArchivosObjetos.LeerCalificador(rutaArchivos + archivoPersonas);
            oProveedor = oArchivosObjetos.LeerProveedorComentarios(rutaArchivos + archivoProveedores);
        }
        
        //Pasamos a la interfaz con los objteos usuarios
        VentanaInicio oVentanaInicio = new VentanaInicio();
        try
        {
            if(!existeArchivo)
                oVentanaInicio.RecibeUsuarios(oCalificador, oProveedorComentarios);
            else if(existeArchivo)
                oVentanaInicio.RecibeUsuarios(calif, oProveedor);
            
            oVentanaInicio.setVisible(true);
        }
        catch(Exception ex)
        {
            System.err.print(ex.getClass());
            System.err.println();
            System.err.print(ex.getCause());
            System.err.println();
            System.err.print(ex.getMessage());
            System.err.println();
            System.err.print(ex.getStackTrace());
        }
    }
    
}
