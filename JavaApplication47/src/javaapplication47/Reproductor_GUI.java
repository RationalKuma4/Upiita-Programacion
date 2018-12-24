package javaapplication47;
import javazoom.jl.player.advanced.*;
import java.io.*;

public class Reproductor_GUI extends Thread
{
    AdvancedPlayer reproductor;
    
    Reproductor_GUI()
    {
        File archivo = new File("..\\JavaApplication47\\src\\starman.mp3");
        try
        {
            reproductor = new AdvancedPlayer(new FileInputStream(archivo));
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
