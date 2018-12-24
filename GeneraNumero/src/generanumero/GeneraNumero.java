package generanumero;
import java.util.Scanner;
import java.util.Random;

public class GeneraNumero
{
    int noSerie[] = new int[7];
    StringBuffer sbuffer = new StringBuffer();
    
    GeneraNumero()
    {
        for(int i=0; i<noSerie.length; i++)
        {
            noSerie[i]=0;
        }
        sbuffer.append("");
    }
    
    public void generaNumeroSerie()
    {
        String caracteres = "", numeros = "";
        int tam=0;
        caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int caracteresTam = caracteres.length();
        
        do
        {
            double index = Math.random() * caracteresTam;
            char caracterIndex = caracteres.charAt((int) index);
                
            if(ValidarNumeroSerie(caracterIndex))
            {
                sbuffer.append(caracterIndex);
                tam++;
            }
        }
        while(tam<=7);
    }
    
    public boolean ValidarNumeroSerie(char caracterElegido)
    {
        boolean esValido=true;
        char validaSerie[] = new char[7];
        validaSerie = sbuffer.toString().toCharArray();
        
        for(int i=0; i<validaSerie.length; i++)
        {
            if(caracterElegido==validaSerie[i])
            {
                esValido=false;
                break;
            }
        }
        return esValido;
    }
    
    public void MostarNumeroSerie()
    {
        generaNumeroSerie();
        System.out.println(sbuffer);
    }
    
    public static void main(String[] args) 
    {
        GeneraNumero oGeneraNumero = new GeneraNumero();
        oGeneraNumero.MostarNumeroSerie();
    }  
}
