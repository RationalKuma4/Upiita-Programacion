/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48;

/**
 *
 * @author Sala2
 */
//Hilo por 
public class JavaApplication48 extends Thread{

    private String Nombre;
    JavaApplication48(String Nombre)
    {
        this.Nombre = Nombre;
    }
    
    public void run()
    {
        try
        {
            int x = (int)(Math.random()*5000);
            Thread.sleep(x);
            System.out.println(Nombre + "," + x);
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication48 hilo1 = new JavaApplication48("Hilo 1");
        JavaApplication48 hilo2 = new JavaApplication48("Hilo 2");
        
        hilo1.start();
        hilo2.start();//Invoca al metoedo run
        try
        {
            hilo1.join();
            hilo2.join();
        }
        catch(Exception e)
        {
            
        }
        System.out.println("Adios");
    }
    
}
