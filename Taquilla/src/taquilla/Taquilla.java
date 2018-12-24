package taquilla;

public class Taquilla
{
    public static void main(String[] args)
    {//int eVENTOID, String nOMBREEVENTO, String dESCRIPCION, int aSIENTOID, boolean cOMPRADO
        //Evento 1
        String circo = "Ven a disfrutar de una experiencia\r\nterrorífica en donde las peores\r\npesadillas se vuelven realidad.";
        Asientos circoLugares[] = new Asientos[10];
        for(int i = 0; i < circoLugares.length; i++)
            circoLugares[i] = new Asientos(1, "Circo Du Soleil", circo, i, false);
        
        //Evento 2
        String pony = "Para los pequeños de la casa, una \r\nobra que les divertirá de inicio a fin. \r\nNada mejor que compartir en familia un rato agradable.";
        Asientos ponyLugares[] = new Asientos[10];
        for(int i = 0; i < ponyLugares.length; i++)
            ponyLugares[i] = new Asientos(2, "My Little Pony", pony, i, false);
        
        VentanaInicio oVentanaInicio = new VentanaInicio();
        try
        {
            oVentanaInicio.RecibeAsientos(circoLugares, ponyLugares);
        }
        catch(Exception ex)
        {
            System.out.println("Pasando objetos");
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
        oVentanaInicio.setVisible(true);
    }    
}
