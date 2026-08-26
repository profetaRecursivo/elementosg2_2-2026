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
    
    public String registrarPasos(int pasos){
        String calificacion;
        pasosDiarios+=pasos;
        //realmente esta bien hacer eso aqui?
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
}