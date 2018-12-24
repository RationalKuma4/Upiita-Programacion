/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_exc;

/**
 *
 * @author PaolaNayeli
 */
public class Usuario {
    String nombre;
    String email;
    String password;
    String usrname;
    
    Usuario(){
    nombre="";
    email="";
    password="";
    usrname="";
    }
    
    void setUsrname(String x){
    usrname=x;
}
    
    void setPassword(String pwd){
    password=pwd;
    }
    
    void setNombre(String nom){
    nombre=nom;
    }
    void setEmail(String mail){
    email=mail;
    } 
    
    String getNombre(){
    return nombre;}
    
    String getEmail(){
    return email;}
}
