package es.cic;


public interface Figura {
    public Figura aniadirFigura(double parametro,String color,double posX,double posY);// cambiar posx posY por Posicion
    public void modificarFigura(double nuevaDiagonal);
    public void moverFigura(double posX,double posY);   
    
}
