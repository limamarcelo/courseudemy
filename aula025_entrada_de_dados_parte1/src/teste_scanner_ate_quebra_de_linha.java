import java.util.Scanner;

public class teste_scanner_ate_quebra_de_linha {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); //colocado este nextLine apenas para absorver o Enter ap�s o valor assim conseguir guardar os valors das pr�ximas vari�veis.
		s1 = sc.nextLine(); //nextLine para guardar a linha inteira at� o Enter
		s2 = sc.nextLine(); //next seria para a primeira palavra ex. "Bom"
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}
}