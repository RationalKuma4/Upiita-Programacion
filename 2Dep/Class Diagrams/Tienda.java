package pkg2departamental;
import java.io.Serializable;

public class Tienda implements Serializable
{
    String direccion;
    String nombreTienda;
    double ganancias;
    
    Tienda(String dIRECCION, String nOMBRE, double gANANCIAS)
    {
        this.direccion = dIRECCION;
        this.nombreTienda = nOMBRE;
        this.ganancias = gANANCIAS;
    }
    
    String ImprimirTienda()
    {
        return  "Tienda: " + this.nombreTienda + "\r\n"
                + "Direccion: " + this.direccion +  "\r\n"
                + "Ganancias: " + Double.toString(this.ganancias) + "\r\n";
    }
}
