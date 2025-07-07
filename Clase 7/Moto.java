public class Moto extends Vehiculo {
    private int cilindrada;

    Moto(int cilindrada, String patente, int año, String dueño){
        super(patente, año, dueño);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularImpuesto(){
        int impuesto = 0;

        if (this.cilindrada < 250){
            impuesto = 3000;
            
            
        }

        else if(this.cilindrada >= 250){
            impuesto = 6000;
            

        }

        return impuesto;
        

    }
    
}
    

