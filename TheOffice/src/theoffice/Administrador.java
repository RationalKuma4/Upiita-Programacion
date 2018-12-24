package theoffice;

public class Administrador 
{
    String nombreAdmin;
    
    Administrador()
    {
        nombreAdmin="";
    }
    
    void VerInformacionEmpleado(Empleado Emp)
    {
        Emp.ImprimirEmpleado();
    }
    
    void VerInformacionProducto(Producto Prod)
    {
        Prod.VerInformacionProducto();
    }
    
    void VerInventario(Producto Prod)
    {
        System.out.println("Inventario");
        System.out.println("Id: " + Prod.getId());
        System.out.println("Nombre: " + Prod.getNombre());
        System.out.println("Cantidad Disponible: " + Prod.getCantidadDiponible());
    }
    
    void VerGanancias(Empleado oEmpleado)
    {
        System.out.println("Ventas ");
        System.out.println("Empleado: " + oEmpleado.getCodigo()+" "+oEmpleado.getNombreEmpleado());
        System.out.println("Ventas: " + oEmpleado.getVentas());
    }
}

