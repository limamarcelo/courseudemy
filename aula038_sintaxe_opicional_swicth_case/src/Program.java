import java.util.Locale;
import java.util.Scanner; //CTRL + SHIFT + O - para importar as classes

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String diaDaSemana;
		int dia;
		System.out.println("Digite um valor de 1 - 7 para converter no dia da semana");
		dia = sc.nextInt();

		switch (dia) {
		case 1:
			diaDaSemana = "Dia da semana: domingo";
			break;
		case 2:
			diaDaSemana = "Dia da semana: segunda-feira";
			break;
		case 3:
			diaDaSemana = "Dia da semana: ter�a-feira";
			break;
		case 4:
			diaDaSemana = "Dia da semana: quarta-feira";
			break;
		case 5:
			diaDaSemana = "Dia da semana: quinta-feira";
			break;
		case 6:
			diaDaSemana = "Dia da semana: sexta-feira";
			break;
		case 7:
			diaDaSemana = "Dia da semana: s�bado";
			break;
		default:
			diaDaSemana = "Valor inv�lido";
			break;
		}
		if (diaDaSemana != "Valor inv�lido")
			;
		{
			System.out.println(diaDaSemana);
		}

		sc.close();
	}

}
