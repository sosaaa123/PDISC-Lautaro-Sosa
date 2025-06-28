public class Pelicula {
    private String titulo;
    private String director;
    private int duracion;

    Pelicula(String titulo, String director, int duracion){

        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;

    }

    Pelicula(String titulo, String director){

        this.titulo = titulo;
        this.director = director;
        
    }

    Pelicula(){
        this.titulo = "No definido";
        this.director = "No definido";
    }

    void verInfo(){
        System.out.println("Titulo: " + this.titulo + "\n" + "Director: " + this.director + "\n" + "Duracion: " + this.duracion + " mins" + "\n");
    }
    
}