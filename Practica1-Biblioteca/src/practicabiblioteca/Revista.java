package practicabiblioteca;

public class Revista extends Publicacion
{
    String circulacion;
    int numeroxanho;
    
    Revista(String cIRCULACION, int nUMEROXANHO, String eDITOR, int fECHA, String tITUTLO)
    {
        super(eDITOR, fECHA, tITUTLO);
        this.circulacion = cIRCULACION;
        this.numeroxanho = nUMEROXANHO;
    }
    
    void FijarCirculacion(int cIRCULACION)
    {}
    
    void NumeroxAnho(int nUMEROXANHO)
    {}
    
    void MostrarInfoRevista()
    {
        System.out.println("Informacion Revista");
        System.out.println("Titulo: " + titulo);
        System.out.println("Circulacion: " + circulacion);
        System.out.println("Numero Año: " + numeroxanho);
        System.out.println("Editor: " + editor);
        System.out.println("Fecha: " + fecha);
    }
}
