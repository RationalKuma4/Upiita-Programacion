package practicabiblioteca;
import java.util.Scanner;

public class PracticaBiblioteca 
{
    public static void main(String[] args)
    {
        int opc = 0, _libroid = 0;
        Scanner lee = new Scanner(System.in);
        PracticaBiblioteca Menu = new PracticaBiblioteca();
        Biblioteca oBiblioteca = new Biblioteca("Eje 1 Norte Mosqueta s/n esq. Aldama, Col Buenavista, Del Cuahtemocm Mexico D.F., CP 06350", "Daniel Goldin Halfon", 1001, "Jose Vanconcelos");
        
        Libro oLibros[] = new Libro[3];
        oLibros[0] = new Libro("Reyes Fernando", 10, "6077075485", "lfaomega Grupo Editor", 2013, "Mecatrónica - Control y automatización");
        oLibros[1] = new Libro("Rubén Robles Basurto", 7, "B00F7OU1F8", "Kindle edition", 2014, "Técnicas de Memoria Veloz");
        oLibros[2] = new Libro("David García Hernán", 5, "B00GMIKHCU", "Punto de vista editores", 2013, "Historia Universal. XXI capítulos fundamentales");
        
        Revista oRevistas[] = new Revista[2];
        oRevistas[0] = new Revista("152-3", 12, "National Geographic", 2015, "Society");
        oRevistas[1] = new Revista("187-9", 10, "YoPublico", 2015, "Revista J");
        
        do
        {
            System.out.println("Menu");
            System.out.println("1. Mostrar Informacion");
            System.out.println("2. Pedir Prestado un Libro");
            System.out.println("3. Devolver Libro");
            System.out.println("4. Salir");
            opc = lee.nextInt();
            switch(opc)
            {
                case 1:
                    Menu.MenuMuestraInfo(oBiblioteca, oLibros, oRevistas);
                    break;
                case 2:
                    for (Libro libros : oLibros)
                    {
                        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
                        libros.MostrarInfoLibros();
                    }
                    
                    System.out.println("Que libro deseas pedir prestado");
                    _libroid = lee.nextInt();
                    oLibros[_libroid - 1].PrestarLibro();
                    break;
                case 3:
                    for (Libro libros : oLibros)
                    {
                        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
                        libros.MostrarInfoLibros();
                    }
                    
                    System.out.println("Que libro deseas devolver");
                    _libroid = lee.nextInt();
                    oLibros[_libroid - 1].DevolverLibro();
                    break;
                default:
                    break; 
            }
        }while(opc<4);
    }
    
    void MenuMuestraInfo(Biblioteca oBiblioteca, Libro oLibros[], Revista Revistas[])
    {
        int opcI = 0;
        Scanner lee = new Scanner(System.in);
        
        do
        {
        System.out.println("Menu");
        System.out.println("1. Mostrar Informacion Biblioteca");
        System.out.println("2. Mostrar Informacion Libros");
        System.out.println("3. Mostrar Informacion Revista");
        System.out.println("4. Salir");
        opcI = lee.nextInt();
        switch(opcI)
        {
            case 1:
                oBiblioteca.MostrarInfoBiblioteca();
                break;
            case 2:
                for (Libro libros : oLibros)
                {
                    System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
                    libros.MostrarInfoLibros();
                }
                break;
            case 3:
                for(Revista revista : Revistas)
                {
                    System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
                    revista.MostrarInfoRevista();
                }
                break;
            default:
                System.out.println("Saliendo...");
                break; 
        }
        }while(opcI<4);
    }
}
