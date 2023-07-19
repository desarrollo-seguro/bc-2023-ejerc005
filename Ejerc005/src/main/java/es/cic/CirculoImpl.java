package es.cic;

public class CirculoImpl  implements Figura {

    private int id;
    private double radio;
    private String color;
    private double posX,posY;
    private double perimetro;
   
    public CirculoImpl(double radio, String color, double posX, double posY) {
        this.radio = radio;
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }
 
    @Override
    public Figura aniadirFigura(double radio, String color, double posX, double posY) {
        this.radio = radio;
        perimetro = 2*Math.PI*radio;
        this.color = color;
        this.posX = posX;
        this.posY = posY;

        return this;
    }

    @Override
    public void modificarFigura(double radio) {
        this.radio = radio;
        perimetro = 2*Math.PI*radio;
    }

    @Override
    public void moverFigura(double posX, double posY) {
        setPosX(posX);
        setPosY(posY);
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

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double radio){
        this.perimetro = 2*Math.PI*radio;
    }

  
}