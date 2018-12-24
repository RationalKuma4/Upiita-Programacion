package practicabiblioteca;

public class Libro extends Publicacion
{
    String autor;
    int cantidad;
    String ISBN;
    
    Libro(String aUTOR, int cANTIDAD, String iSBN ,String eDITOR, int fECHA, String tITUTLO)
    {
        super(eDITOR, fECHA, tITUTLO);
        this.autor = aUTOR;
        this.cantidad = cANTIDAD;
        this.ISBN = iSBN;
    }
    
    void PonerAutor(String aUTOR)
    {}
    
    void PonerISBN(String iSBN)
    {}
    
    void MostrarInfoLibros()
    {
        System.out.println("Informacion Libro");
        System.out.println("Autor: " + autor);
        System.out.println("Titulo: " + titulo);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Editor: " + editor);
        System.out.println("Fecha: " + fecha);
    }
    
    void PrestarLibro()
    {}
    
    void DevolverLibro()
    {}
}
