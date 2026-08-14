public class A
{
    private int numero;
    
    A(){
       numero = f(Math.sqrt(25)); 
    }
    
    public int f(int x){
        return x+10;
    }
    
    public int f(double y){
        return y;
    }
    
}
