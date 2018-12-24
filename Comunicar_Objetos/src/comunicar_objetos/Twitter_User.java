/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicar_objetos;

public class Twitter_User {
    
    String Nombre_User;
    int id_User;
    String pais;
    String texto;
    double coordenadaX;
    double coordenadaY;
    
  Twitter_User(String a,int b, String c,String d){
  Nombre_User=a;
  id_User=b;
  pais=c;
  texto=d;
  coordenadaX=0.00;
  coordenadaY=0.00;
  }  
  
  public String getNombre(){
    return Nombre_User;
    }
  
 public int getIdUser(){
    return id_User;
    }
   
 public String getPais(){
    return pais;
    }
 
 public String getTexto(){
    return texto;
    }
 
 public double getCoordenadaX(){
    return coordenadaX;
    }
 
 public double getCoordenadaY(){
    return coordenadaY;
    }
 
 
 public Twitter_User PasarObjeto(){
 return this;
 } 
 
 
  
}
