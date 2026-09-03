package PrimerParcial.POO.EjercicioBiblioteca;
import java.util.ArrayList;

public class Biblioteca
{
    private ArrayList<Documento> documentos;
    private ArrayList<Lector> lectores;
    private ArrayList<Prestamo> prestamos;
    private ArrayList<Prestamo> devoluciones;

    public Biblioteca(){
        documentos = new ArrayList<Documento>();
        lectores = new ArrayList<>();
        prestamos = new ArrayList<>();
        devoluciones = new ArrayList<>();
    }

    public boolean realizarPrestamo(String codice, String id){
        boolean sepudo = false;
        Prestamo p = buscarDeuda(id);//null
        Documento doc = buscarDocumento(codice);
        Lector lector = buscarLector(id);
        if(p == null && doc != null && lector != null){
            if(doc.tieneEjemplares()){
                lector.agregarDocumento(doc);
                doc.quitarEjemplar();
                sepudo = true;
                registrarPrestamo(lector.getId(), doc.getCodice());
            }
        }
        return sepudo;
    }
    
    public boolean realizarDevolucion(String codice, String id){
        //verificar que el documento con codice exista
        //verificar que el lector exista
        //existe el prestamo
        //si todo eso se cumple
        //quitarle el prestamo al usuario (lector.erase(Documento))
        //doc.agregarEjemplar
        //borrar el prestamo de la lista de prestamos
        //agregar la devolucion a la lista de devoluciones
        return false;
    }
    
    private void registrarPrestamo(String id, String codice){
        Prestamo nuevoPrestamo = new Prestamo(codice, id);
        prestamos.add(nuevoPrestamo);
    }
    
    
    private Lector buscarLector(String id){
        Lector buscado = null;
        for(Lector lector:lectores){
            if(lector.getId().equals(id)){
                buscado = lector;
            }
        }
        return buscado;
    }
    private Prestamo buscarDeuda(String id){
        Prestamo buscado = null;
        for(Prestamo p:prestamos){
            if(p.getId().equals(id)){
                buscado = p;
            }
        }
        return buscado;
    }

    private Documento buscarDocumento(String codice){
        Documento buscado = null;
        for(Documento doc:documentos){
            if(doc.getCodice().equals(codice)){
                buscado = doc;
            }
        }
        return buscado;
    }

    
    public Documento buscarPorTitulo(String titulo){
        Documento buscado = null;
        for(Documento doc:documentos){
            if(doc instanceof BuscablePorTitulo){
                BuscablePorTitulo buscable = (BuscablePorTitulo)doc;
                if(buscable.coincideTitulo(titulo)){
                    buscado = doc;
                }
            }
        }
        return buscado;
    }
}