package es.cic;

import java.util.ArrayList;

public class Lienzo {
    private ArrayList<CirculoImpl> circulosLienzo;
  

    private final int LIENZO_MAX_X=1000000,LIENZO_MAX_Y=1000000;

    public Lienzo() {
        this.circulosLienzo = new ArrayList<CirculoImpl>();
        
    }

    public void CrearFigura(Figura figura,FiguraEnum tipo){
        
        switch(tipo){
            case Circulo:
                CirculoImpl circulo = (CirculoImpl)figura;
                if(estaDentro(circulo.getPos())){
                    circulo.setId(circulosLienzo.size());
                    circulosLienzo.add((CirculoImpl)circulo.aniadirFigura(circulo.getRadio(),circulo.getColor(),circulo.getPos()));
                }
                break;
            case Cudrilatero:
                break;
            case Punto:
                break;
            case Linea:
                break;
        }
    }

    public boolean estaDentro(Posicion posicion){
        if(posicion.getPosX()<LIENZO_MAX_X || posicion.getPosY()<LIENZO_MAX_Y){
            return true;
        }else{
            return false;
        }
    }

    public void modificarPosFigura(Posicion posNueva,Figura figura,FiguraEnum tipo){
        switch(tipo){
            case Circulo:
                CirculoImpl circulo = (CirculoImpl)figura;
                circulo.moverFigura(posNueva);
                circulosLienzo.get(circulo.getId()).setPos(posNueva);
                 
                break;
            case Cudrilatero:
                break;
            case Punto:
                    break;
            case Linea:
                break;
               
            }
    }

    public void modificarTamanoFigura(Figura figura,double parametro,FiguraEnum tipo){
            switch(tipo){
                case Circulo:
                    CirculoImpl circulo = (CirculoImpl)figura;
                    CirculoImpl cir=(CirculoImpl)circulo.modificarFigura(parametro);
                    circulosLienzo.get(cir.getId()).setPerimetro(parametro);
                   // figurasLienzo.get(cir.getId()).setPerimetro();
                    break;
                case Cudrilatero:
                    break;
                case Punto:
                    break;
                case Linea:
                    break;
            }
    }

    
    public void eliminarFigura(int figuraId){
        circulosLienzo.remove(figuraId);
    }

    public ArrayList<CirculoImpl> getCirculosLienzo() {
        return circulosLienzo;
    }

    public void setCirculosLienzo(ArrayList<CirculoImpl> figurasLienzo) {
        this.circulosLienzo = figurasLienzo;
    }

    public int getLIENZO_MAX_X() {
        return LIENZO_MAX_X;
    }

    public int getLIENZO_MAX_Y() {
        return LIENZO_MAX_Y;
    }
}
