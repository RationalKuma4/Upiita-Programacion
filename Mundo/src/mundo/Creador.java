/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author Paola
 */
public class Creador implements Habilidades{
    String poder;
    
    Creador(){
    poder="absoluto";
    }
    
    public void Actividades(){
    System.out.println("Atender los problemas que los humanos generan debido a su poder " + poder);
    }
    
    public void Rezar(int y){
    System.out.println("Hace oración seguido aproximadamente.."+ y + " veces al dia");}
    
    public void Cuidar(){
    System.out.println("Vive cuidando a las personas, aunque a veces no lo parezca");}
    
    public void Imprimir_Datos(){
    System.out.println("Sin nada que comentar");} 
    
    public int nada(){
    return 234;}
    
    
}
