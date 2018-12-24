package practicabanco;

public class Usuario 
{
    int id;
    String nombre;
    String usuario;
    String contrasena;
    int cuentaId;
    
    Usuario()
    {
        id = 0;
        nombre = "";
        usuario = "";
        contrasena = "";
        cuentaId = 0;
    }
    
    Usuario(int iD, String nOMBRE, String uSUARIO, String cONTRASENA, int cUENTAID)
    {
        this.id = iD;
        this.nombre = nOMBRE;
        this.usuario = uSUARIO;
        this.contrasena = cONTRASENA;
        this.cuentaId = cUENTAID;
    }
    
    int getId()
    {
        return id;
    }
    
    String getNombre()
    {
        return nombre;
    }
    
    String getUsuario()
    {
        return usuario;
    }
    
    String getContrasena()
    {
        return contrasena;
    }
    
    int getCuentaid()
    {
        return cuentaId;
    }
    
    
}
