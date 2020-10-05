package entities;

public final class SavingsAccount extends Account {

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
		balance += balance * interestRate;
	}

	// Informar ao compliador que é uma sobreposição
	@Override
	public final void withdraw(Double amount) {
		balance -= amount;
	}
}
