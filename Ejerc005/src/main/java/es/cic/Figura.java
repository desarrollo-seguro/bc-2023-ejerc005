package es.cic;


public interface Figura {
    public Figura aniadirFigura(double parametro,String color,Posicion pos);// cambiar posx posY por Posicion
    public Figura modificarFigura(double nuevaDiagonal);
    public void moverFigura(Posicion pos);   
    
}
