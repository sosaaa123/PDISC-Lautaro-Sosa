public class Main {
    public static void main(String[] args) {
        Vehiculo moto1 = new Moto(300, "AB345CD45", 2014 ,"Mateo");
        Vehiculo auto1 = new Auto(4, "DJ3455FD", 2020, "Maria");
        Vehiculo camion1 = new Camion(300, "S2334LOPM", 2021, "Antonella");

        Vehiculo vehiculos[] = new Vehiculo[3];
        vehiculos[0] = moto1;
        vehiculos[1] = auto1;
        vehiculos[2] = camion1;

        for(Vehiculo vehiculo: vehiculos){
            vehiculo.mostrarDatos();
            double impuesto = vehiculo.calcularImpuesto();

            System.out.println("Su impuesto impuesto es de $" + impuesto);
            System.out.println("\n");

        }


    }
    
}