package SegundoParcial.estDat.estDatLin;
public class NodoBDE<T>{
    private T dato;
    private NodoBDE<T> ant, suc;
    private int frecuencia;
    public NodoBDE(T dato){
        this.dato = dato;
        ant = null;
        suc = null;
        frecuencia = 1;
    }
    public T getDato(){
        return dato;
    }
    public NodoBDE<T> getAnt(){
        return ant;
    }
    public NodoBDE<T> getSuc(){
        return suc;
    }
    public int getFrecuencia(){
        return frecuencia;
    }
    public void modificarFrecuencia(int delta){
        frecuencia+=delta;
    }
    public void setSuc(NodoBDE<T> nuevo){
        suc = nuevo;
    }
    public void setAnt(NodoBDE<T> nuevo){
        ant = nuevo;
    }
}