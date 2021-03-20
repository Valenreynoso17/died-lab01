package died.lab01.problema01;

public class Recta {

	// Atributos
	private Punto punto1;
	private Punto punto2;
	
	// Constructores
	public Recta(Punto p1, Punto p2) {
		this.punto1 = p1;
		this.punto2 = p2;
	}
	public Recta() {
		Punto p1 = new Punto(0, 0);
		Punto p2 = new Punto(1, 1);
		
		this.punto1 = p1;
		this.punto2 = p2;
	}
	
	// Metodos
	public float pendiente() {
		float resultado;
		float numerador = this.punto1.getComponenteY() - this.punto2.getComponenteY();
		float denominador = this.punto1.getComponenteX() - this.punto2.getComponenteX();
		
		resultado = numerador/denominador;
		
		return resultado;
	}
	
	public boolean paralelas(Recta otraRecta) {
		boolean resultado = false;
		
		if(this.pendiente() == otraRecta.pendiente()) {
			resultado = true;
		}
		
		return resultado;
	}
	
	public boolean iguales(Object otraRecta) {
		boolean resultado = false;
		
		if(otraRecta instanceof Recta) {
			
			otraRecta = (Recta) otraRecta;
			
			if(this.paralelas((Recta) otraRecta)) {
				Recta nuevaRecta = new Recta(this.punto1, ((Recta) otraRecta).punto1);
				
				if(nuevaRecta.pendiente() == this.pendiente()) {
					resultado = true;
				}
			}
			
		}
		
		return resultado;
	}
}
