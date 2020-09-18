import java.util.Locale;
import java.util.Scanner; //CTRL + SHIFT + O - para importar as classes

public class teste_exercicio_iniciante1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double c, l, precom2, area, precototal;
		System.out.println("Medidas do terreno");
		System.out.println("Digite a largura: ");
		l = sc.nextDouble();		
		System.out.println("Digite a comprimento:");
		c = sc.nextDouble();		
		System.out.println("Digite o valor por m2:");
		precom2 = sc.nextDouble();
		area = c*l;
		precototal = precom2 * area;
		System.out.printf("Area do terreno : %.2f%n", area);
		System.out.printf("O valor do terreno é de : %.2f%n", precototal);

		sc.close();
	}

}
