package proyectoevaluadorcomentarios;
import java.io.Serializable;

public abstract class Persona implements Serializable
{
    int idPersona;
    String nombre;
    
    Persona()
    { }
    
    Persona(int iDPERSONA, String nOMBRE)
    {
        this.idPersona = iDPERSONA;
        this.nombre = nOMBRE;
    }
}
