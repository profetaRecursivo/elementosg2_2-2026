package estDat.estDatLin;
import java.util.Stack;
public class Emparejador
{
    public boolean esValida(Lista<Character> secuencia){
        boolean es = true;
        int n = secuencia.longitud();
        Pila<Character> pila = new Pila<Character>();
        for(int i = 0; i<n; i++){
            char c = secuencia.acceder(i);
            if(c == '('){
                pila.push(c);
            }else{
                //cierre
                if(pila.estaVacia()){
                    es = false;
                }else{
                    pila.pop();
                }
            }
        }
        if(!pila.estaVacia()){
            es = false;
        }
        return es;
    }
}