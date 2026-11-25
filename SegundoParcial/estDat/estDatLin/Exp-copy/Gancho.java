import java.util.*;
public class Gancho<T extends Producto>
{
    private Queue<T> gancho;
    private int tam;
    
    public Gancho(){
        gancho = new LinkedList<T>();
        tam = 0;
    }
    
    public T decolar(){
        T res;
        if(gancho.isEmpty()){
            res = null;
        }else{
            res = gancho.poll();
            tam--;
        }
        return res;
    }
    
    public void encolar(T dato){
        tam++;
        gancho.add(dato);
    }
    
    public int tamano(){
        return tam;
    }
}