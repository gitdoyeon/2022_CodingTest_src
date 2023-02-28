package C1304;
import java.util.Scanner;

class Bank {
	private String account_num;	// 계좌번호
	int balance_money;			// 잔액
	
	Bank(String an){ 
		account_num=an;	// 계좌번호
	}
	
		public void deposit(int dmoney) {	// 입금
		this.balance_money+=dmoney;
		System.out.println(toString());
	}
	
	public void withdraw(int wmoney) { // 출금
		if(this.balance_money<wmoney) {			// 잔액이 부족할 때
			System.out.println("잔액이 부족합니다.");
		}
		else {									// 잔액이 충분할 때
			this.balance_money-=wmoney;
			System.out.println(toString());
		}
	}
	
	public String toString(){//메시지 출력
		return "계좌번호 "+account_num+"의 현재 잔액 : "+balance_money;
	}
	
	String getAN(){
		return account_num;
	}
}

public class Account {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String account[]=new String[3];	// 계좌번호
		int balance[]=new int[3];		// 잔액
		
		// 계좌번호, 입금액, 출금액 입력
		for(int i=0; i<account.length; i++) {
			System.out.println("=======================================");
			System.out.print("계좌번호를 입력하세요. : ");
			String an=scan.next();
			account[i]=an;
			Bank ac=new Bank(an);
			ac.toString();
		
			System.out.print("\n입금액을 입력하세요. : ");
			ac.deposit(scan.nextInt());
		
			System.out.print("\n출금액을 입력하세요. : ");
			ac.withdraw(scan.nextInt());
		}
		
		// 입력한 계좌번호, 잔액 출력
		System.out.print("\n=======================================\n");
		System.out.println("계좌번호\t\t잔액");
		System.out.print("=======================================\n");
		for(int i=0; i<account.length; i++) {
			System.out.printf("%s\t\t%d\n", account[i], balance[i]);
		}
		System.out.print("=======================================");
		
	}

}
