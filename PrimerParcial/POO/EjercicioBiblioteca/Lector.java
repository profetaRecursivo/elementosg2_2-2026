package PrimerParcial.POO.EjercicioBiblioteca;
import java.util.ArrayList;


/**
 * Write a description of class Lector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lector
{
    private String nombre;
    private String id;
    private ArrayList<Documento> prestamos;
    
    
    public String getId(){
        return id;
    }
    
    public void agregarDocumento(Documento doc){
        prestamos.add(doc);
    }
}