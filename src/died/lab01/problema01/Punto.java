package died.lab01.problema01;

public class Punto {
	// Atributos
	private float componenteX;
	private float componenteY;
	
	// Constructor
	public Punto(float x, float y) {
		this.componenteX = x;
		this.componenteY = y;
	}

	// Getters-Setters
	public float getComponenteX() {
		return componenteX;
	}

	public void setComponenteX(float componenteX) {
		this.componenteX = componenteX;
	}

	public float getComponenteY() {
		return componenteY;
	}

	public void setComponenteY(float componenteY) {
		this.componenteY = componenteY;
	}
	
	// Metodos
	public boolean equals(Object otroPunto) {
		boolean resultado = false;
		
		if(otroPunto instanceof Punto) {
			if(((Punto) otroPunto).componenteX == this.componenteX && ((Punto) otroPunto).componenteY == this.componenteY) {
				resultado = true;
			}
		}
		
		return resultado;
	}
}
