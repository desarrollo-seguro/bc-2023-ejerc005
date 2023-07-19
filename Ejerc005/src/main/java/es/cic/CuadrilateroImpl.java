package es.cic;


public class CuadrilateroImpl implements Figura {
    private int id;
    private double lado;
    private double posX,posY;
    private String color;

    

    public CuadrilateroImpl(double lado, double posX, double posY, String color) {
        this.lado = lado;
        this.posX = posX;
        this.posY = posY;
        this.color = color;
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
    public void CambiarColor(int figuraId, String color) {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

}
