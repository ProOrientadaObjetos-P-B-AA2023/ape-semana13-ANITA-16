package paquete001;
import paquete002.Ciudad;
public class Persona {
    String nombre;
    String apellido;
    int edad;
    String cedula;
    public Ciudad ciudad;

    public Persona(String nombre, String apellido, int edad, String cedula, Ciudad ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.ciudad = ciudad;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", cedula='" + cedula + '\'' +
                ", ciudad=" + ciudad +
                '}';
    }
}
