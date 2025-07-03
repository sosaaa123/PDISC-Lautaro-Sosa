public class Main {
    public static void main(String[] args){
        
        Figura circulo1 =  new Circulo(12);
        Figura cuadrado1 = new Cuadrado(12);
        Figura triangulo1 = new Triangulo(12,12);

        Figura figuras[] = new Figura[3];

        figuras[0] = circulo1;
        figuras[1] = cuadrado1;
        figuras[2] = triangulo1;

        for(Figura figura: figuras){
            figura.area();
        }

    }
    
}