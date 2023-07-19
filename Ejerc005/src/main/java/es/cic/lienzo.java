package es.cic;

import java.util.ArrayList;

public class lienzo {
    private ArrayList<Figura> figurasLienzo;

    private final int LIENZO_TAM_X=1000000,LIENZO_TAM_Y=1000000;

    public lienzo() {
        this.figurasLienzo = new ArrayList<Figura>();
    }

    public void CrearFigura(Figura figura){
              
    }

    public ArrayList<Figura> getFigurasLienzo() {
        return figurasLienzo;
    }

    public void setFigurasLienzo(ArrayList<Figura> figurasLienzo) {
        this.figurasLienzo = figurasLienzo;
    }

    public int getLIENZO_TAM_X() {
        return LIENZO_TAM_X;
    }

    public int getLIENZO_TAM_Y() {
        return LIENZO_TAM_Y;
    }
}
