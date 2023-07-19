package es.cic;
import java.awt.Color;

public class CuadrilateroImpl implements Figura {
    private double lado;
    private double posX,posY;
    private Color color;


    @Override
    public void aniadirFigura(Figura figura, double posX, double posY,Color color) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aniadirFigura'");
    }

    @Override
    public void eliminarFigura(int figuraId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarFigura'");
    }

    @Override
    public void modificarFIgura(int figuraId, Figura nuevaFigura) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarFIgura'");
    }

    @Override
    public void moverFigura(int figuraId, double posX, double posY) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moverFigura'");
    }

    @Override
    public boolean comprobarPosicion(double posX, double posY) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comprobarPosicion'");
    }

    @Override
    public void CambiarColor(int figuraId, Color color) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CambiarColor'");
    }
    

    public double getLado() {
		return lado;
	}

    public double getPosX(){
        return posX;
    }

    public double getPosY(){
        return posY;
    }

	public void setLado(double lado) {
		this.lado = lado;
	}

    public void setPosX(double posX){
        this.posX = posX;
    }

    public void setPosY(double posY){
        this.posY = posY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    

}
