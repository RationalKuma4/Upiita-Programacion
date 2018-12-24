/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author Paola
 */
public class Humano  implements Habilidades  {
    private  String nombre;
    private int num_brazos;
    private int num_piernas;
    private String color_ojos;
    private String genero;
    
    Humano(String nombre, int brazos, int piernas, String color, String sexo){

    this.nombre=nombre;
    this.color_ojos=color;
    this.genero=sexo;
    this.num_brazos=brazos;
    this.num_piernas=piernas;
    }
    
    public void reproducirse(){
    System.out.println(" ************************** ");
    System.out.println("Ver a los ojos a la otra persona");
    System.out.println("platicar");
    System.out.println("Cierto tiempo despues.....");
    System.out.println("Empezar proceso de reproduccion.....");
    System.out.println(" ************************** ");
    }
    
    int evaluar_genero(){
    if (genero.equals("Hombre"))
            return 0;
    else
    return 1;
    }
    
 public void Actividades(){
 System.out.println(nombre + " Hace actividades variadas, comunmente mal!!");
 } 
 
 public void Rezar(int y){
 System.out.println(nombre+ " Solo reza cuando tiene problemas unas " + y + " veces al día");
 }
 
 public void Imprimir_Datos() {
 System.out.println(" ************************** ");
    System.out.println("Yo me llamo "+ nombre);
    System.out.println("Tengo los ojos color: "+ color_ojos + " y soy " + genero);
    System.out.println("Tengo "+ num_brazos + " brazos y " + num_piernas + " piernas");
   System.out.println(" ************************** ");
 
 }
 
 public int nada(){
 return 666;}
 
}
