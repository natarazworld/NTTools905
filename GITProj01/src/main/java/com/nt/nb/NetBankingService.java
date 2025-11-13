package com.nt.nb;

import java.util.Random;

public class NetBankingService {
	
	 // for netbanking
	public String transferMoney(long srcAcno,long destAcno, double amt,String gateway) {
		System.out.println("NetBankingService.transferMoney()");
		return  amt+" amount is transfered from "+srcAcno+" to"+ destAcno + "using gateway "+gateway;
	}
	
	public   float  getBalance() {
		//write  logic (incomplete)
		float balance=(float)new Random().nextInt(10000000);
		return  balance;
	}
	
	

}
