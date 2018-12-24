package proyectoevaluadorcomentarios;
import java.io.Serializable;


public class Administrador extends Persona implements Serializable
{
    String puesto;
    String usuario;
    String crontasena;
    
    Administrador()
    { }
    
    Administrador(int iDPERSONA, String nOMBRE, String pUESTO, String uSUARIO, String cONTRASENA)
    {
        super(iDPERSONA, nOMBRE);
        this.puesto = pUESTO;
        this.usuario = uSUARIO;
        this.crontasena = cONTRASENA;
    }
}
