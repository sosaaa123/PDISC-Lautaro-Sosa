package tarea_clase_6;

public class Empleado {

    private String nombre;
    private String apellido;
    private String rol;

    Empleado(String nombre, String apellido, String rol){
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
    }


    public void trabajar(){
        System.out.println("Trabajando...");
    }
    
    public void mostrarDatos(){

        System.out.println("Nombre: " + this.nombre + "\n" +
                           "Apellido: " + this.apellido +  "\n" +
                           "Rol: " + this.rol
        );

    }
}
