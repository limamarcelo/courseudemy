package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	/*
	 * Para geração automaticamente de Generate Constructor using Fields. Clicar com
	 * botão direito do mouse>Source>Generate Constructors and Fields...
	 * 
	 */

	// construtor padrão
	public Product() {

	}

	// construtores para obrigar a fornecer o nome, preço e quantidade já no momento
	// da instanciação
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// sobrecarga - disponibilizar mais de uma versão da mesma operação a diferença
	// será a lista de parâmetros.
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	/*
	 * Para geração automáticamente de getters e setters. Clicar com botão direito
	 * do mouse>Source>Generate Getters and Setters...
	 * 
	 */
	// encapsulamento
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	// apenas o getQuantity, não vou criar o setQuantity para proteger meu objeto
	// produto de alterações inconsistentes da quantidade dele, ele só pode mudar
	// por meio das operações entrada e saída do estoque. Protegendo que quantidade
	// de produtos sempre esteja em estado consistente. Por isso não irei
	// implementar o setQuantity.
	public int getQuantity() {
		return quantity;
	}

	// métodos
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		/*
		 * quantity repetido em public int quantity e public void addPoducts(int
		 * quantity, para usar o public int quantity, deve-se usar o this.
		 */
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ " units, Total: $"
		+ String.format("%.2f", totalValueInStock());
	}
}