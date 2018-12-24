package proyectoevaluadorcomentarios;

public interface IArchivos
{
    public void AlmacenarEstablecimiento(String ruta, Establecimiento establecimiento[]);
    public Establecimiento[] LeerEstablecimiento(String ruta);
    public void AlmacenarCalificador(String ruta, Administrador oCalificador[]);
    public Administrador[] LeerCalificador(String ruta);
    public void AlmacenarDiccionario(String ruta, Diccionario oDiccionario[]);
    public Diccionario[] LeerDiccionario(String ruta);
    public void AlmacenarProveedorComentarios(String ruta, EvaluadorComentarios oProveedorComentarios[]);
    public EvaluadorComentarios[] LeerProveedorComentarios(String ruta);
    public void AlmacenarComentario(String ruta, Comentario oComentario[]);
    public Comentario[] LeerComentario(String ruta);
}
