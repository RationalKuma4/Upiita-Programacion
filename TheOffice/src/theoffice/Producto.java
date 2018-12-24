package theoffice;

public class Producto 
{
    int id;
    String nombre;
    double precio;
    int cantidadDisponible;
    
    Producto(int iD, String nOMBRE, double pRECIO, int cANIDAD_DISPONIBLE)
    {
        id = iD;
        nombre = nOMBRE;
        precio = pRECIO;
        cantidadDisponible = cANIDAD_DISPONIBLE;
    }
    
    void VerDisponibilidad()
    {
        System.out.println("Productos Disponibles: " + cantidadDisponible);
    }
    
    void VerInformacionProducto()
    {
        System.out.println("Productos Id: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Cantidad Disponible: " + getCantidadDiponible());
    }
    
    int getId()
    {
        return id;
    }
    
    String getNombre()
    {
        return nombre;
    }
    
    double getPrecio()
    {
        return precio;
    }
    
    int getCantidadDiponible()
    {
        return cantidadDisponible;
    }
    
    void setCantidadDiponible(int canitdad)
    {
        cantidadDisponible = canitdad;
    }
}
