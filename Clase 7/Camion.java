public class Camion  extends Vehiculo{
    private int cargaMaxima;

    Camion(int cargaMaxima, String patente, int año, String dueño){
        super(patente, año, dueño);
        this.cargaMaxima = cargaMaxima;
        
    }

    @Override
    public double calcularImpuesto(){

        int impuesto = 8000 + (100 * this.cargaMaxima);
        
        return impuesto;
        
    }
    
}
    

