package theoffice;
import java.util.Scanner;

public class TheOffice 
{
    public void MenuAdminstrador(Empleado oEmpleado[], Producto oProducto[])
    {
        Administrador Admin = new Administrador(35, 13579, "Super_Admin");
        Scanner lee = new Scanner(System.in);
        int opA=0;
        do
        {
            System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
            System.out.println("Menu Administrador");
            System.out.println("1. Ver Informacion Empleado");
            System.out.println("2. Ver Informacion producto");
            System.out.println("3. Ver Inventario");
            System.out.println("4. Ver Ganancias");
            System.out.println("5. Sair;");
            opA=lee.nextInt();
            switch(opA)
            {
                case 1:
                    for(int i=0; i<oEmpleado.length; i++)
                    {
                        System.out.println("------------------------------");
                        Admin.VerInformacionEmpleado(oEmpleado[i]);
                    }  
                    break;
                case 2:
                    for(int i=0; i<oProducto.length; i++)
                    {
                        System.out.println("------------------------------");
                        Admin.VerInformacionProducto(oProducto[i]);
                    }  
                    break;
                case 3:
                    for(int i=0; i<oProducto.length; i++)
                    {
                        System.out.println("------------------------------");
                        Admin.VerInventario(oProducto[i]);
                    } 
                    break;
                case 4:
                    for(int i=0; i<oEmpleado.length; i++)
                    {
                        System.out.println("------------------------------");
                        Admin.VerGanancias(oEmpleado[i]);
                    }
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;
            }
        }
        while(opA<5);
    }
    public void MenuVendedor(Empleado oEmpleado, Producto oProducto[])
    {
        Scanner lee = new Scanner(System.in);
        
        int opV=0;
        do
        {
            System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
            System.out.println("Empleado: "+oEmpleado.getCodigo()+" "+oEmpleado.getNombreEmpleado());
            System.out.println("Menu Empleado");
            System.out.println("1. Ver Informacion Personal");
            System.out.println("2. Ver datos producto");
            System.out.println("3. Vender");
            System.out.println("4. Sair;");
            opV=lee.nextInt();
            switch(opV)
            {
                case 1:
                    System.out.println("------------------------------");
                    oEmpleado.VerInformacionPersonal();
                    break;
                case 2:
                    for(int i=0; i<oProducto.length; i++)
                    {
                        System.out.println("------------------------------");
                        oEmpleado.VerDatosProducto(oProducto[i]);
                    }
                    break;
                case 3:
                    oEmpleado.Vender(oProducto, oEmpleado);
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;
            }
        }
        while(opV<4);
    }
    
    public int ValidaVendedor(int _valorIngresado, Empleado oEmpleado[])
    {
        int indice=-1;
        for(int i=0; i<oEmpleado.length; i++)
        {
            if(oEmpleado[i].getCodigo()==_valorIngresado)
            {
                indice=i;
                break;
            }
        }
        return indice;
    }
    
    public static void main(String[] args) 
    {
        TheOffice Menu = new TheOffice();
        Scanner lee = new Scanner(System.in);
        
        Tienda oTienda = new Tienda("UPIITA", "CAE Office");
        
        Empleado oEmpleado[] = new Empleado[2];
        oEmpleado[0] = new Empleado(100, 20, "Rosa Roja", "Vendedor", 0);
        oEmpleado[1] = new Empleado(200, 22, "Lorenzo Choya", "Vendedor", 0);
        
        Producto oProducto[] = new  Producto[5];
        oProducto[0] = new Producto(501, "Silla ejecutiva", 999.00, 3);
        oProducto[1] = new Producto(502, "Mesa de Juntas", 1500.00, 2);
        oProducto[2] = new Producto(503, "Paquete de plumas", 83.00, 10);
        oProducto[3] = new Producto(504, "Paquete de hojas blancas", 96.30, 5);
        oProducto[4] = new Producto(505, "Paquete marca texto", 58.69, 5);
        
        int op=0;
        do
        {
           System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
           oTienda.ImprimirTienda();
           System.out.println("Bienvenido");
           System.out.println("Menu");
           System.out.println("1. Administrador");
           System.out.println("2. Vendedor");
           System.out.println("3. Salir");
           
           op=lee.nextInt();
           switch(op)
           {
               case 1:
                   Menu.MenuAdminstrador(oEmpleado, oProducto);
                   break;
               case 2:
                   int idEmpleado=0;
                   System.out.println("Ingrese su id");
                   idEmpleado=lee.nextInt();
                   
                   int indice = Menu.ValidaVendedor(idEmpleado ,oEmpleado);
                   if(indice>=0)
                   {
                      Menu.MenuVendedor(oEmpleado[indice], oProducto); 
                   }
                   else
                   {
                       System.out.println("Codigo incorrecto o invalido");
                   }
                   break;
               case 3:
                   System.out.println("Salir");
                   break;
               default:
                   System.out.println("Opcion no disponible");
                   break;
           }
        }
        while(op<3);
    }
}
