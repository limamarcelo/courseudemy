package model.entities.rectangle;

import model.entities.enums.Color;
import model.entities.shape.Shape;

public class Rectangle extends Shape {

	private Double width;
	private Double heigth;

	public Rectangle() {
		super();
	}

	public Rectangle(Color color, double width, double heigth) {
		super(color);
		this.width = width;
		this.heigth = heigth;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public Double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	@Override
	public double area() {
		return width * heigth;
	}
}