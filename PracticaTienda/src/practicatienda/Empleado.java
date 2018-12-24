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
public class Empleado {
    int codigo;
    String nombre;
    int edad;
    String puesto;
    
    
    Empleado(int x, String a, int y, String b )
    {
        codigo=x;
        nombre=a;
        edad=y;
        puesto=b;
    }
    
    int getcodigo()
    {
        return codigo;
    }
    
    String getnombre()
    {
        return nombre;
    }
    
    int getedad()
    {
        return edad;
    }
    
    String getpuesto()
    {
        return puesto;
    }
    
}
