package pkg2departamental;
import java.io.*;

public class Archivos implements Serializable, IArchivos
{
    Archivos()
    { }
    
    public void almacenarVendedor(String ruta, Vendedor vendedor[])
    {
        try 
        {
            FileOutputStream salida = new FileOutputStream(ruta);
            ObjectOutputStream os = new ObjectOutputStream(salida);  //Escribir en archivo
            os.writeObject(vendedor);
            os.flush();
            os.close();
        } 
        catch (Exception ex) 
        {
            System.err.println(ex.getCause());
            System.err.println(ex.getMessage());
        }
    }
    
    public Vendedor[] leerVendedor(String ruta)
    {
        Vendedor vendedor[] = null;
        try 
        {
            FileInputStream fin = new FileInputStream(ruta);
            ObjectInputStream ois = new ObjectInputStream(fin);
            vendedor = (Vendedor[])ois.readObject();
            ois.close();
            fin.close();
            return vendedor;
        } 
        catch (Exception ex) 
        {
            System.err.println(ex.getCause());
            System.err.println(ex.getMessage());
            return vendedor;
        }
    }
    
    public void almacenarProdcuto(String ruta, Producto producto[])
    {
        try 
        {
            FileOutputStream salida = new FileOutputStream(ruta);
            ObjectOutputStream os = new ObjectOutputStream(salida);  //Escribir en archivo
            os.writeObject(producto);
            os.flush();
            os.close();
        } 
        catch (Exception ex) 
        {
            System.err.println(ex.getCause());
            System.err.println(ex.getMessage());
        }
    }
    
    public Producto[] leerProducto(String ruta)
    {
        Producto producto[] = null;
        try 
        {
            FileInputStream fin = new FileInputStream(ruta);
            ObjectInputStream ois = new ObjectInputStream(fin);
            producto = (Producto[])ois.readObject();
            ois.close();
            fin.close();
            return producto;
        } 
        catch (Exception ex) 
        {
            System.err.println(ex.getCause());
            System.err.println(ex.getMessage());
            return producto;
        }
    }
    
    public void almacenarAdministrador(String ruta, Administrador administrador)
    {
        try 
        {
            FileOutputStream salida = new FileOutputStream(ruta);
            ObjectOutputStream os = new ObjectOutputStream(salida);  //Escribir en archivo
            os.writeObject(administrador);
            os.flush();
            os.close();
        } 
        catch (Exception ex) 
        {
            System.err.println(ex.getCause());
            System.err.println(ex.getMessage());
        }
    }
    
    public Administrador leerAdministrador(String ruta)
    {
        Administrador administrador = null;
        try 
        {
            FileInputStream fin = new FileInputStream(ruta);
            ObjectInputStream ois = new ObjectInputStream(fin);
            administrador = (Administrador)ois.readObject();
            ois.close();
            return administrador;
        } 
        catch (Exception ex) 
        {
            System.err.println(ex.getCause());
            System.err.println(ex.getMessage());
            return administrador;
        }
    }
    
    public void almacenaTienda(String ruta, Tienda otienda)
    {
        try 
        {
            FileOutputStream salida = new FileOutputStream(ruta);
            ObjectOutputStream os = new ObjectOutputStream(salida);  //Escribir en archivo
            os.writeObject(otienda);
            os.flush();
            os.close();
        } 
        catch (Exception ex) 
        {
            System.err.println(ex.getCause());
            System.err.println(ex.getMessage());
        }
    }
    
    public Tienda leerTienda(String ruta)
    {
        Tienda tienda = null;
        try 
        {
            FileInputStream fin = new FileInputStream(ruta);
            ObjectInputStream ois = new ObjectInputStream(fin);
            tienda = (Tienda)ois.readObject();
            ois.close();
            return tienda;
        } 
        catch (Exception ex) 
        {
            System.err.println(ex.getCause());
            System.err.println(ex.getMessage());
            return tienda;
        }
    }
}
