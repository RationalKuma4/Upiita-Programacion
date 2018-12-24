package theoffice;

public abstract class Persona 
{
    int edad;
    int id;
    String Nombre;
    
    Persona(int eDAD, int iD, String nOMBRE)
    {
        this.edad = eDAD;
        this.id = iD;
        this.Nombre = nOMBRE;
    }
}
