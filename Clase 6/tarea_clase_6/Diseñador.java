package tarea_clase_6;

public class Diseñador extends Empleado {

    private int diseños;
    
    Diseñador(String nombre, String apellido, int diseños){
        
        super(nombre, apellido, "Diseñador");
        this.diseños = diseños;
        
    }

    @Override
    public void trabajar(){
        System.out.println("El diseñador esta trabajando..." + "\n");
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Diseños: " + this.diseños + "\n");
    }


}
