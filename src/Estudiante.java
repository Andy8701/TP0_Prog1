public class Estudiante {
    // Atributos
    String nombre;
    String apellido;
    int edad;
    String carrera;
    double promedio;

    // Constructor sin parámetros
    public Estudiante() {
    }

    // Constructor con parámetros: this distingue el atributo del parámetro
    public Estudiante(String nombre, String apellido, int edad, String carrera, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }
}