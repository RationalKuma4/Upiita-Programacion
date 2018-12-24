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
public class PracticaTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto produ[] = new Producto [5];
        produ[0]=new Producto(501, "Silla ejecutiva       ",999.00,3);
        produ[1]= new Producto(502, "Mesa de juntas       ",1500.00, 2);
        produ[2]= new Producto(503, "Paquete de plumas      ", 83.00, 10);
        produ[3]= new Producto(504, "Paquete hojas blancas  ", 96.3, 5);
        produ[4]= new Producto(505, "Paquete marca texto    ", 58.69, 5);
        
        System.out.println("Id     Nombre              Precio  Cantidad disp.");
        for(int i=0;i<=4; i++){
        System.out.print(produ[i].getId() + "  ");
        System.out.print(produ[i].getnombre() + "  ");
        System.out.print(produ[i].getprecio() + "         ");
        System.out.println(produ[i].getcanDips() + "");
        }
        System.out.println("\n\n");
       
        Empleado emp[] = new Empleado[3];
        emp[0]= new Empleado(100, "  Rosa Roja      ", 20, "  Vendedor");
        emp[1]= new Empleado(200, "  Lorenzo Choya  ", 22, "  Vendedor\n");
        
        for(int j=0;j<=4;j++){
            System.out.print(emp[j].getcodigo());
            System.out.print(emp[j].getnombre());
            System.out.print(emp[j].getedad());
            System.out.println(emp[j].getpuesto());
        }
        System.out.println("\n");
    }
    
}
