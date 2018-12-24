package taquilla;
import javazoom.jl.player.advanced.*;
import java.io.*;

public class Reprodutcor extends Thread
{
    String cancion;
    AdvancedPlayer reproductor;
    
    Reprodutcor()
    { }
    
    Reprodutcor(String nombre)
    {
        File archivo = new File("..\\Taquilla\\src\\Imagenes\\" + nombre + ".mp3");
        try
        {
            this.reproductor = new AdvancedPlayer(new FileInputStream(archivo));
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    public void Destruir()
    {
        
    }
    
    public void RecibeCancion(String nombre)
    {
        this.cancion = nombre;
    }
    
    public void DetenerCancion()
    {
        try
        {
            this.reproductor.close();
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    public void run()
    {
        try
        {
            reproductor.play();
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
