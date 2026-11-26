package estDat.estDatNoLin;


public class Trazador
{
    public ArbolBin<Integer> trazaEjecucion(int n){
        ArbolBin<Integer> traza;
        if(n<=2){
            traza = new ArbolBin<Integer>(n);
        }else{
            traza = new ArbolBin<Integer>(n, trazaEjecucion(n-1), trazaEjecucion(n-2));
        }
        return traza;
    }
}