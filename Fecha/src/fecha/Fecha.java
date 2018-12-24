package fecha;
import java.util.Scanner;

public class Fecha 
{
    //Atributos de la clase
    int Dia;
    int Mes;
    int Ahno;
    
    //Fucnion Constructura
    Fecha()
    {
        Dia=0;
        Mes=0;
        Ahno=0;
    }
    
    //Metodos de Acceso: Asignacion
    void setDia(int _dia)
    {
        Dia=_dia;
    }
    
    void setMes(int _mes)
    {
        Mes=_mes;
    }
    
    void setAhno(int _ahno)
    {
        Ahno=_ahno;
    }
    
    //Metodos de acceso: Retorno
    int getDia()
    {
        return Dia;
    }
    
    int getMes()
    {
        return Mes;
    }
    
    int getAhno()
    {
        return Ahno;
    }
    
    void ConvertirMesLetra()
    {
        System.out.println("Convirtiendo el numero del mes a letra");
        switch(Mes)
        {
            case 1:
                System.out.println("El mes es Enero");
                break;
            case 2:
                System.out.println("El mes es Febrero");
                break;
            case 3:
                System.out.println("El mes es Marzo");
                break;
            case 4:
                System.out.println("El mes es Abril");
                break;
            case 5:
                System.out.println("El mes es Mayo");
                break;
            case 6:
                System.out.println("El mes es Junio");
                break;
            case 7:
                System.out.println("El mes es Julio");
                break;
            case 8:
                System.out.println("El mes es Agosto");
                break;
            case 9:
                System.out.println("El mes es Septiembre");
                break;
            case 10:
                System.out.println("El mes es Octubre");
                break;
            case 11:
                System.out.println("El mes es Noviembre");
                break;
            case 12:
                System.out.println("El mes es Diciembre");
                break;
            default:
                System.out.println("Mes no valido");
                break;
        }
    }
    
    void ValidaMes()
    {
        if(1<=Mes && Mes<=12)
        {
            System.out.println("Mes Valido");
        }
        else
        {
            System.out.println("Mes Incorrecto");
        }
    }
    
    void AhnoBisiesto()
    {
        if((Ahno%4==0) && ((Ahno%100 != 0) || (Ahno%400==0)))
        {
            System.out.println("El año es bisiesto");
        }
        else
        {
            System.out.println("El año no es bisiesto");
        }
    }
    
    void DiasTrancurridos()
    {
        int diasTotal=0, diasTotales=0;
        for(int i=0; i<Mes; i++)
        {
            switch(i)
            {
                case 1:
                    diasTotal=diasTotal+31;
                    break;
                case 2:
                    diasTotal=diasTotal+28;
                    break;
                case 3:
                    diasTotal=diasTotal+31;
                    break;
                case 4:
                    diasTotal=diasTotal+30;
                    break;
                case 5:
                    diasTotal=diasTotal+31;
                    break;
                case 6:
                    diasTotal=diasTotal+30;
                    break;
                case 7:
                    diasTotal=diasTotal+31;
                    break;
                case 8:
                    diasTotal=diasTotal+31;
                    break;
                case 9:
                    diasTotal=diasTotal+30;
                    break;
                case 10:
                    diasTotal=diasTotal+31;
                    break;
                case 11:
                    diasTotal=diasTotal+30;
                    break;
                case 12:
                    diasTotal=diasTotal+31;
                    break;
            }
            diasTotales=diasTotal+Dia;
        }
        System.out.println("Dias trancurridos: "+diasTotales);
    }
    
    public static void main(String[] args) 
    {
        int dia=0, mes=0, ahno=0;
        //Creacion del obejto y se invoca a la funcion constructora
        Fecha oFecha = new Fecha();
        Scanner lee = new Scanner(System.in);
  
        System.out.println("Escribe la fecha");
        System.out.println("Dia");
        dia=lee.nextInt();
        System.out.println("Mes");
        mes=lee.nextInt();
        System.out.println("Año");
        ahno=lee.nextInt();
        
        oFecha.setDia(dia);
        oFecha.setMes(mes);
        oFecha.setAhno(ahno);
        
        System.out.println("La fecha es: " +oFecha.getDia()+ "/"+oFecha.getMes()+"/"+oFecha.getAhno());
        oFecha.ValidaMes();
        oFecha.ConvertirMesLetra();
        oFecha.DiasTrancurridos();
        oFecha.AhnoBisiesto();
    }
}
