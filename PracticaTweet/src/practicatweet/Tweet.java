package practicatweet;

public class Tweet
{
    String usuario;
    String contenido;
    boolean esPublico;
    int favoritos;
    int retweet;
    
    Tweet(String uSUARIO, String cONTENIDO, boolean eSPUBLICO, int fAVORITOS, int rETWEET)
    {
        usuario = uSUARIO;
        contenido = cONTENIDO;
        esPublico = eSPUBLICO;
        favoritos = fAVORITOS;
        retweet = rETWEET;
    }
    
    void verContenido()
    {
        System.out.println("Usuario: "+ usuario);
        System.out.println("Publico: "+ (esPublico == false ? "No" : "Si"));
        System.out.println("Tweet: "+ contenido);
        System.out.println("Favoritos: "+ favoritos);
        System.out.println("Retweet: "+ retweet);
    }
    
    void validaContenido()
    {
        int tamano = contenido.length();
        if(tamano>120)
        {
            System.out.println("Tweet invalido, se recortara tu mensaje");
            String substring = contenido.substring(0, 120);
            setContenido(substring);
        }
        else
            System.out.println("Tweet valido");
    }
    
    void Retweet(Tweet oTweet)
    {
        System.out.println("Has retweeteado el siguiente tweet");
        oTweet.retweet = oTweet.retweet + 1;
        System.out.println("Usuario: "+oTweet.usuario);
        System.out.println(oTweet.contenido);
    }
    
    void Favorito(Tweet oTweet)
    {
        System.out.println("Has dado favorito al siguiente tweet");
        oTweet.favoritos = oTweet.favoritos + 1;
        System.out.println("Usuario: "+oTweet.usuario);
        System.out.println(oTweet.contenido);
    }
    
    void CambioEstatus(Tweet oTweet)
    {
        boolean estatusOriginal = oTweet.getesOublico();
        
        if(estatusOriginal)
            oTweet.setesOublico(false);
        else if(!estatusOriginal)
            oTweet.setesOublico(true);
        
        System.out.println("Has cambiado el estatus del siguiente tweet");
        System.out.println("Usuario: "+oTweet.usuario);
        System.out.println(oTweet.contenido);
    }
    
    String getUsuario()
    {
        return usuario;
    }
    
    String getContenido()
    {
        return contenido;
    }
    
    boolean getesOublico()
    {
        return esPublico;
    }
    
    int getRetweet()
    {
        return retweet;
    }

    int getFavoritos()
    {
        return favoritos;
    }

    
    void setUsuario(String uSUARIO)
    {
        usuario = uSUARIO;
    }
    
    void setContenido(String cONTENIDO)
    {
        contenido = cONTENIDO;
    }
    
    void setesOublico(boolean eSPUBLICO)
    {
        esPublico = eSPUBLICO;
    }
    
    void setRetweet(int rETWEET)
    {
        retweet = rETWEET;
    }

    void setFavoritos(int fAVORITOS)
    {
        favoritos = fAVORITOS;
    }
    
}
