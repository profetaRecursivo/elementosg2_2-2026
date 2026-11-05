package PrimerParcial.POO.EjercicioBiblioteca;

public class RevistaEspecializada extends Documento implements BuscablePorTitulo{
    private String nombre;
    private String volumen;
    private String areaExperticia;
    private Articulo[] articulos;
    
    public boolean coincideTitulo(String titulo){
        boolean coincide = false;
        for(Articulo art:articulos){
            if(art.getTitulo().equals(titulo)){
                coincide = true;
            }
        }
    }
}