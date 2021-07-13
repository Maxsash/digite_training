package com.digite.bank;

public class Savings extends Accounts {

	public Savings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Savings(String holder) {
		super(holder, MIN_SAVINGS_BALANCE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount < (balance - MIN_SAVINGS_BALANCE)) {
			balance -= amount;
//			txns[index ++] = new Transaction("Dr", amount, balance);
			txns.add(new Transaction("Dr", amount, balance));
	}
		else
			throw new BalanceException("Insufficient Balance");
	}

}
