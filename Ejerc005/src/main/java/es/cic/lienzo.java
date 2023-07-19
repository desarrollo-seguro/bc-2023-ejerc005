package es.cic;

import java.util.ArrayList;

public class lienzo {
    private ArrayList<Figura> figurasLienzo;

    private final int LIENZO_MAX_X=1000000,LIENZO_MAX_Y=1000000;

    public lienzo() {
        this.figurasLienzo = new ArrayList<Figura>();
    }

    public void CrearFigura(Figura figura){
              
    }

    public boolean estaDentro(Posicion posicion){
        if(posicion.getPosX()>LIENZO_MAX_X || posicion.getPosY()>LIENZO_MAX_Y){
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Figura> getFigurasLienzo() {
        return figurasLienzo;
    }

    public void setFigurasLienzo(ArrayList<Figura> figurasLienzo) {
        this.figurasLienzo = figurasLienzo;
    }

    public int getLIENZO_MAX_X() {
        return LIENZO_MAX_X;
    }

    public int getLIENZO_MAX_Y() {
        return LIENZO_MAX_Y;
    }
}
