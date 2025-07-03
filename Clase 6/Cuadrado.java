class Cuadrado extends Figura{
    private float lado;
    
    Cuadrado(float lado){
        this.lado = lado;
    }

    @Override
    public void area(){
        float areaCuadrado = (this.lado*this.lado);

        System.out.println("El area del cuadrado es: " + areaCuadrado);

    }


    
}
