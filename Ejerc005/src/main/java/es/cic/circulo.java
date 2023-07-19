package es.cic;

import java.awt.Color;

public class circulo implements Figura {
    private double radio;
    private Color color;
    private double posX,posY;


    public circulo(double radio, Color color, double posX, double posY) {
        this.radio = radio;
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }
    @Override
    public void CambiarColor(int figuraId, Color color) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void aniadirFigura(Figura figura, double posX, double posY, Color color) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean comprobarPosicion(double posX, double posY) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void eliminarFigura(int figuraId) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void modificarFIgura(int figuraId, Figura nuevaFigura) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void moverFigura(int figuraId, double posX, double posY) {
        // TODO Auto-generated method stub
        
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public double getPosX() {
        return posX;
    }
    public void setPosX(double posX) {
        this.posX = posX;
    }
    public double getPosY() {
        return posY;
    }
    public void setPosY(double posY) {
        this.posY = posY;
    }


   
    
}
