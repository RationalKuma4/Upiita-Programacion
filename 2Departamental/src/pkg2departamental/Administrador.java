package pkg2departamental;

public class Administrador extends Persona
{
    Administrador()
    { }
    
    Administrador(int eDAD, int iD, String nOMBRE, String pASSWORD, String uSUARIO)
    {
        super(eDAD, iD, nOMBRE, pASSWORD, uSUARIO);
    }
     
     String consultaInventario(Producto[] oProducto)
     {
        String texto = "";
        for(Producto pro : oProducto)
        {
            texto = texto + pro.VerInformacionProductoPanel();
        }
        return texto;
     }
     
     double obtenerGanacias(Vendedor[] vendedor)
     {
         double total = 0;
         for(Vendedor venta : vendedor)
         {
             total = total + venta.ventas;
         }
         return total;
     }
}
