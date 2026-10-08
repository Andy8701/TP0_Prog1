public class App {
    public static void main(String[] args) {
        // Forma 1: constructor sin parámetros y asignación posterior
        Estudiante e1 = new Estudiante();
        e1.nombre = "Lucía";
        e1.apellido = "Gómez";
        e1.edad = 20;
        e1.carrera = "Ingeniería en Sistemas";
        e1.promedio = 8.5;

        Estudiante e2 = new Estudiante();
        e2.nombre = "Martín";
        e2.apellido = "Pérez";
        e2.edad = 22;
        e2.carrera = "Licenciatura en Informática";
        e2.promedio = 7.2;

        // Forma 2: constructor con parámetros
        Estudiante e3 = new Estudiante("Sofía", "Ramírez", 21, "Analista de Sistemas", 9.1);

        // Arreglo de Estudiante
        Estudiante[] estudiantes = {e1, e2, e3};

        // Recorrer e imprimir con el operador punto
        for (Estudiante e : estudiantes) {
            System.out.println(e.nombre + " - Promedio: " + e.promedio);
        }
    }
}