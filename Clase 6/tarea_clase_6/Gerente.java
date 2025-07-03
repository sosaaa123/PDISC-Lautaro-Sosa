package tarea_clase_6;

public class Gerente extends Empleado {

     private int gerencias;
    
    Gerente(String nombre, String apellido, int gerencias){
        
        super(nombre, apellido, "Diseñador");
        this.gerencias = gerencias;
        
    }

    @Override
    public void trabajar(){
        System.out.println("El gerente esta trabajando..." + "\n");
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Gerencias: " + this.gerencias + "\n");
    }

}
