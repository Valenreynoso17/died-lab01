package died.lab01.problema02;

public class Temperatura {
	// Atributos
	private double grados;
	private Escala escala;
	
	// Constructores
	public Temperatura() {
		this.grados = 0;
		this.escala = Escala.CELCIUS;
	}
	
	public Temperatura(double grados, Escala escala) {
		if(temperaturaValida(grados, escala)) {
			this.grados = grados;
			this.escala = escala;
		}
		//TODO
	}
	
	// Metodos
	public double cambiarEscala() {
		double resultado;
		
		if(this.escala == Escala.CELCIUS) {
			resultado = (this.grados * 9 / 5) + 32; // Celcius a Fahrenheit
		}else {
			resultado = (this.grados - 32) * 5 / 9; // Fahrenheit a Celcius
		}
		
		return resultado;
	}
	
	public String toString() {
		String cadena;
		
		if(this.escala == Escala.CELCIUS) {
			cadena = this.grados + " C";
		}else {
			cadena = this.grados + " F";
		}
		
		return cadena;
	}
	
	public double asCelcius() {
		double resultado;
		
		if(this.escala == Escala.CELCIUS) {
			resultado = this.grados;
		}else {
			resultado = this.cambiarEscala();
		}
		
		return resultado;
	}
	
	public double asFahrenheit() {
		double resultado;
		
		if(this.escala == Escala.FAHRENHEIT) {
			resultado = this.grados;
		}else {
			resultado = this.cambiarEscala();
		}
		
		return resultado;
	}
	
	public void aumentar(Temperatura temperatura) {
		
		if(this.escala == temperatura.escala) {
			this.grados += temperatura.grados;
		} else {
			this.grados += temperatura.cambiarEscala();
		}
	}
	
	public void disminuir(Temperatura temperatura) {
		if(this.escala == temperatura.escala) {
			double aux = this.grados - temperatura.grados;
			if(temperaturaValida(aux, temperatura.escala)) {
				this.grados = aux;
			} // TODO: hacer algo si la temperatura no es valida
		} else {
			double aux = this.grados - temperatura.cambiarEscala();
			if(temperaturaValida(aux, temperatura.escala)) {
				this.grados = aux;
			} // TODO: hacer algo si la temperatura no es valida
		}
	}
	
	public boolean temperaturaValida(double grados, Escala escala) {
		boolean resultado = false;
		
		if((escala == Escala.CELCIUS && grados > -273.15) || (escala == Escala.FAHRENHEIT && grados > -459.67)) {
			resultado = true;
		}
		
		return resultado;
	}
	
	public boolean mayorA(Temperatura temp) {
		return this.asCelcius() > temp.asCelcius();
	}
}
