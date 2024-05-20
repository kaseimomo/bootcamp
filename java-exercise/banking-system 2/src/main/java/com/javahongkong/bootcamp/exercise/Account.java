package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public abstract class Account implements AccountInterface {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin,
			double startingDeposit) {
		// complete the constructor
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = startingDeposit;
	}

	public AccountHolder getAccountHolder() {
		// complete the function
		return this.accountHolder;
	}

	public boolean validatePin(int attemptedPin) {
		// complete the function
		return this.pin == attemptedPin;
	}

	public double getBalance() {
		// complete the function
		return this.balance;
	}

	public double getPin() {
		// complete the function
		return this.pin;
	}

	public Long getAccountNumber() {
		// complete the function
		return this.accountNumber;
	}

	public void creditAccount(double amount) {
		// complete the function
		// BigDecimal newBalance = BigDecimal.valueOf(0);
		// newBalance = BigDecimal.valueOf(getBalance()).add(BigDecimal.valueOf(amount));
		// this.balance = newBalance.doubleValue();
		this.balance += amount;
	}

	public boolean debitAccount(double amount) {
		// complete the function
		// BigDecimal subtractAmount = BigDecimal.valueOf(amount);
		// BigDecimal balance = BigDecimal.valueOf(getBalance());
		double subtractAmount = amount;
		balance = getBalance();
		if (getBalance() >= amount) {
			balance -= subtractAmount;
			return true;
		}
		return false;

	}
}
