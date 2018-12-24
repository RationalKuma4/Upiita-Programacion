package theoffice;
import java.util.Scanner;

public class Empleado
{
    int codigo;
    int edad;
    String nombreEmpleado;
    String puesto;
    double ventas;
    
    Empleado(int cODIGO, int eDAD, String nOMBRE_EMPLEADO, String pUESTO, double vENTAS)
    {
        codigo=cODIGO;
        edad=eDAD;
        nombreEmpleado=nOMBRE_EMPLEADO;
        puesto=pUESTO;
        ventas=vENTAS;
    }
    
    void ImprimirEmpleado()
    {
        System.out.println("Datos Empleado");
        System.out.println("Codigo: " + codigo);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombreEmpleado);
        System.out.println("Puesto: " + puesto);
    }
    
    void VerInformacionPersonal()
    {
        System.out.println("Informacion Personal");
        System.out.println("Codigo: " + codigo);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombreEmpleado);
        System.out.println("Puesto: " + puesto);
    }
    
    void VerDatosProducto(Producto oPrd)
    {
        oPrd.VerInformacionProducto();
    }
    
    void Vender(Producto oProducto[], Empleado vendedor)
    {
        Scanner lee = new Scanner(System.in);
        int idproducto=0, indice=0;
        boolean existe=false;
        
        System.out.println("Catalogo Productos");
        for(int i=0; i<oProducto.length; i++)
        {
            System.out.println("------------------------------");
            VerDatosProducto(oProducto[i]);
        }
        
        System.out.println("Ingrese el id del producto que desea vender");
        idproducto=lee.nextInt();
        
        for(int i=0; i<oProducto.length; i++)
        {
            if(oProducto[i].getId()==idproducto)
            {
                indice=i;
                existe=true;
                break;
            }
        }
        
        if(existe)
        {
            if(oProducto[indice].getCantidadDiponible()>0)
            {
                int cantidad = oProducto[indice].getCantidadDiponible();
                cantidad = cantidad - 1;
                oProducto[indice].setCantidadDiponible(cantidad);
                //oProducto[indice].cantidadDisponible = oProducto[indice].cantidadDisponible - 1;
                vendedor.ventas = vendedor.ventas + oProducto[indice].precio;
            }
            else
            {
                System.out.println("Producto agotado");
            }
        }
        else
        {
            System.out.println("id Incorrecto o invalido");
        }
    }
    
    int getCodigo()
    {
        return codigo;
    }
    
    int getEdad()
    {
        return edad;
    }
    
    String getNombreEmpleado()
    {
        return nombreEmpleado;
    }
    
    String getPuesto()
    {
        return puesto;
    }
    
    double getVentas()
    {
        return ventas;
    }
}
