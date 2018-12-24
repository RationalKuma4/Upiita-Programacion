/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_exc;

/**
 *
 * @author PaolaNayeli
 */
public class Aplicacion_Exc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aplicacion app=new Aplicacion();
        Usuario U= new Usuario();
        U= app.login("juan", "juan123sito");
        
        if (U==null)
        {
        System.out.println("Usuario y/o password incorrectos");
        }
        else
        {
        System.out.println("Felicidades, login exitoso");
        System.out.println("Nombre:"+ U.getNombre());
        System.out.println("Email"+ U.getEmail());
        
        }
    }
}
