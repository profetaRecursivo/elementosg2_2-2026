package SegundoParcial.estDat.estDatLin;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListaDETest
{
    private ListaDE<String> lista;
    public ListaDETest()
    {
           
    }

    @BeforeEach
    public void setUp()
    {
        lista = new ListaDE<String>();
    }
    @Test
    public void testListaVacia(){
        assertTrue(lista.esVacia());
    }
    
    @Test
    public void testListaNoVacia(){
        lista.insertar("Hola");
        assertEquals(false, lista.esVacia());
    }
    
    @Test
    public void testListaVaciaInsertoUnElemento(){
        lista.insertar("A");
        assertEquals(lista.acceder(0), "A");
    }
    
    @Test
    public void testListaNoVaciaInsertoUnElemento(){
        lista.insertar("A");
        lista.insertar("B");
        assertEquals(lista.acceder(1), "B");
    }
    
    
    @Test
    public void testListaNoVaciaInsertarUnElementoRespetandoEstuctura(){
        lista.insertar("A");
        lista.insertar("B");
        assertEquals(lista.acceder(0), "A");
    }
    
    @Test
    public void testListaTieneTresElementosYPasaATenerCuatro(){
        lista.insertar("A");
        lista.insertar("B");
        lista.insertar("C");
        lista.insertar("D");
        assertEquals(lista.longitud(), 4);
    }
    
    
    @AfterEach
    public void tearDown()
    {
    }
}