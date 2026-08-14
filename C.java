
public class C
{
    void cambiar(int[] x){
        x[0] = 100;
    }
    
    void proceso(){
        int[] x = new int[10];
        cambiar(x);
    }
}