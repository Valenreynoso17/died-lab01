package died.lab01.problema03;

import java.util.Random;

import died.lab01.problema02.Escala;
import died.lab01.problema02.Temperatura;

public class Aplicacion {

	public static void main(String[] args) {
		
		Registro r1 = new Registro("Denver");
		Registro r2 = new Registro("Nairobi");
		Random generadorAleatorio= new Random();
		
		for(int i = 0; i < 10; i++) {
			r1.agregar(new Temperatura(generadorAleatorio.nextDouble()*50, Escala.CELCIUS));
		}
		for(int i = 0; i < 10; i++) {
			r2.agregar(new Temperatura(generadorAleatorio.nextDouble()*105, Escala.FAHRENHEIT));
		}
		
		r1.imprimir();
		r1.mediaAsCelcius();
		r1.maximo();
		
		System.out.println("");
		
		r2.imprimir();
		r2.mediaAsFahrenheit();
		r2.maximo();
		
	}

}
