package es.cic;

public class CirculoImpl  implements Figura {

    private int id;
    private double radio;
    private String color;
    private double posX,posY;


    public CirculoImpl(double radio, String color, double posX, double posY) {
        this.radio = radio;
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }
    @Override
    public void CambiarColor(int figuraId, String color) {
        // TODO Auto-generated method stub
        
    }
   
    @Override
    public boolean comprobarPosicion(double posX, double posY) {
        // TODO Auto-generated method stub
        return false;
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
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
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}