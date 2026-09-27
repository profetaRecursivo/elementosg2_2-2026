package PrimerParcial.POO.EjercicioBiblioteca;

public class Buscador
{
    
    
    //tomar y notomar
    //si tomo desicion avanzo -> 
    //limpio procesamiento
    //notomar -> avanzo
    //limpio procesamiento
    public Punto buscar(int n, int d){
        int pot = (int)(Math.pow(2, n));
        return buscar(n, d, 1, 1, pot, pot, 1, (int)(Math.pow(2, 2*n)));
    }
    
    private Punto buscar(int n, int d, int posIniFil, int posIniCol, 
                int posFinFil, int posFinCol, int minimo, int maximo){
        Punto res;
        if(n == 0){
            res = new Punto(posIniFil, posIniCol);//lo mismo posFinFil, posFinCol
        }else{
            //busquedas aburridas -> no entra
            int cant = (int)(Math.pow(2, 2*n-2));
            int diff = (int)(Math.pow(2, n-1)) - 1;
            int minimoA = minimo;
            int maximoA = minimoA + cant - 1;
            int minimoB = maximoA + 1;
            int maximoB = minimoB + cant - 1;
            int minimoC = maximoB + 1;
            int maximoC = minimoC + cant - 1;
            int minimoD = maximoC + 1;
            int maximoD = minimoD + cant - 1;
            int posIniFilA = posIniFil;
            int posIniColA = posIniCol;
            int posIniFilB = posIniFilA + diff + 1;
            int posIniColB = posIniColA + diff + 1;
            int posIniFilC = posIniFilB;
            int posIniColC = posIniColA;
            int posIniFilD = posIniFilA;
            int posIniColD = posIniColB;
            int posFinFilA = posIniFilA + diff;
            int posFinColA = posIniColA + diff;
            int posFinFilB = posIniFilB + diff;
            int posFinColB = posIniColB + diff;
            int posFinFilC = posIniFilC + diff;
            int posFinColC = posIniColC + diff;
            int posFinFilD = posIniFilD + diff;
            int posFinColD = posIniColD + diff;
            if(minimoA <= d && d <= maximoA){
                res = buscar(n-1, d, posIniFilA, posIniColA, posFinFilA, posFinColA, minimoA, maximoA);
            }else if(minimoB <= d && d <= maximoB){
                res = buscar(n-1, d, posIniFilB, posIniColB, posFinFilB, posFinColB, minimoB, maximoB);
            }else if(minimoC <= d && d <= maximoC){
                res = buscar(n-1, d, posIniFilC, posIniColC, posFinFilC, posFinColC, minimoC, maximoC);
            }else{
                res = buscar(n-1, d, posIniFilD, posIniColD, posFinFilD, posFinColD, minimoD, maximoD);
            }
        }
        return res;
    }
}