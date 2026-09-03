package PrimerParcial.POO.EjercicioBiblioteca;
public class Documento
{
    private String codice;
    private int ejemplaresDisponibles;
    
    
    
    public String getCodice(){
        return codice;
    }
    
    public boolean tieneEjemplares(){
        return ejemplaresDisponibles > 0;
    }
}