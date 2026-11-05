package PrimerParcial.POO.EjercicioBiblioteca;
public class Prestamo
{
    private String codice;
    private String id;
    
    public Prestamo(String codice, String id){
        this.codice = codice;
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
        
    
}