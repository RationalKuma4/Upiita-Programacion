package practicabiblioteca;

public class Biblioteca
{
    String direccion;
    String encargado;
    int NoBiblioteca;
    String NombreBiblioteca;
    
    Biblioteca()
    { }
    
    Biblioteca(String dIRECCION ,String eNCARGADO, int nOBIBLIOTECA, String nOMBREBILBIOTECA)
    {
        this.direccion = dIRECCION;
        this.encargado = eNCARGADO;
        this.NoBiblioteca = nOBIBLIOTECA;
        this.NombreBiblioteca = nOMBREBILBIOTECA;
    }
    
    void MostrarInfoBiblioteca()
    {
        System.out.println("Direccion: " + direccion);
        System.out.println("Encargado: " + encargado);
        System.out.println("No Biblioteca: " + NoBiblioteca);
        System.out.println("Nombre: " + NombreBiblioteca);
    }
}
