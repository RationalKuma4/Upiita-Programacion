package proyectoevaluadorcomentarios;


public class EvaluadorComentarios extends Persona
{
    String puesto;
    String usuario;
    String contrasena;
    
    EvaluadorComentarios()
    { }
    
    EvaluadorComentarios(String pUESTO, int iDPERSONA, String nOMBRE, String uSUARIO, String cONTRASENA)
    {
        super(iDPERSONA, nOMBRE);
        this.puesto = pUESTO;
        this.usuario = uSUARIO;
        this.contrasena = cONTRASENA;
    }
    
    
}
