package practicabanco;

public class Cuenta 
{
    int clienteid;
    double saldo;
    String saldoS;
    
    Cuenta()
    { }
    
    Cuenta(int cLIENTEID, double sALDO, String sALDOS)
    {
        this.clienteid = cLIENTEID;
        this.saldo = sALDO;
        this.saldoS = sALDOS;
    }
    
    int getClienteid()
    {
        return clienteid;
    }
    
    double getSaldoInicial()
    {
        return saldo;
    }
}
