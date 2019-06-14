package model.entities;

import model.exceptions.AccountException;

public final class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	private void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(Double amount) {
		double aux = getBalance();
		setBalance(aux + amount);
	}

	public void withdraw(Double amount) throws AccountException {
		double balance_aux = this.getBalance();
		double drawLimit = this.getWithdrawLimit();
		double aux = balance_aux - amount;

		if (aux < 0) {
			throw new AccountException("There is no balance");
		} else if (drawLimit < amount) {
			throw new AccountException("The amount exceeds withdraw limit");
		}
		setBalance(aux);
	}

}
