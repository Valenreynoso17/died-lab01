package died.lab01.problema01;

public class App {

	public static void main(String[] args) {
		Punto punto1 = new Punto(1,1);
		Punto punto2 = new Punto(2,2);
		
		Recta recta1 = new Recta(punto1, punto2);
		
		System.out.println("La pendiente de la recta1 es: " + recta1.pendiente());
		
		Punto punto3 = new Punto(5,7);
		Recta recta2 = new Recta(punto2, punto3);
		
		System.out.println("La pendiente de la recta2 es: " + recta2.pendiente());
		System.out.println("R1 y R2 representan la misma recta? " + recta1.iguales(recta2));
	}

}
