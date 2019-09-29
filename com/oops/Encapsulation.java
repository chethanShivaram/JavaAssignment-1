package com.oops;

class Account {
 private int accountNo;
 private int accountBal;
	
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public int getAccountBal() {
	return accountBal;
}
public void setAccountBal(int accountBal) {
	this.accountBal = accountBal;
}
}

public class Encapsulation{
public static void main(String[] args) {
	Account obj = new Account();
	obj.setAccountNo(12345);
	obj.setAccountBal(10000);
	
	System.out.println(obj.getAccountNo());
}
}
