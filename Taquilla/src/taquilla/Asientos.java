package taquilla;

public class Asientos extends Evento
{
    int asientoid;
    boolean estaComprado;
    
    
    Asientos(int eVENTOID, String nOMBREEVENTO, String dESCRIPCION, int aSIENTOID, boolean cOMPRADO)
    {
        super(eVENTOID, nOMBREEVENTO, dESCRIPCION);
        this.asientoid = aSIENTOID;
        this.estaComprado = cOMPRADO;
    }
}
