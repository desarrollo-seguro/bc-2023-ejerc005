package es.cic;

import static org.junit.Assert.assertEquals;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CirculoImplTest {

    private CirculoImpl cut;

    @BeforeEach
    void SetUp() throws Exception{
        this.cut = new CirculoImpl();
    }

    @Test
    void testPintarFigura() {
        cut.aniadirFigura(5, "negro", new Posicion(0,0));
        double esperado = 2*Math.PI*5;
        assertEquals(esperado, cut.getPerimetro(), 0.001);
        assertThat(cut.getColor(),is(notNullValue()));
    }

    @Test
    void modificarFigura(){
        cut.modificarFigura(10);
        double esperado = 2*Math.PI*10;
        assertEquals(esperado, cut.getPerimetro(), 0.001);
        assertNotEquals(-esperado, cut.getPerimetro());
    }

    @Test
    void testMoverFigura() {
    	cut.moverFigura(new Posicion(20,300));
        
        assertEquals( 20, cut.getPos().getPosX(), 0.01);
        assertEquals( 300, cut.getPos().getPosY(), 0.01); 
    }
}