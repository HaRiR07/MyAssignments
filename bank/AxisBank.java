package org.bank;

public class AxisBank extends Bankinfo{

	public void deposit() {
		System.out.println("Deposit : 1000");
		
	}
	public static void main(String[] args) {
		AxisBank amt = new AxisBank();
		amt.saving();
		amt.fixed();
		amt.deposit();
	}
}

