package PrimerParcial.POO.EjercicioBiblioteca;
import java.util.ArrayList;

public class Generador
{
    public ArrayList<ArrayList<Integer>> clausura(int[] conjunto){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> actual = new ArrayList<>();
        clausura(conjunto, 0, res, actual);
        imprimir(res);
        return res;
    }
    
    private void imprimir(ArrayList<ArrayList<Integer>> lista){
        for(var x:lista){
            for(var y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    
    void clausura(int[] conjunto, int i, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> actual){
        if(i < conjunto.length){//mientras pueda tomar
            actual.add(conjunto[i]);//tomo
            clausura(conjunto, i+1, res, actual);//avanzo
            actual.remove(actual.size()-1);//arrepentirme o notomar
            clausura(conjunto, i+1, res, actual);//avanzar
        }else{
            res.add(copiar(actual));//procesar la respuesta
        }
    }
    
    private ArrayList<Integer> copiar(ArrayList<Integer> original){
        ArrayList<Integer> copia = new ArrayList<Integer>();
        for(int x:original)
            copia.add(x);
        return copia;
    }
}