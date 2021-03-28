package died.lab01.problema03;

import died.lab01.problema02.Temperatura;

public class Registro {
	private String ciudad;
	private Temperatura[] historico;
	private int ultimoIndice;
	
	public Registro() {
		this.ciudad = "-";
		this.historico = new Temperatura[30];
		this.ultimoIndice = 0;
	}
	
	public Registro(String ciudad) {
		this.ciudad = ciudad;
		this.historico = new Temperatura[30];
		this.ultimoIndice = 0;
	}
	
	private String getCiudad() { return this.ciudad; }
	
	public void imprimir() {
		
		System.out.println("Temperaturas registradas en: " + this.ciudad.toUpperCase());
		
		for(int i=0; i < this.ultimoIndice; i++) {
			System.out.println((i+1) + ": " + this.historico[i].toString());			
		}
	}
	
	public void agregar(Temperatura t) {
		if(this.ultimoIndice < 30) {
			this.historico[this.ultimoIndice] = t;
			this.ultimoIndice++;
		}
	}
	
	public void mediaAsCelcius() {
		double total = 0;
		
		for(int i = 0; i < this.ultimoIndice; i++) {
			total += this.historico[i].asCelcius();
		}
		
		System.out.println("La temperatura promedio de " + this.ciudad + " en Celcius es de: " + total/this.ultimoIndice);
	}
	
	public void mediaAsFahrenheit() {
		double total = 0;
		
		for(int i = 0; i < this.ultimoIndice; i++) {
			total += this.historico[i].asFahrenheit();
		}
		
		System.out.println("La temperatura promedio de " + this.ciudad + " en Fahrenheit es de: " + total/this.ultimoIndice);
	}
	
	public void maximo() {
		Temperatura maxima = this.historico[0];
		for(int i = 1; i < this.ultimoIndice; i++) {
			if(!maxima.mayorA(this.historico[i])) {
				maxima = this.historico[i];
			}
		}
		
		System.out.println("La temperatura máxima registrada en " + this.ciudad + " es: ");
		System.out.println("En Celcius: " + maxima.asCelcius());
		System.out.println("En Fahrenheit: " + maxima.asFahrenheit());
	}
}
