package model.entities.taxpayer.company;

import model.entities.taxpayer.TaxPayer;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {
	}

	public Company(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		
		//sintaxe sugar, if ternário
		//double tax = (getNumberOfEmployees() <= 10) ? getAnnualIncome() * 0.16 : getAnnualIncome() * 0.14;
				
		double tax = 0;
		if (getNumberOfEmployees() <= 10) {
			tax = getAnnualIncome() * 0.16;
		} else {
			tax = getAnnualIncome() * 0.14;
		}
		return tax;
	}
}