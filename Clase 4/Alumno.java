class Alumno {
    String nombre;
    String curso;
    float promedio;

    void saludar() {
        System.out.println(" Hola soy " + this.nombre + " y estoy en " + this.curso);
    }

    void mostrarPromedio(){
        System.out.println("Promedio: " + this.promedio );
    }

    void aumentarPromedio(float aumentable){
        this.promedio += aumentable;
    }
}
