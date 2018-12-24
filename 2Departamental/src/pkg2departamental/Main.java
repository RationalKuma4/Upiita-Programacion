package pkg2departamental;
import java.io.File;

public class Main 
{
    public static void main(String[] args) 
    {
        String rutaArchivos = "..\\2Departamental\\Archivos";
        String archivoPersonas = "\\Personas.ser";
        String archivoProdcutos = "\\Productos.ser";
        String archivoAdministrador = "\\Administrador.ser";
        String archivoTienda = "\\Tienda.ser";
        boolean existeArchivo = false;
        
        Tienda oTienda = new Tienda("UPIITA", "CAE Office", 0);
        Administrador admin = new Administrador(30, 300, "SuperAdmin", "123", "admin");
        Vendedor oVendedor[] = new Vendedor[2];
        Producto oProducto[] = new  Producto[5];
        Archivos oArchivo = new Archivos();
        
        File file = new File(rutaArchivos + archivoPersonas);
        Vendedor ven[] = null;
        Producto pro[] = null;
        existeArchivo = file.exists();
        
        //Si no existen los archivos lo creamos y escribimos
        if(!existeArchivo) 
        {
            oVendedor[0] = new Vendedor(20, 100, "Rosa Roja", "Vendedor", 0, "123", "rosa");
            oVendedor[1] = new Vendedor(22, 200, "Lorenzo Choya", "Vendedor", 0, "123", "lorenzo");
            
            oProducto[0] = new Producto(501, "Silla ejecutiva", 999.00, 3);
            oProducto[1] = new Producto(502, "Mesa de Juntas", 1500.00, 2);
            oProducto[2] = new Producto(503, "Paquete de plumas", 83.00, 10);
            oProducto[3] = new Producto(504, "Paquete de hojas blancas", 96.30, 5);
            oProducto[4] = new Producto(505, "Paquete marca texto", 58.69, 5);
            
            oArchivo.almacenarVendedor(rutaArchivos + archivoPersonas, oVendedor);
            oArchivo.almacenarProdcuto(rutaArchivos + archivoProdcutos, oProducto);
            oArchivo.almacenarAdministrador(rutaArchivos + archivoAdministrador, admin);
            oArchivo.almacenaTienda(rutaArchivos + archivoTienda, oTienda);
        }
        //Si existen, leemos y asignamos a nuestro lista de objetos
        else if(existeArchivo)
        {
            ven = oArchivo.leerVendedor(rutaArchivos + archivoPersonas);
            pro = oArchivo.leerProducto(rutaArchivos + archivoProdcutos);
        }
        
        //Pamos los objetos a la interfaz
        LoginWindows oLoginWindows = new LoginWindows();
        if(!existeArchivo)
        {
            try
            {
                oLoginWindows.RecibeObejetos(oVendedor, admin);
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
                System.out.println(ex.getCause());
            }
        }
        else if(existeArchivo)
        {
            try
            {
                oLoginWindows.RecibeObejetos(ven, admin);
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
                System.out.println(ex.getCause());
            }
        }
        oLoginWindows.setVisible(true);
    }
}
