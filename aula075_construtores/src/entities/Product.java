package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	// construtores para obrigar a fornecer o nome, preço e quantidade já no momento
	// da instanciação
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $"
				+ String.format("%.2f", totalValueInStock());

	}
}
