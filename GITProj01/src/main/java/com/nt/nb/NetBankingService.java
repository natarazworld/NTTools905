package com.nt.nb;

public class NetBankingService {
	
	 // for netbanking
	public String transferMoney(long srcAcno,long destAcno, double amt,String gateway) {
<<<<<<< HEAD
		return  amt+" amount is transfered from "+srcAcno+" to"+ destAcno + "using gateway... "+gateway;
=======
		System.out.println("NetBankingService.transferMoney()");
		return  amt+" amount is transfered from "+srcAcno+" to"+ destAcno + "using gateway "+gateway;
>>>>>>> refs/remotes/origin/B2-NetBanking
	}
	
	

}
