# Trabajo Práctico 0 – Introducción a la POO con Java

**Alumno:** Saires Andrés
**Materia:** Programación Orientada a Objetos
**Lenguaje:** Java (JDK 17) – Visual Studio Code

---

## 1. Configuración del entorno de trabajo

1. Instalé **Visual Studio Code** desde la página oficial: https://code.visualstudio.com/Download
2. Instalé el **JDK 17** (versión LTS recomendada).
3. En VS Code instalé la extensión **Extension Pack for Java**, que permite crear, ejecutar y depurar proyectos Java.

## 2. Creación del primer proyecto

1. Abrí VS Code y presioné `Ctrl + Shift + P`.
2. Escribí **Java: Create Java Project**.
3. Seleccioné **No build tools** (proyecto simple).
4. Elegí la carpeta de destino y el nombre del proyecto.
5. Se creó la carpeta `src` con la clase `App.java`, que es el punto de entrada (`main`).
6. Creé el archivo `Estudiante.java` para definir mi propia clase.

---

## 3. Conceptos clave

### ¿Qué es la POO?
La **Programación Orientada a Objetos** es un paradigma que organiza el código en **objetos**. Cada objeto agrupa datos (**atributos**) y comportamientos (**métodos**). Permite modelar entidades del mundo real de forma natural. Por ejemplo, en un sistema académico, una *Materia* puede ser un objeto con nombre, código y créditos, y con acciones como agregar un estudiante.

### Clase
Es una **plantilla o molde** que define cómo son los objetos de un mismo tipo. En ella se declaran:

- **Atributos:** características del objeto (nombre, edad, código).
- **Métodos:** acciones que puede realizar (calcular promedio, mostrar datos).

```java
public class Materia {
    String nombre;
    String codigo;
    int creditos;
}
```

### Objeto
Es una **instancia concreta** de una clase. Cada objeto tiene sus propios valores para los atributos.

```java
Materia matematicas = new Materia();
matematicas.nombre = "Matemáticas";
matematicas.codigo = "MAT101";
matematicas.creditos = 4;
```

La **clase** es el molde y el **objeto** es lo que se fabrica con ese molde.

### Instanciación y constructor
- **Instanciar** es crear un objeto a partir de una clase con la palabra clave `new`.
- Toda clase tiene un **constructor predeterminado** (sin parámetros) que Java agrega automáticamente si no se define otro. Permite crear el objeto pero no inicializa nada especial.

```java
Materia historia = new Materia();
```

### Constructor definido por el programador
Permite inicializar los atributos al momento de crear el objeto.

```java
public Materia(String nombre, String codigo, int creditos) {
    this.nombre = nombre;
    this.codigo = codigo;
    this.creditos = creditos;
}

Materia matematicas = new Materia("Matemáticas", "MAT101", 4);
```

> Cuando se define un constructor con parámetros, Java **deja de generar** el constructor predeterminado. Por eso, si se quiere usar también el constructor sin parámetros, hay que declararlo explícitamente.

### La palabra clave `this`
Hace referencia al **objeto actual**. Se usa para diferenciar los atributos de la clase de los parámetros del constructor cuando tienen el mismo nombre:

```java
this.nombre = nombre; // this.nombre es el atributo; nombre es el parámetro
```

### Atributos del objeto
Son las características que describen al objeto. En `Materia`: `nombre`, `codigo` y `creditos`. Cada objeto guarda sus propios valores.

### Operador punto (`.`)
Se usa para acceder a los atributos y métodos de un objeto:

```java
System.out.println(matematicas.nombre);
System.out.println(matematicas.creditos);
```

---

## 4. Clase `Estudiante`

Atributos pedidos: `nombre`, `apellido`, `edad`, `carrera` y `promedio`. Incluye un constructor sin parámetros y uno con parámetros que inicializa todos los atributos usando `this`.

**Archivo `Estudiante.java`**

```java
public class Estudiante {
    String nombre;
    String apellido;
    int edad;
    String carrera;
    double promedio;

    // Constructor sin parámetros
    public Estudiante() {
    }

    // Constructor con parámetros
    public Estudiante(String nombre, String apellido, int edad, String carrera, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }
}
```

---

## 5. Programa principal

En el `main` se crean 4 estudiantes de ambas formas:

- **Con el constructor sin parámetros**, asignando los atributos después con el operador punto.
- **Con el constructor con parámetros**, pasando los valores al crear el objeto.

Luego se guardan en un arreglo y se recorre para mostrar el nombre y el promedio de cada uno.

**Archivo `App.java`**

```java
public class App {
    public static void main(String[] args) {

        // Forma 1: constructor sin parámetros + asignación posterior
        Estudiante e1 = new Estudiante();
        e1.nombre = "Ana";
        e1.apellido = "Gómez";
        e1.edad = 20;
        e1.carrera = "Sistemas";
        e1.promedio = 8.5;

        Estudiante e2 = new Estudiante();
        e2.nombre = "Luis";
        e2.apellido = "Pérez";
        e2.edad = 21;
        e2.carrera = "Sistemas";
        e2.promedio = 6.0;

        // Forma 2: constructor con parámetros
        Estudiante e3 = new Estudiante("María", "Díaz", 19, "Informática", 9.2);
        Estudiante e4 = new Estudiante("Carlos", "Ruiz", 22, "Informática", 4.5);

        // Arreglo de estudiantes
        Estudiante[] estudiantes = { e1, e2, e3, e4 };

        // Recorrido e impresión con el operador punto
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i].nombre + " - Promedio: " + estudiantes[i].promedio);
        }
    }
}
```

### Salida esperada

```
Ana - Promedio: 8.5
Luis - Promedio: 6.0
María - Promedio: 9.2
Carlos - Promedio: 4.5
```

---

## 6. Conclusiones

- Una **clase** define la estructura y el comportamiento; un **objeto** es una instancia concreta con valores propios.
- Los **constructores** permiten crear objetos ya inicializados, y `this` evita ambigüedades entre atributos y parámetros.
- El **operador punto** es la forma de acceder a los atributos y métodos de cada objeto.
- Guardar objetos en un **arreglo** permite recorrerlos y procesarlos con un `for`.
