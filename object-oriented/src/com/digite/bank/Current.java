package com.digite.bank;

public class Current extends Accounts {
	private double overdraft;

	public Current() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Current(String holder) {
		super(holder, INIT_CURRENT_BALANCE);
		this.overdraft = OVERDRAFT_LIMIT;
		System.out.println("Overdraft: " + overdraft);
	}

	@Override
	public void deposit(double amount) {
			balance += amount - (OVERDRAFT_LIMIT- overdraft); 
			overdraft += (OVERDRAFT_LIMIT- overdraft);
//			txns[index ++] = new Transaction("Cr", amount, balance);
			txns.add(new Transaction("Cr", amount, balance));
		}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount < (balance + overdraft)) {
			balance -= amount;
			if(balance<MIN_CURRENT_BALANCE) {
				overdraft += balance;
				balance = MIN_CURRENT_BALANCE;
			}
//			txns[index ++] = new Transaction("Dr", amount, balance);
			txns.add(new Transaction("Dr", amount, balance));
		} else
			throw new BalanceException("Insufficient Balance");
	}

	@Override
	public void summary() {
		// TODO Auto-generated method stub
		super.summary();
		System.out.println("Overdraft: " + overdraft);
	}
	
	

}
