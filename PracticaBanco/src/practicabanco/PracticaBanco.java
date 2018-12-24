package practicabanco;

public class PracticaBanco 
{
    public static void main(String[] args) 
    {
        //Invocamos los objetos
        Usuario oUsuario[] = new Usuario[2];
        Cuenta oCuenta[] = new Cuenta[2];
        //Construimos los obejtos
        oUsuario[0] = new Usuario(1, "Nombre1", "123", "123", 1);
        oUsuario[1] = new Usuario(2, "Nombre2", "123", "456", 2);
        
        oCuenta[0] = new Cuenta(1, 500, "500");
        oCuenta[1] = new Cuenta(2, 1000, "1000");
        
        //Pamos los objetos a la interfaz
        LoginWindows oLoginWindows = new LoginWindows();
        try
        {
            oLoginWindows.RecibeObejetos(oUsuario, oCuenta);
        }
        catch(Exception ex)
        {
            System.out.println("Pasando objetos");
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
        oLoginWindows.setVisible(true);
    }
    
}
