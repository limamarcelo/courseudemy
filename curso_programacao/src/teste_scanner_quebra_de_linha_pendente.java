import java.util.Scanner;

public class teste_scanner_quebra_de_linha_pendente {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine(); //nextLine para guardar a linha inteira até o Enter
		s2 = sc.nextLine(); //next seria para a primeira palavra ex. "Bom"
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}
}