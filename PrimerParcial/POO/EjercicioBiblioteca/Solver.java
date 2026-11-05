package PrimerParcial.POO.EjercicioBiblioteca;
import java.util.ArrayList;



public class Solver
{
    ArrayList<int[][]> buscar(int[][] grilla){
        ArrayList<int[][]> res = new ArrayList<>();
        buscar(0, 0, grilla, res);
        return res;
    }
    private void buscar(int x, int y, int[][]grilla, ArrayList<int[][]> res){
        if(x < 9){
            if(y < 9){
                if(grilla[x][y] != 0){
                    buscar(x, y+1, grilla, res);
                }else{
                    for(int num = 1; num <= 9; num++){
                        if(puedoColocar(num, x, y, grilla)){
                            grilla[x][y] = num;
                            buscar(x, y+1, grilla, res);
                            grilla[x][y] = 0;
                        }
                    }
                }
            }else{
                buscar(x+1, 0, grilla, res);
            }
        }else{
            res.add(copiar(grilla));
        }
    }
}