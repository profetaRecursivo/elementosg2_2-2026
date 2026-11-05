package PrimerParcial.POO.EjercicioBiblioteca;
import java.util.ArrayList;

public class Recolector
{
    public ArrayList<Punto> buscar(int x, int y, int k){
        ArrayList<Punto> res = new ArrayList<>();
        boolean tablero[][] = new boolean[8][8];
        buscar(x-1, y-1, k, res, tablero);
        return res;
    }
    
    private boolean esvalida(int x, int y){
        return x>=0 && x<8 && y>=0 && y<8;
    }
    
    private void buscar(int x, int y, int k, ArrayList<Punto> res, boolean[][] tab){
        if(esvalida(x, y)){
            if(!tab[x][y]){
                tab[x][y] = true;
                res.add(new Punto(x+1, y+1));
                buscar(x-k, y-k, k, res, tab);
                buscar(x-k, y+k, k, res, tab);
                buscar(x+k, y+k, k, res, tab);
                buscar(x+k, y-k, k, res, tab);
            }
        }
    }
}

































