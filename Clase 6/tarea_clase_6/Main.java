package tarea_clase_6;

public class Main {
    
    public static void main(String[] args) {

        Empleado diseñador1 = new Diseñador("Jaun", "Spinoza", 12);
        Empleado gerente1 = new Gerente("Guillermo", "Voltaire", 3);
        Empleado programador1 = new Programador("Lucio", "Samosata", 5);

        Empleado empleados[] = new Empleado[3];

        empleados[0] = diseñador1;
        empleados[1] = gerente1;
        empleados[2] = programador1;

        for(Empleado empleado : empleados){
            empleado.mostrarDatos();
            empleado.trabajar();
        }

        }
    
}
