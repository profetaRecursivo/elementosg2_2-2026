package PrimerParcial.POO.EjercicioBiblioteca;
import java.util.ArrayList;

public class Reina
{
    public ArrayList<int[][]> reinas(int n){
        ArrayList<int[][]> soluciones = new ArrayList<>();
        int tab[][] = new int[n][n];
        reinas(n, 0, 0, tab,  soluciones, 0);
    }
    public boolean esval(int x, int y, int n){
        return x>=0 && x<n && y<n && y>=0;
    }
    private boolean recorrer(int x, int y, int[][] tab, int dx, int dy){
        boolean puedo = true;
        if(esval(x, y, tab.length)){
            if(tab[x][y] == 1){
                puedo = false;
            }else{
                puedo = recorrer(x + dx, y + dy, tab, dx, dy);
            }
        }
        return puedo;
    }
    private boolean puedocolocar(int x, int y, int[][] tab){
        //para arriba
        boolean puedo = !recorrer(x, y, tab, -1, 0) && !recorrer(x, y, tab, 1, 0) && !recorrer(x, y, tab, 0, 1) && !recorrer(x, y, tab, 0, -1) && !recorrer(x, y, tab, -1, 1) && !recorrer(x, y, tab, -1, -1) && !recorrer(x, y, tab, 1, -1) && !recorrer(x, y, tab, 1, 1);
        return puedo;
        
    }
    
    private void reinas(int n, int x, int y, int[][] tab, ArrayList<int[][]> soluciones, int cantActual){
        if(x < n){
            if(y < n){
                if(puedocolocar(x, y, tab)){
                    tab[x][y] = 1;
                    reinas(n, x+1, 0, tab, soluciones, cantActual + 1);
                    tab[x][y] = 0;
                    reinas(n, x, y+1, tab, soluciones, cantActual);
                }else{
                    reinas(n, x, y+1, tab, soluciones, cantActual);
                }
            }else{
                reinas(n, x+1, 0, tab, soluciones, cantActual);
            }
        }else{
            if(cantActual == n){
                //solucion
                soluciones.add(copiar(mat));
            }
        }
    }
}