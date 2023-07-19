package es.cic;


public class CuadrilateroImpl implements Figura {
    private int id;
    private double diagonal;
    private double posX,posY;
    private String color;


    
   
    public CuadrilateroImpl(int id, double diagonal, double posX, double posY, String color) {
        this.id = id;
        this.diagonal = diagonal;
        this.posX = posX;
        this.posY = posY;
        this.color = color;
    }


    @Override
    public Figura aniadirFigura(double parametro, String color, Posicion pos) {
        
        return this;
    }
    
    @Override
    public Figura modificarFigura(double nuevaDiagonal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarFigura'");
    }
    @Override
    public void moverFigura(Posicion pos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moverFigura'");
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getDiagonal() {
        return diagonal;
    }
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    

}
