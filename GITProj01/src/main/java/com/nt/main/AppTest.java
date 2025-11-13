package com.nt.main;

import com.nt.nb.NetBankingService;
import com.nt.service.ArithmeticOperations;
import com.nt.upi.UPIPayment;

public class AppTest {

	public static void main(String[] args) {
		ArithmeticOperations ops=new ArithmeticOperations();
		System.out.println("Result (Sum) is ::"+ops.sum(10, 20));
        System.out.println("Result (Sub) is::"+ops.sub(20,40));
        
        System.out.println("=====================");
        UPIPayment upip=new UPIPayment();
        System.out.println(upip.doUPIPayment(99999999L, 10000.0f));
        System.out.println("=====================");
        System.out.println(upip.doUPIPaymentByAcno(99999999L, 20000.0f));
        System.out.println("====================");
        NetBankingService  service=new NetBankingService();
        String msg=service.transferMoney(454555L, 4555454L, 5455.0f,"RTGS");
        System.out.println(msg);
        
	}

}
