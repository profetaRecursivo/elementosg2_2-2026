package SegundoParcial.estDat.estDatLin;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ListaCSETest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListaCSETest
{
    private ListaCSE<Integer> lista;
    public ListaCSETest()
    {
    }

    
    @BeforeEach
    public void setUp()
    {
        lista = new ListaCSE<Integer>();
    }

    @Test
    public void testAccederAListaConCuatroElementosPosicionTres(){
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(1);
        assertEquals(lista.acceder(3), 1);
    }
    
    @Test
    public void testAccederAListaConCuatroElementosPosicionOcho(){
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(1);
        assertEquals(lista.acceder(8), 2);
    }
    @Test
    public void testAccederAListaConDosElementosPosicionNumeroGrande(){
        lista.insertar(1);
        lista.insertar(2);
        assertEquals(lista.acceder(100006789), 2);
    }
    
    @AfterEach
    public void tearDown()
    {
    }
}