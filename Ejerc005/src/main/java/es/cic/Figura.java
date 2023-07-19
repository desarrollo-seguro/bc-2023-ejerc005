package es.cic;
import java.awt.Color;

public interface Figura {
    public void aniadirFigura(Figura figura,double posX, double posY, Color color);
    public void eliminarFigura(int figuraId);

    public void CambiarColor(int figuraId,Color color);
    public void modificarFIgura(int figuraId,Figura nuevaFigura);
    public void moverFigura(int figuraId, double posX,double posY);   
    public boolean comprobarPosicion(double posX,double posY);
}
