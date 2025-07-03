package tarea_clase_6;

public class Programador extends Empleado {

     private int programas;
    
    Programador(String nombre, String apellido, int programas){
        
        super(nombre, apellido, "Programador");
        this.programas = programas;
        
    }

    @Override
    public void trabajar(){
        System.out.println("El programador esta trabajando..." + "\n");
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Programas: " + this.programas + "\n");
    }

    
}
