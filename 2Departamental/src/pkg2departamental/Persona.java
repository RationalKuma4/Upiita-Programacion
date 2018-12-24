package pkg2departamental;
import java.io.Serializable;

public abstract class Persona implements Serializable
{
    int edad;
    int id;
    String nombre;
    String usuario;
    String password;
    
    Persona()
    { }
    
    Persona(int eDAD, int iD, String nOMBRE, String pASSWORD, String uSUARIO)
    {
        this.edad = eDAD;
        this.id = iD;
        this.nombre = nOMBRE;
        this.password = pASSWORD;
        this.usuario = uSUARIO;
    }
}

