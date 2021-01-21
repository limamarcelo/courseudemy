package model.entities.taxpayer.individual;

import model.entities.taxpayer.TaxPayer;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
	}

	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
	
		//sintaxe sugar, if ternário
		//double tax = (getAnnualIncome() < 20000.00) ? getAnnualIncome() * 0.15 : getAnnualIncome() * 0.25;
		
		double tax;
		if (getAnnualIncome() < 20000.00) {
			tax = getAnnualIncome() * 0.15;
		} else {
			tax = getAnnualIncome() * 0.25;
		}

		tax -= getHealthExpenditures() * 0.5;
		if (tax < 0.0) {
			tax = 0.0;
		}
		return tax;
	}
}