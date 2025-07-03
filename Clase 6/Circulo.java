class Circulo extends Figura {
    private float radio;


    Circulo(float radio){
        this.radio = radio;
    }

    @Override
    public void area(){
        float PI = 3.14f;
        float areaCirculo = PI * (this.radio * this.radio);

        System.out.println("El area del Circulo es: " + areaCirculo);
    }

}
