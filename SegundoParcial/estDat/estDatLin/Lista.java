package SegundoParcial.estDat.estDatLin;

/**
 * Write a description of interface Lista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Lista<T>{
    /**
     * metodo que indica el estado de la lista
     * @param ninguno
     * @return si esta vacia o no
     */
    public boolean esVacia();
    
    /**
     * metodo que inserta el dato al final de la lista
     * @param dato a insertar
     * @return nada
     */
    public void insertar(T dato);
    
    /**
     * metodo que elimina el dato de la posicion pos
     * en caso de no existir la posicion pos, hace nada
     * @param pos que es un valor entero positivo incluido el 0
     * @return nada
     */
    public void eliminar(int pos);
    
    /**
     * metodo que accede al dato de la posicion pos, en caso
     * de no existir la posicion pos retorna null
     * @param pos que es un valor entero positivo incluido el 0
     * @return dato de la posicion pos
     */
    public T acceder(int pos);
    
    /**
     * metodo que inserta el dato en la posicion pos, en caso
     * de no existir pos, hace nada
     * @param pos que es un valor entero positivo incluido el 0
     * @param dato a insertar
     * @return nada
     */
    public void insertar(int pos, T dato);
    
    /**
     * metodo que elimina la primera ocurrencia del dato, en
     * caso de no existir el dato, hace nada
     * @param dato a eliminar
     * @return nada
     */
    public void eliminar(T dato);
    
    /**
     * metodo que devuelve el tamaño de la lista
     * @param nada
     * @return tamaño
     */
    public int longitud();
    
    /**
     * metodo que muestra la lista
     * [d, d, ...]
     * @param nada
     * @return cadena
     */
    public String mostrar();
    
    /**
     * metodo que permite modificar el dato de la posicion
     * pos con el nuevo dato, en caso de no existir la posicion
     * pos, hace nada
     * @param pos que es un valor entero positivo incluido el 0
     * @param nuevoDato nuevo dato de la posicion
     * @return nada
     */
    public void modificar(int pos, T nuevoDato);
    
    /**
     * metodo que vacia la lista
     * @param nada
     * @return nada
     */
    public void vaciar();
    
    /**
     * operacion que busca el dato
     * @param dato a buscar
     * @return si existe o no
     */
    public boolean buscar(T dato);
    
    /**
     * operacion que determina la posicion del dato, en caso
     * de no existir el dato retorna -1
     * @param dato el dato cuya posicion se  busca
     * @return posicion del dato
     */
    public int indiceDe(T dato);
    
    /**
     * operacion que intercambia los datos de las posiciones
     * pos1 y pos2, en caso de no existir alguna, se hace nada
     * @param pos1 entero positivo incluido el 0
     * @param pos2 entero positivo incluido el 0
     * @return nada
     */
    public void intercambiar(int pos1, int pos2);
    
    /**
     * operacion genera una lista de datos que estan en 
     * el rango [pos1, pos2[
     * @param pos1 entero positivo incluido el 0
     * @param pos2 entero positivo incluido el 0
     * @return sublista
     */
    public Lista<T> subLista(int pos1, int pos2);
    
    /**
     * operacion que inserta todos los datos de la otra lista
     * al final de esta
     * @param otra lista
     * @return nada
     */
    public void insertarTodas(Lista<T> otra);
    
    /**
     * operacion que invierte los datos de la lista
     * @param nada
     * @return nada
     */
    public void invertir();
}
