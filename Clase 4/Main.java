public class Main {
    public static void main(String[] args) {
        Alumno sosa = new Alumno();
        sosa.nombre = "Lautaro";
        sosa.curso = "7mo 5ta";
        sosa.promedio = 6.5f;
        sosa.mostrarPromedio();
        sosa.saludar();

        sosa.aumentarPromedio(1);
        sosa.mostrarPromedio();

    }
}

