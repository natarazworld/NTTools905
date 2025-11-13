package com.nt.upi;

public class UPIPayment {
	
	public  String  doUPIPayment(long mobileno, float amount) {
		return amount+" amount is transffered to  mobile number ::"+mobileno +" Using BharatPe";
	}
	
	public  String  doUPIPaymentByAcno(long accno, float amount) {
		return amount+" amount is transffered to  accno ::"+accno +" Using BharatPe";
	}
	
	
	

}
