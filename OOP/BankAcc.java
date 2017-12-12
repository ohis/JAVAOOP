package com.OOP;
import java.util.*;

public class BankAcc {

	private String accNum;
	private double checkingBal = 0;
    private	double savingsBal = 0;
	private static int numAcc = 0;
	private static double totalAmt = 0;
	
	public BankAcc() {
		this.accNum = AccNum();
		numAcc++;
	}
	
	public void deposit(String accType, double amt) {
		if(accType.equals("checking")) {
			checkingBal+=amt;
		}else if(accType.equals("savings")) {
			savingsBal+=amt;
		}else {
			System.out.println("Could not find acc with name");
		}
		
		totalAmt += amt;
		
	}
	
	public void withdraw(String accType, double amt) {
		if(accType.equals("checking")) {
			if(this.checkingBal < amt) {
				System.out.println("InSUFFICIENT FUNDS in checking");
			}else {
				this.checkingBal-= amt;
			}
			
		}
		else if(accType.equals("savings")) {
			if(this.savingsBal < amt) {
				System.out.println("InSUFFICIENT FUNDS in savings");
			}else {
				this.savingsBal-=amt;
			}
		}else {
			System.out.println("Could not find acc with name");
		}
		
		totalAmt-=amt;
	}
	private String AccNum() {
		Random rand = new Random();
		//String num;
		StringBuilder digit = new StringBuilder();
		for(int i = 0; i < 10; i++) {
		   int val = rand.nextInt(10);
		   digit.append(val);
		}
		
		//int finalDigit = Integer.parseInt(digit.toString());
		return digit.toString();
	}
	
	public double getSavingsBal() {
		return savingsBal;
	}
	
	public double getChecking() {
		return checkingBal;
	}
	
	public double accBal() {
		double total = this.checkingBal + this.savingsBal;
		return total;
	}
	
	
}
