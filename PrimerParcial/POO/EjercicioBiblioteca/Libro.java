package PrimerParcial.POO.EjercicioBiblioteca;

public class Libro extends Documento implements BuscablePorTitulo
{
    private String titulo;
    private String editorial;
    private String autor;
    private String anioEdicion;
    
    
    public boolean coincideTitulo(String titulo){
        boolean coincide;
        coincide = this.titulo.equals(titulo);
        return coincide;
    }
}