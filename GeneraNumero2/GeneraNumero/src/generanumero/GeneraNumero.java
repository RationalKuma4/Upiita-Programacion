package generanumero;
import java.util.Scanner;
import java.util.Random;

public class GeneraNumero
{
    int noSerie[] = new int[7];
    StringBuffer sbuffer = new StringBuffer();
    int cantidadLetras=0;
    int cantidadNumeros=0;
    
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
        String caracteres = "", letras="", numeros="";
        int tam=0;
        caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        numeros = "1234567890";
        int caracteresTam = caracteres.length();
        int letrasTam = letras.length();
        int numerosTam = numeros.length();
        
        do
        {
            boolean esLetra=false;
            boolean esNumero=false;
            double index = Math.random() * caracteresTam;
            char caracterIndex = caracteres.charAt((int) index);
                
            if(ValidarNumeroSerie(caracterIndex))
            {
                /*if(cantidadLetras<=3)
                {
                    double indexLetra = Math.random() * letrasTam;
                    char caracterIndexLetra = letras.charAt((int) indexLetra);
                    sbuffer.append(caracterIndexLetra);
                }
                else if(cantidadNumeros<=4)
                {
                    double indexNum = Math.random() * numerosTam;
                    char caracterIndexNum = numeros.charAt((int) indexNum);
                    sbuffer.append(caracterIndexNum);
                }*/
                if((int)caracterIndex>=65 && (int)caracterIndex<=90)
                {
                    cantidadLetras++;
                    esLetra=true;
                }
                else if((int)caracterIndex>=48 && (int)caracterIndex<=57)
                {
                    cantidadNumeros++;
                    esNumero=true;
                }
                
                if(cantidadLetras>=3)
                {
                    double indexNum = Math.random() * numerosTam;
                    caracterIndex = numeros.charAt((int) indexNum);
                }
                else if(cantidadNumeros>=4)
                {
                    double indexLetra = Math.random() * letrasTam;
                    caracterIndex = letras.charAt((int) indexLetra);
                }
                
                sbuffer.append(caracterIndex);
                tam++;
            }
        }
        while(tam<=6);
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
