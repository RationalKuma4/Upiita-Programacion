/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author Paola
 */
public class Mundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Creador Ser_Supremo=new Creador();
      
       
        Humano primero=new Humano("Adan",2,2,"Cafe","Hombre");
        Humano segundo=new Humano("Eva",2,2,"Cafe claro","Mujer");
        
       System.out.println("Este programa recrea el Mundo así que veremos los roles");
        Ser_Supremo.Actividades();
        primero.Imprimir_Datos();
        segundo.Imprimir_Datos();
        
        System.out.println("Veamos el proceso de reproducción de los humanos..");
        primero.reproducirse();
        
        primero.Actividades();
        segundo.Actividades();
         
        int res_genero;
        
        res_genero=primero.evaluar_genero();
        primero.Rezar(res_genero);
        
        res_genero=segundo.evaluar_genero();
        segundo.Rezar(res_genero);
        
        System.out.println("Debido a todo esto es que el objeto Ser Supremo hace lo siguiente:");
         Ser_Supremo.Cuidar();
        Ser_Supremo.Rezar(1000);
        
       //Instanciando a un objeto de la clase interfaz-
        Habilidades objetoInterface;
        objetoInterface= new Humano("El colado",2,1,"Cafe","Hombre");
        
       
      /*  
       Habilidades hab;
       hab= segundo;
       hab.Actividades();
 */
        
      
       
    }
}
