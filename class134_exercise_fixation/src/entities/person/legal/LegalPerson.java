package entities.person.legal;

import entities.person.Person;

public class LegalPerson extends Person {

	private int employeesNumber;

	public LegalPerson() {
	}

	public LegalPerson(String name, Double annualIncome, int employeesNumber) {
		super(name, annualIncome);
		this.employeesNumber = employeesNumber;
	}

	public int getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(int employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public double tax() {
		double tax = 0;
		if (employeesNumber <= 10) {
			tax = annualIncome * 0.16;
		} else {
			tax = annualIncome * 0.14;
		}
		return tax;
	}
}