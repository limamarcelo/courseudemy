import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
				
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f\n", x); // "%.2f significa duas casas ap�s a v�rgula \n ou %n seria para dar quebra de p�gina
		System.out.printf("%.4f\n", x); // "%.4f significa quatro casas ap�s a v�rgula \n ou %n seria para dar quebra de p�gina
		Locale.setDefault(Locale.US); // para pr�xima linha substituir ponto por v�rgula.
		System.out.printf("%.4f\n", x); // "%.4f significa quatro casas ap�s a v�rgula \n ou %n seria para dar quebra de p�gina
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f Metros %n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);		//marcadores %d para int %s para texto %f casas ap�s a v�rgula %n para quebra de p�gina
		
		System.out.println("Bom dia!");
	}

}
