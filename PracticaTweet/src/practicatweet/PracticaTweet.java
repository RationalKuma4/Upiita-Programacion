package practicatweet;
import java.util.Scanner;

public class PracticaTweet
{

    public static void main(String[] args)
    {
        Tweet tuit[] = new Tweet[4];
        tuit[0] = new Tweet("Jairo", "Nuevos programas de radio disponibes", true, 10 , 20);
        tuit[1] = new Tweet("Miyagi", "Nuevo sinvitados cada semana", true, 10 , 20);
        tuit[2] = new Tweet("Lalo", "sdvdfvdfvdfvdfvdfvfdvfdvfdvfdv", false, 10 , 20);
        tuit[3] = new Tweet("Beto", "Tutoriales todas las semanas y actualizacion de contenido previo cada mes. Recibiendo peticiones para nuevos temas456465465444444444444444444444444444444444444444444.", true, 10 , 20);
        
        Scanner lee = new Scanner(System.in);
        int opc=0;
        
        do
        {
            System.out.println("Menu");
            System.out.println("1. Validar Tweetws");
            System.out.println("2. Ver tweetts");
            System.out.println("3. Retwittear");
            System.out.println("4. Marcar como favorito");
            System.out.println("5. Cambiar estatus");
            System.out.println("6. Salir");
            opc = lee.nextInt();
            
            switch(opc)
            {
                case 1:
                    for(int i=0; i<tuit.length; i++)
                    {
                        tuit[i].validaContenido();
                    }
                    break;
                case 2:
                    for(int i=0; i<tuit.length; i++)
                    {
                        tuit[i].verContenido();
                    }
                    break;
                case 3:
                    for(int i=0; i<tuit.length; i++)
                    {
                        System.out.println(i+1+" "+tuit[i].getUsuario());
                        System.out.println(tuit[i].getContenido());
                    }
                    
                    System.out.println("Que tweet deseas Retwittear?");
                    int idtweet=lee.nextInt();
                    
                    tuit[idtweet-1].Retweet(tuit[idtweet-1]);
                    break;
                case 4:
                    for(int i=0; i<tuit.length; i++)
                    {
                        System.out.println(i+1+" "+tuit[i].getUsuario());
                        System.out.println(tuit[i].getContenido());
                    }
                    
                    System.out.println("Que tweet deseas marcar como favorito?");
                    int idtweetfav=lee.nextInt();
                    
                    tuit[idtweetfav-1].Favorito(tuit[idtweetfav-1]);
                    break;
                case 5:
                    for(int i=0; i<tuit.length; i++)
                    {
                        System.out.println(i+1+" "+tuit[i].getUsuario());
                        System.out.println(tuit[i].getContenido());
                    }
                    
                    System.out.println("Que tweet deseas cambiar el estatus?");
                    int idtweetest=lee.nextInt();
                    
                    tuit[idtweetest-1].CambioEstatus(tuit[idtweetest-1]);
                    
                    break;
                case 6:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;
            }
        }
        while(opc<6);
    }
    
}
