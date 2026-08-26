package PrimerParcial.POO.ExamenRepasoPOO;
import java.util.ArrayList;

public class Usuario
{
    private String codigo;
    private int totalMonedas;
    private int pasosDiarios;
    private boolean ganoRecompensa;
    private ArrayList<String> recompensas;
    
    public Usuario(String codigo){
        this.codigo = codigo;
        totalMonedas = 0;
        pasosDiarios = 0;
        ganoRecompensa = false;
        recompensas = new ArrayList<String>();
    }
    
    public boolean ganoRecompensa(){
        return ganoRecompensa;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String registrarPasos(int pasos){
        String calificacion;
        pasosDiarios+=pasos;
        calificacion = obtenerCalificacion();
        return calificacion;
    }
    
    private String obtenerCalificacion(){
        String calificacion;
        if(pasosDiarios < 5000){
            calificacion = "Sedentario";
        }else if(5000 <= pasosDiarios && pasosDiarios <= 7499){
            calificacion = "Poco Activo";
        }else if(7500 <= pasosDiarios && pasosDiarios <= 9999){
            calificacion = "Algo Activo";
        }else if(10000 <= pasosDiarios && pasosDiarios <= 12499){
            calificacion = "Activo";
        }else{
            calificacion = "Muy Activo";
        }
        return calificacion;
    }
    
    //este metodo
    //se llama cuando sucede el cambio de mes
    public void resetear(){
        totalMonedas = 0;
        pasosDiarios = 0;
        ganoRecompensa = false;
    }

    public String canjearPasos(){
        String mensaje;
        if(pasosDiarios < 5000){
            mensaje = "Alto riesgo de enfermedades metabolicas y cardiovasculares";
        }else if(5000 <= pasosDiarios && pasosDiarios <= 7499){
            mensaje = "0 monedas virtuales";            
        }else if(7500 <= pasosDiarios && pasosDiarios <= 9999){
            totalMonedas+=10;
            mensaje = "10 monedas virtuales";
        }else if(10000 <= pasosDiarios && pasosDiarios <= 12499){
            totalMonedas+=100;
            mensaje = "100 monedas virtuales"; 
        }else{
            totalMonedas+=500;
            mensaje = "500 monedas virtuales"; 
        }
        pasosDiarios = 0;
        return mensaje;
    }   
    
    public String canjearMonedas(){
        String mensaje;
        if(totalMonedas < 300){
            mensaje = "No se gano recompensa";
        }else if(300 <= totalMonedas && totalMonedas <= 999){
            mensaje = "2 entradas al cine";
        }else if(1000 <= totalMonedas && totalMonedas <= 3000){
            mensaje = "Vale por 50 pesos en supermercado";
        }else if(3001 <= totalMonedas && totalMonedas <= 4000){
            mensaje = "Vale por 100 pesos en supermercado";
        }else if(4001 <= totalMonedas && totalMonedas <= 5000){
            mensaje = "50% de descuento en Gimnasio";
        }else{
            mensaje = "1 mes de inscripcion libre en Gimnasio";
        }
        
        if(totalMonedas >= 300){
            totalMonedas = 0;
            ganoRecompensa = true;
            recompensas.add(mensaje);
        }
        
        return mensaje;
    }
    
    public String generarReporte(){
        String reporte = "";
        if(ganoRecompensa){
            for(String recompensa:recompensas){
                reporte+=(recompensa + "\n");
            }
        }
        return reporte;
    }
}