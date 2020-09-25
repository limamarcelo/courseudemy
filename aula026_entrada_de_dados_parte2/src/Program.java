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
		System.out.printf("%.2f\n", x); // "%.2f significa duas casas após a vírgula \n ou %n seria para dar quebra de página
		System.out.printf("%.4f\n", x); // "%.4f significa quatro casas após a vírgula \n ou %n seria para dar quebra de página
		Locale.setDefault(Locale.US); // para próxima linha substituir ponto por vírgula.
		System.out.printf("%.4f\n", x); // "%.4f significa quatro casas após a vírgula \n ou %n seria para dar quebra de página
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f Metros %n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);		//marcadores %d para int %s para texto %f casas após a vírgula %n para quebra de página
		
		System.out.println("Bom dia!");
	}

}
