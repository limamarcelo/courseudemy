import java.util.Locale;
import java.util.Scanner; //CTRL + SHIFT + O - para importar as classes


public class teste_exercicio_iniciante_05 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Pedido");
		int CdProduto1, QtdProduto1, CdProduto2, QtdProduto2;
		Double VlrUnit1, VlrUnit2, VlrTotal;
		System.out.println("Digite o Código do Primeiro Produto: ");
		CdProduto1 = sc.nextInt();
		System.out.println("Digite a quantidade do primeiro produto: ");
		QtdProduto1 = sc.nextInt();
		System.out.println("Digite o valor unitário do primeiro produto: ");
		VlrUnit1 = sc.nextDouble();		
		System.out.println("Digite o Código do segundo Produto: ");
		CdProduto2 = sc.nextInt();
		System.out.println("Digite a quantidade do segundo produto: ");
		QtdProduto2 = sc.nextInt();
		System.out.println("Digite o valor unitário do segundo produto: ");
		VlrUnit2 = sc.nextDouble();		
		VlrTotal = (QtdProduto1 * VlrUnit1) + (QtdProduto2 * VlrUnit2);
		System.out.printf("Valor a pagar: R$ %.2f", VlrTotal);
		
		sc.close();
	}

}
