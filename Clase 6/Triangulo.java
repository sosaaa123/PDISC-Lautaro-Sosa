class Triangulo extends Figura{
    private float base;
    private float altura;


    Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void area(){
        float areaTriangulo = (this.base*this.altura)/2;

        System.out.println("El area del triangulo  es: " + areaTriangulo);
    }

}
