package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	/*
	 * Para gera��o automaticamente de Generate Constructor using Fields. Clicar com
	 * bot�o direito do mouse>Source>Generate Constructors and Fields...
	 * 
	 */

	// construtor padr�o
	public Product() {

	}

	// construtores para obrigar a fornecer o nome, pre�o e quantidade j� no momento
	// da instancia��o
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// sobrecarga - disponibilizar mais de uma vers�o da mesma opera��o a diferen�a
	// ser� a lista de par�metros.
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	/*
	 * Para gera��o autom�ticamente de getters e setters. Clicar com bot�o direito
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

	// apenas o getQuantity, n�o vou criar o setQuantity para proteger meu objeto
	// produto de altera��es inconsistentes da quantidade dele, ele s� pode mudar
	// por meio das opera��es entrada e sa�da do estoque. Protegendo que quantidade
	// de produtos sempre esteja em estado consistente. Por isso n�o irei
	// implementar o setQuantity.
	public int getQuantity() {
		return quantity;
	}

	// m�todos
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