package theoffice;

public class Tienda 
{
    String direccion;
    String nombreTienda;
    
    Tienda(String dIRECCION, String nOMBRE)
    {
        direccion = dIRECCION;
        nombreTienda = nOMBRE;
    }
    
    void ImprimirTienda()
    {
        System.out.println("Tienda: " + nombreTienda);
        System.out.println("Direccion: " + direccion);
    }
}
