package practicabiblioteca;

public abstract class Publicacion 
{
    String editor;
    int fecha;
    String titulo;
    
    Publicacion(String eDITOR, int fECHA, String tITUTLO)
    {
        this.editor = eDITOR;
        this.fecha = fECHA;
        this.titulo = tITUTLO;
    }
    
    void NombrarEditos(String nOMBRE_EDITOR)
    {}
    
    void PonerFecha(int fECHA)
    {}
}
