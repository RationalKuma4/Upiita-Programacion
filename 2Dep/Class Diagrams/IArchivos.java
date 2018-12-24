package pkg2departamental;

public interface IArchivos
{
    void almacenarVendedor(String ruta, Vendedor vendedor[]);
    Vendedor[] leerVendedor(String ruta);
    void almacenarProdcuto(String ruta, Producto producto[]);
    Producto[] leerProducto(String ruta);
    void almacenarAdministrador(String ruta, Administrador administrador);
    Administrador leerAdministrador(String ruta);
    void almacenaTienda(String ruta, Tienda otienda);
    Tienda leerTienda(String ruta);
}
