package es.cic;


public interface Figura {
    
    public void CambiarColor(int figuraId,String color);
    public void modificarFIgura(int figuraId,Figura nuevaFigura);
    public void moverFigura(int figuraId, double posX,double posY);   
    public boolean comprobarPosicion(double posX,double posY);
}
