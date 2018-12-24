/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatienda;

/**
 *
 * @author Sala2
 */
public class Producto {
    int Id;
    String nombre;
    double precio;
    int canDisp;
    
    Producto(int x, String a, double y, int z)
    {
        Id= x;
        nombre= a;
        precio=y;
        canDisp=z;
    }
    
    int getId()
    {
        return Id;
    }
    
    String getnombre()
    {
        return nombre;
    }
    
    double getprecio()
    {
        return precio;
    }
    
    int getcanDips()
    {
        return canDisp;
    }
    
    
}

