package pkg2departamental;
import java.io.*;

public class Vendedor extends Persona implements Serializable
{
    String puesto;
    double ventas;
    
    Vendedor()
    { }
            
    Vendedor(int eDAD, int iD, String nOMBRE, String pUESTO, double vENTAS, String pASSWORD, String uSUARIO)
    {
        super(eDAD, iD, nOMBRE, pASSWORD, uSUARIO);
        puesto=pUESTO;
        ventas=vENTAS;
    }
    
    String ImprimirVendedor()
    {
        return "/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*" + "\r\n"
                + "Nombre: " + this.nombre + "\r\n"
                + "Edad: " + this.edad +  "\r\n"
                + "Id: " + this.id + "\r\n"
                + "Puesto: " + this.puesto + "\r\n"
                + "Ventas: " + this.ventas + "\r\n";
    }
    
    double Vender(Producto oProducto, Vendedor vendedor, int cantidadProducto)
    {   
        int cantidad = oProducto.getCantidadDiponible();
        double total = oProducto.precio * cantidadProducto;
        cantidad = cantidad - cantidadProducto;
        oProducto.setCantidadDiponible(cantidad);
        vendedor.ventas = vendedor.ventas + total;
        return total;
        
    }
}
