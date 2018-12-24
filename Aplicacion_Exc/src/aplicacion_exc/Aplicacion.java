/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_exc;
import java.util.ResourceBundle;
import java.util.Properties;
import java.io.*;
/**
 *
 * @author PaolaNayeli
 */
public class Aplicacion {
    

    public Usuario login(String usrname, String password){
      Properties propiedades = new Properties();
    InputStream entrada = null;
    try {
      entrada = new FileInputStream("usuario.properties");

        // cargamos el archivo de propiedades
        propiedades.load(entrada);   
  //  ResourceBundle rb=ResourceBundle.getBundle("usuario");
 //   String usr=rb.getString("usrname");
     String usr=propiedades.getProperty("usrname");
 
    String pwd= propiedades.getProperty("password");
    Usuario U=null;
    
    if (usr.equals(usrname)&& pwd.equals(password))
    {
        U=new Usuario();
        U.setUsrname(usr);
        U.setPassword(pwd);
        U.setNombre(propiedades.getProperty("nombre"));
        U.setEmail(propiedades.getProperty("email")); 
    }
    return U;
   }
    catch (Exception ex)
    {
        throw new RuntimeException("Error verificando datos", ex);
    }
    }


}


