package es.cic;

import static org.mockito.Mockito.mock;

import static org.mockito.Mockito.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class lienzoTest {

    private Lienzo cut;
    private CirculoImpl dependencia;

    @BeforeEach
    void SetUp() throws Exception{
        this.cut = new Lienzo();
        this.dependencia = mock(CirculoImpl.class);
        
    }

    @Test
    void testCrearFigura() {
        CirculoImpl circuloEsperado= new CirculoImpl(5,"rojo",new Posicion(5,4));
        when(dependencia.aniadirFigura(5, "rojo", new Posicion(5,4))).thenReturn(circuloEsperado);
        cut.CrearFigura(new CirculoImpl(5,"rojo",new Posicion(5,4)), FiguraEnum.Circulo);
    
        assertThat("Hay las figuras esperadas en el lienzo",Integer.valueOf(cut.getCirculosLienzo().size()), is(1));
        //verify(dependencia,times(1)).aniadirFigura(5, "rojo", new Posicion(5,4));
    
    }

    @Test
    void testEliminarFigura() {
        
    }

    @Test
    void testEstaDentro() {

    }

    @Test
    void testGetCirculosLienzo() {

    }

    @Test
    void testModificarPosFigura() {

    }

    @Test
    void testModificarTamanoFigura() {

    }
}
