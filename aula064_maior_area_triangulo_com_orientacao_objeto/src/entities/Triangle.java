package entities;


public class Triangle {
	public double a;
	public double b;
	public double c;

	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		/* linha 10 resumida retirando double result substituído por return, código abaixo maior
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
		*/
	}

}
