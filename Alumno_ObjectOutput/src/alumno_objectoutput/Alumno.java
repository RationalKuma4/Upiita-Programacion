package alumno_objectoutput;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Alumno implements Serializable {

    String Nombre;
    String Boleta;
    int Semestre;
    float Promedio;

    Alumno(String Nombre, String Boleta, int semestre, float promedio) {
        this.Nombre = Nombre;
        this.Boleta = Boleta;
        this.Semestre = semestre;
        this.Promedio = promedio;
    }

    String getNombre() {
        return this.Nombre;
    }

    String getBoleta() {
        return this.Boleta;
    }

    int getSemestre() {
        return this.Semestre;
    }

    float getPromedio() {
        return this.Promedio;
    }

    void Almacenar_Alumno() {
        try {
            FileOutputStream fileStream = new FileOutputStream("..\\2Departamental\\Archivos\\ControlEscolar.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);  //Escribir en archivo
            os.writeObject(this);

            os.close();
        } catch (Exception ex) {
            System.err.println("Error al guardar el objeto");
        }

    }

}
