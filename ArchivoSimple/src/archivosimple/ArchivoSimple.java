package archivosimple;

import java.io.*;

public class ArchivoSimple {

    String nombre;

    ArchivoSimple(String nombre) {
        this.nombre = nombre;
    }

    void Informacion_Archivo() {
        File f = new File(nombre);  //File object representa la ruta del archivo, no el contenido.
        if ((f.exists()) == true) {
            System.out.println("El archivo si existe");
            System.out.println("El archivo pesa" + f.length());
            System.out.println("El archivo tiene la siguiente ruta" + f.getPath());
            System.out.println("El archivo puede leerse: " + f.canRead());
            System.out.println("El archivo puede escribirse: " + f.canWrite());
        } else {
            System.out.println("Imposible no existe ese archivo " + nombre);
        }

    }

    ///////////////////////////////////////////// 
    void Leer_Archivo() {
        try {
            FileReader f = new FileReader(nombre);
            System.out.println(" - . - . - . - . - . - . -");

            BufferedReader entrada = new BufferedReader(f);

            while (entrada.ready()) {
                String next_line = entrada.readLine();

                System.out.println(next_line);
            }

            entrada.close();
        } catch (IOException e) {
            System.out.println("Captando excepcion");
        }

    }

    void Escribir_Archivo() {
        try {
            FileWriter escritura = new FileWriter(nombre, true);
            escritura.write("Estoy escribiendo en el archivo");
            escritura.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    void MostrarContenidoRuta() {
        File dir = new File("C:\\");  //Enlista todos los archivos contenidos en esta ruta
        dir.mkdir();

        if (dir.isDirectory()) {
            String[] dirContenido = dir.list();
            for (int i = 0; i < dirContenido.length; i++) {
                System.out.println(i + ".-" + dirContenido[i]);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArchivoSimple archi = new ArchivoSimple("C:\\Pruebas\\Interes.txt");
        System.out.println(" * * * * * * * * * * * * * * * * * * ");
        archi.Informacion_Archivo();
        System.out.println(" * * * * * * * * * * * * * * * * * * ");
        archi.Leer_Archivo();
        System.out.println(" * * * * * * * * * * * * * * * * * * ");
        archi.MostrarContenidoRuta();
        System.out.println(" * * * * * * * * * * * * * * * * * * ");/////
        archi.Escribir_Archivo();

    }
}
