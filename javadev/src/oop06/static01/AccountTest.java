package oop06.static01;
//p.292


public class AccountTest {
	public static void main(String[] args) {
		System.out.println(Account.money1);
		Account ac1=new Account(10000);
		System.out.println("ac1.money1:"+ac1.money1);
		System.out.println("ac1.money2:"+ac1.money2);
		System.out.println();
		
		Account ac2=new Account(10000);
		System.out.println("ac1.money1:"+ac2.money1);
		System.out.println("ac1.money2:"+ac2.money2);
		System.out.println();
		
		Account ac3=new Account(10000);
		System.out.println("ac1.money1:"+ac3.money1);
		System.out.println("ac1.money2:"+ac3.money2);
		System.out.println();
		
	}

}
