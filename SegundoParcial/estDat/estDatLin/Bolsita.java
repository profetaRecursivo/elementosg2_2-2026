package SegundoParcial.estDat.estDatLin;

public class Bolsita<T>{
    private NodoBDE<T> ini;
    
    public Bolsita(){
        ini = null;
    }
    public boolean esVacia(){
        return ini == null;
    }
    public void insertar(T dato){
        if(esVacia()){
            ini = new NodoBDE<T>(dato);
        }else{
            NodoBDE<T> act = ini;
            NodoBDE<T> ant = ini.getAnt();
            boolean existe = false;
            while(act != null && !existe){
                T datoActual = act.getDato();
                if(datoActual.equals(dato)){
                    existe = true;
                    //aumentar frecuencia
                    act.modificarFrecuencia(1);
                    //llevarlo a donde corresponda
                    mover(act);
                }else{
                    ant = act;
                    act = act.getSuc();
                }
            }
            if(!existe){
                NodoBDE<T> nuevo = new NodoBDE<T>(dato);
                ant.setSuc(nuevo);
                nuevo.setAnt(ant);
            }
        }
    }
    
    private void mover(NodoBDE<T> nodo){
        while(nodo.getAnt() != null && nodo.getAnt().getFrecuencia() < nodo.getFrecuencia()){
            //intercambiar posiciones
            NodoBDE<T> ant = nodo.getAnt();
            swap(nodo, ant);
            nodo = ant;
        }
    }
    private void swap(NodoBDE<T> ant, NodoBDE<T> act){
        T temp = ant.getDato();
        ant.setDato(act.getDato());
        act.setDato(temp);
        int frecTemp = ant.getFrecuencia();
        ant.setFrecuencia(act.getFrecuencia());
        act.setFrecuencia(frecTemp);
    }
}