package entities.person.physical;

import entities.person.Person;

public class PhysicalPerson extends Person {

	private Double healthSpending;

	public PhysicalPerson() {
	}

	public PhysicalPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public double tax() {
		double tax = 0;
		if (annualIncome < 20000.00) {
			tax = annualIncome * 0.15;
		} else {
			if (healthSpending > 0) {
				tax = (annualIncome * 0.25) - (healthSpending * 0.50);
			} else {
				tax = annualIncome * 0.25;
			}
		}
		return tax;
	}
}