public abstract class Vehiculo {
    private String patente;
    private int año;
    private String dueño;

    
    Vehiculo(String patente, int año, String dueño){

        this.patente = patente;
        this.año  = año;
        this.dueño = dueño;


    }

    public abstract double calcularImpuesto();

    public void mostrarDatos(){
        System.out.println("Patente: " + this.patente + "\n" +
                            "Año: " + this.año + "\n" +
                            "Dueño: " + this.dueño);
    }



}
