
public class Recurrencia
{
    public int f(int n){
        int res;
        if(n == 1){
            res = 6;
        }else{
            res = f(n-1) +  2*(n+1) + 1;
        }
        return res;
    }
    public int cantidadLineas(int n){
        int res = 0;
        if(n == 1){
            res = 6;
        }else{
            res = cantidadLineas(n-1) + 18*(n-1) + 6;
        }
        return res;
    }
}