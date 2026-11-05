package SegundoParcial.estDat.estDatLin;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ListaSETest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListaSETest
{
    /**
     * Default constructor for test class ListaSETest
     */
    public ListaSETest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    /**
     * metodo que indica el estado de la lista
     * @param ninguno
     * @return si esta vacia o no
     */
    @Test
    public void testEsVacia(){
        ListaSE<String> lista;
        lista = new ListaSE<String>();
        assertEquals(true, lista.esVacia());
    }
    
    /**
     * metodo que inserta el dato al final de la lista
     * @param dato a insertar gay
     * @return nada
     */
    @Test
    public void testInsertar(){
        ListaSE<String> lista;
        lista = new ListaSE<String>();
        lista.insertar("Hola");
        assertEquals(false, lista.esVacia());
    }
    
    /**
     * metodo que elimina el dato de la posicion pos
     * en caso de no existir la posicion pos, hace nada
     * @param pos que es un valor entero positivo incluido el 0
     * @return nada
     */
    @Test
    public void testEliminar(){
        ListaSE<String> lista;
        lista = new ListaSE<String>();
        lista.eliminar(10);
        assertEquals(true, lista.esVacia());
        lista.insertar("Hola");
        lista.eliminar(10);
        assertEquals(false, lista.esVacia());
        lista.eliminar(0);
        assertEquals(true, lista.esVacia());
    }
    
    /**
     * metodo que accede al dato de la posicion pos, en caso
     * de no existir la posicion pos retorna null
     * @param pos que es un valor entero positivo incluido el 0
     * @return dato de la posicion pos
     */
    @Test
    public void testAcceder(){
        ListaSE<String> lista;
        lista = new ListaSE<String>();
        assertEquals(null, lista.acceder(10));
        lista.insertar("Hola");
        assertEquals(null, lista.acceder(10));
        assertEquals(new String("Hola"), lista.acceder(0));
        assertEquals(false, lista.esVacia());
    }
    
    /**
     * metodo que inserta el dato en la posicion pos, en caso
     * de no existir pos, hace nada
     * @param pos que es un valor entero positivo incluido el 0
     * @param dato a insertar
     * @return nada
     */
    @Test
    public void testInsertarPos(){
        ListaSE<String> lista;
        lista = new ListaSE<String>();
        lista.insertar(10,"Hola");
        assertEquals(true, lista.esVacia());
        lista.insertar("Hola");
        assertEquals(false, lista.esVacia());
        lista.insertar(0,"Como");
        assertEquals(false, lista.esVacia());
        assertEquals("Hola", lista.acceder(1));
    }
    
    /**
     * metodo que elimina la primera ocurrencia del dato, en
     * caso de no existir el dato, hace nada
     * @param dato a eliminar
     * @return nada
     */
    @Test
    public void testEliminarDato(){
        ListaSE<String> lista;
        lista = new ListaSE<String>();
        lista.eliminar("Hola");
        assertEquals(true, lista.esVacia());
        lista.insertar("Hola");
        lista.insertar("Como");
        lista.insertar("Estas");
        lista.insertar("Bien");
        lista.eliminar("Mal");
        lista.eliminar("Estas");
        assertEquals("Bien", lista.acceder(2));
    }
    
    /**
     * metodo que devuelve el tamaño de la lista
     * @param nada
     * @return tamaño
     */
    @Test
    public void testLongitud(){
        ListaSE<String> lista;
        lista = new ListaSE<String>();
        lista.eliminar("Hola");
        assertEquals(0, lista.longitud());
        lista.insertar("Hola");
        lista.insertar("Como");
        lista.insertar("Estas");
        lista.insertar("Bien");
        lista.eliminar("Mal");
        lista.eliminar("Estas");
        assertEquals(3, lista.longitud());
    }
    
    /**
     * metodo que muestra la lista
     * [d, d, ...]
     * @param nada
     * @return cadena
     */
    @Test
    public void testMostrar(){
        ListaSE<String> lista;
        lista = new ListaSE<String>();
        lista.eliminar("Hola");
        assertEquals(true, lista.esVacia());
        lista.insertar("Hola");
        lista.insertar("Como");
        lista.insertar("Estas");
        lista.insertar("Bien");
        lista.eliminar("Mal");
        lista.eliminar("Estas");
        assertEquals("[Hola, Como, Bien]", lista.mostrar());
    }
    
    /**
     * metodo que permite modificar el dato de la posicion
     * pos con el nuevo dato, en caso de no existir la posicion
     * pos, hace nada gay
     * @param pos que es un valor entero positivo incluido el 0
     * @param nuevoDato nuevo dato de la posicion
     * @return nada
     */
    @Test
    public void testModificar(){
        ListaSE<String> lista;
        lista = new ListaSE<String>();
        assertEquals(true, lista.esVacia());
        lista.insertar("Hola");
        lista.insertar("Como");
        lista.insertar("Estas");
        lista.insertar("Bien");
        assertEquals("Bien", lista.acceder(3));
        lista.modificar(3,"Mal");
        assertEquals("Estas", lista.acceder(2));
        assertEquals("Mal", lista.acceder(3));
        lista.modificar(10,"Hi");
    }
    
    /**
     * metodo que vacia la lista
     * @param nada
     * @return nada
     */
    @Test
    public void testVaciar(){
        ListaSE<String> lista;
        lista = new ListaSE<String>();
        assertEquals(true, lista.esVacia());
        lista.insertar("Hola");
        lista.insertar("Como");
        lista.insertar("Estas");
        lista.insertar("Bien");
        lista.vaciar();
        assertEquals(true, lista.esVacia());
        assertEquals(null, lista.acceder(2));
    }
    
    /**
     * operacion que busca el dato
     * @param dato a buscar
     * @return si existe o no
     */
    @Test
    public void testBuscar(){
        ListaSE<String> lista;
        lista = new ListaSE<String>();
        assertEquals(true, lista.esVacia());
        lista.insertar("Hola");
        lista.insertar("Como");
        lista.insertar("Estas");
        lista.insertar("Bien");
        assertEquals(false, lista.buscar("Mal"));
        lista.vaciar();
        assertEquals(true, lista.esVacia());
        assertEquals(false, lista.buscar("Hola"));
    }
    
    /**
     * operacion que determina la posicion del dato, en caso
     * de no existir el dato retorna -1
     * @param dato el dato cuya posicion se  busca
     * @return posicion del dato
     */
    @Test
    public void TestIndiceDe(){
        ListaSE<String> lista;
        lista = new ListaSE<String>();
        assertEquals(true, lista.esVacia());
        lista.insertar("Hola");
        lista.insertar("Como");
        lista.insertar("Estas");
        lista.insertar("Bien");
        assertEquals(-1, lista.indiceDe("Mal"));
        assertEquals(0, lista.indiceDe("Hola"));
        assertEquals(3, lista.indiceDe("Bien"));
    }
    
    /**
     * operacion que intercambia los datos de las posiciones
     * pos1 y pos2, en caso de no existir alguna, se hace nada
     * @param pos1 entero positivo incluido el 0
     * @param pos2 entero positivo incluido el 0
     * @return nada
     */
    @Test
    public void testIntercambiar(){
        ListaSE<String> lista;
        lista = new ListaSE<String>();
        assertEquals(true, lista.esVacia());
        lista.insertar("Hola");
        lista.insertar("Como");
        lista.insertar("Estas");
        lista.insertar("Bien");
        lista.intercambiar(0,3);
        assertEquals(3, lista.indiceDe("Hola"));
        assertEquals(0, lista.indiceDe("Bien"));
        assertEquals(1, lista.indiceDe("Como"));
    }
    
    /**
     * operacion genera una lista de datos que estan en 
     * el rango [pos1, pos2[
     * @param pos1 entero positivo incluido el 0
     * @param pos2 entero positivo incluido el 0
     * @return sublista
     */
    @Test
    public void testSubLista(){
        ListaSE<String> lista;
        lista = new ListaSE<String>();
        assertEquals(true, lista.esVacia());
        lista.insertar("Hola");
        lista.insertar("Como");
        lista.insertar("Estas");
        lista.insertar("Bien");
        Lista<String> otra;
        otra = lista.subLista(0, 2);
        assertEquals("[Hola, Como]", otra.mostrar());
    }
    
    /**
     * operacion que inserta todos los datos de la otra lista
     * al final de esta
     * @param otra lista
     * @return nada
     */
    public void insertarTodas(Lista<Integer> otra){
    }
    
    /**
     * operacion que invierte los datos de la lista
     * @param nada
     * @return nada
     */
    public void invertir(){
    }
}
