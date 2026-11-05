public class Verificador{
    public boolean esIncremental(int x){
        boolean es;
        if(x < 10){
            es = true;
        }else{ 
            int ultimo = x%10;
            int penultimo = (x%100)/10;
            if(ultimo <= penultimo){
                es = esIncremental(x/10);
            }else{
                es = false;
            }
        }
        return es;
    }
}