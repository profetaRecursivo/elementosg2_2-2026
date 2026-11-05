package PrimerParcial.POO.ExamenRepasoPOO;
import java.util.ArrayList;

public class Aplicacion{
    private ArrayList<Usuario> usuarios;
    
    public Aplicacion(){
        usuarios = new ArrayList<Usuario>();
    }
    
    public String generarReporte(){
        String reporte = "";
        for(int i = 0; i<usuarios.size(); i++){
            //usuarios[i].getRecompensa()
            if(usuarios.get(i).ganoRecompensa()){
                reporte+="El usuario "+usuarios.get(i).getCodigo()+" gano las siguientes recompensas:\n";
                reporte+=usuarios.get(i).generarReporte();
                reporte+="\n";
            }
        }
        return reporte;
    }
    
    public void anadirUsuario(Usuario u){
        usuarios.add(u);
    }
}