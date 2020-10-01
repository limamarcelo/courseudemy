package entities;

public class SavingsAccount extends Account{

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interstRate) {
		super(number, holder, balance);
		this.interestRate = interstRate;
	}
	
	public Double getInterestRate() {
		return this.interestRate;
	}
	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance+= balance*interestRate;
	}
}
