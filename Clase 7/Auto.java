public class Auto  extends Vehiculo{
    private int cantidadPuertas;

    Auto(int cantidadPuertas, String patente, int año, String dueño){
        super(patente, año, dueño);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public double calcularImpuesto(){
        
        int impuesto = 5000 + (500 * this.cantidadPuertas);
        return impuesto;
    }
    
}
