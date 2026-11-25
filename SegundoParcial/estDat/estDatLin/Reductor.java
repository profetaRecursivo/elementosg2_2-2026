package estDat.estDatLin;
import java.util.Stack;
public class Reductor
{
    public Lista<Integer> reducir(Lista<Integer> secuencia){
        Lista<Integer> reduccion = new ListaSE<Integer>();
        Stack<Integer> pila = new Stack();
        for(int i = 0; i<secuencia.longitud(); i++){
            int nuevo = secuencia.acceder(i);
            while(!pila.isEmpty() && pila.peek() == nuevo){
                nuevo = nuevo + pila.peek();
                pila.pop();
            }
            pila.push(nuevo);
        }
        
        //meter todos los elementos de la pila a la respuesta
        return reduccion;
    }
}