package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProducts extends Product {

	private Date manufactureDate;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProducts() {
	}

	public UsedProducts(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String priceTag() {
		return name + ", (used) $" + String.format("%.2f", price) + " (Manufacture date: "
				+ sdf.format(manufactureDate) + ")";
	}
}