package proyectoevaluadorcomentarios;
import java.io.*;

public class ArchivosObjetos  implements IArchivos
{
    ArchivosObjetos()
    { }
    
    public void AlmacenarEstablecimiento(String ruta, Establecimiento establecimiento[])
    {
        try 
        {
            FileOutputStream salida = new FileOutputStream(ruta);
            ObjectOutputStream os = new ObjectOutputStream(salida);  //Escribir en archivo
            os.writeObject(establecimiento);
            os.flush();
            os.close();
        } 
        catch (Exception ex) 
        {
            System.err.print(ex.getClass());
            System.out.println();
            System.err.print(ex.getCause());
            System.out.println();
            System.err.print(ex.getMessage());
            System.out.println();
            System.err.print(ex.getStackTrace());
        }
    }
    
    public Establecimiento[] LeerEstablecimiento(String ruta)
    {
        Establecimiento oEstablecimiento[] = null;
        try 
        {
            FileInputStream fin = new FileInputStream(ruta);
            ObjectInputStream ois = new ObjectInputStream(fin);
            oEstablecimiento = (Establecimiento[])ois.readObject();
            ois.close();
            fin.close();
            return oEstablecimiento;
        } 
        catch (Exception ex) 
        {
            System.err.print(ex.getClass());
            System.out.println();
            System.err.print(ex.getCause());
            System.out.println();
            System.err.print(ex.getMessage());
            System.out.println();
            System.err.print(ex.getStackTrace());
            return oEstablecimiento;
        }
    }
    
    public void AlmacenarCalificador(String ruta, Administrador oCalificador[])
    {
        try 
        {
            FileOutputStream salida = new FileOutputStream(ruta);
            ObjectOutputStream os = new ObjectOutputStream(salida);  //Escribir en archivo
            os.writeObject(oCalificador);
            os.flush();
            os.close();
        } 
        catch (Exception ex) 
        {
            System.err.print(ex.getClass());
            System.out.println();
            System.err.print(ex.getCause());
            System.out.println();
            System.err.print(ex.getMessage());
            System.out.println();
            System.err.print(ex.getStackTrace());
        }
    }
    
    public Administrador[] LeerCalificador(String ruta)
    {
        Administrador oCalificador[] = null;
        try 
        {
            FileInputStream fin = new FileInputStream(ruta);
            ObjectInputStream ois = new ObjectInputStream(fin);
            oCalificador = (Administrador[])ois.readObject();
            ois.close();
            fin.close();
            return oCalificador;
        } 
        catch (Exception ex) 
        {
            System.err.print(ex.getClass());
            System.out.println();
            System.err.print(ex.getCause());
            System.out.println();
            System.err.print(ex.getMessage());
            System.out.println();
            System.err.print(ex.getStackTrace());
            return oCalificador;
        }
    }
    
    public void AlmacenarDiccionario(String ruta, Diccionario oDiccionario[])
    {
        try 
        {
            FileOutputStream salida = new FileOutputStream(ruta);
            ObjectOutputStream os = new ObjectOutputStream(salida);  //Escribir en archivo
            os.writeObject(oDiccionario);
            os.flush();
            os.close();
        } 
        catch (Exception ex) 
        {
            System.err.print(ex.getClass());
            System.out.println();
            System.err.print(ex.getCause());
            System.out.println();
            System.err.print(ex.getMessage());
            System.out.println();
            System.err.print(ex.getStackTrace());
        }
    }
    
    public Diccionario[] LeerDiccionario(String ruta)
    {
        Diccionario oDiccionario[] = null;
        try 
        {
            FileInputStream fin = new FileInputStream(ruta);
            ObjectInputStream ois = new ObjectInputStream(fin);
            oDiccionario = (Diccionario[])ois.readObject();
            ois.close();
            fin.close();
            return oDiccionario;
        } 
        catch (Exception ex) 
        {
            System.err.print(ex.getClass());
            System.out.println();
            System.err.print(ex.getCause());
            System.out.println();
            System.err.print(ex.getMessage());
            System.out.println();
            System.err.print(ex.getStackTrace());
            return oDiccionario;
        }
    }
    
    public void AlmacenarProveedorComentarios(String ruta, EvaluadorComentarios oProveedorComentarios[])
    {
        try 
        {
            FileOutputStream salida = new FileOutputStream(ruta);
            ObjectOutputStream os = new ObjectOutputStream(salida);  //Escribir en archivo
            os.writeObject(oProveedorComentarios);
            os.flush();
            os.close();
        } 
        catch (Exception ex) 
        {
            System.err.print(ex.getClass());
            System.out.println();
            System.err.print(ex.getCause());
            System.out.println();
            System.err.print(ex.getMessage());
            System.out.println();
            System.err.print(ex.getStackTrace());
        }
    }
    
    public EvaluadorComentarios[] LeerProveedorComentarios(String ruta)
    {
        EvaluadorComentarios oProveedorComentarios[] = null;
        try 
        {
            FileInputStream fin = new FileInputStream(ruta);
            ObjectInputStream ois = new ObjectInputStream(fin);
            oProveedorComentarios = (EvaluadorComentarios[])ois.readObject();
            ois.close();
            fin.close();
            return oProveedorComentarios;
        } 
        catch (Exception ex) 
        {
            System.err.print(ex.getClass());
            System.out.println();
            System.err.print(ex.getCause());
            System.out.println();
            System.err.print(ex.getMessage());
            System.out.println();
            System.err.print(ex.getStackTrace());
            return oProveedorComentarios;
        }
    }
    
    public void AlmacenarComentario(String ruta, Comentario oComentario[])
    {
        try 
        {
            FileOutputStream salida = new FileOutputStream(ruta);
            ObjectOutputStream os = new ObjectOutputStream(salida);  //Escribir en archivo
            os.writeObject(oComentario);
            os.flush();
            os.close();
        } 
        catch (Exception ex) 
        {
            System.err.print(ex.getClass());
            System.out.println();
            System.err.print(ex.getCause());
            System.out.println();
            System.err.print(ex.getMessage());
            System.out.println();
            System.err.print(ex.getStackTrace());
        }
    }
    
    public Comentario[] LeerComentario(String ruta)
    {
        Comentario oComentario[] = null;
        try 
        {
            FileInputStream fin = new FileInputStream(ruta);
            ObjectInputStream ois = new ObjectInputStream(fin);
            oComentario = (Comentario[])ois.readObject();
            ois.close();
            fin.close();
            return oComentario;
        } 
        catch (Exception ex) 
        {
            System.err.print(ex.getClass());
            System.out.println();
            System.err.print(ex.getCause());
            System.out.println();
            System.err.print(ex.getMessage());
            System.out.println();
            System.err.print(ex.getStackTrace());
            return oComentario;
        }
    }
}
