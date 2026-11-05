package PrimerParcial.POO.EjercicioBiblioteca;


public class Divisor
{
    public long res = 10000000;
    public long division(long[] manzanas){
        division(manzanas, 0, 0, 0);
        return res;
    }
    
    private void division(long[] manzanas, int i, long bolsa1, long bolsa2){
        if(i >= manzanas.length){
            res = Math.min(res, (int)Math.abs(bolsa1 - bolsa2));
        }else{
            division(manzanas, i+1, bolsa1+manzanas[i], bolsa2);
            division(manzanas, i+1, bolsa1, bolsa2 + manzanas[i]);
        }
    }
}