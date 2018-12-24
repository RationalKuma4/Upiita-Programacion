/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicar_objetos;

/**
 *
 * @author PaolaNayeli
 */
public class Comunicar_Objetos {
    public static void main(String[] args) {
        // TODO code application logic here
        Twitter_User Twito= new Twitter_User("Cortezpaoli",4567,"Mexico","Estoy agripada #NoVoyTrabajar");
        Twitter_User auxiliar=null;
        System.out.println("Nombre: " +Twito.getNombre());
        System.out.println("Id: " + Twito.getIdUser());
        System.out.println("Pais: " + Twito.getPais());
        System.out.println("Mensaje: " + Twito.getTexto());
        System.out.println("Localizacion: " + Twito.getCoordenadaX() + Twito.getCoordenadaY());
                Interfaz_Usuario auxiliar01= new Interfaz_Usuario();
        try{
        auxiliar01.recibirObjeto(Twito.PasarObjeto()); 
        } catch (Exception e){System.out.println("pasando el objeto");}
        auxiliar01.show(); 
    }
}
