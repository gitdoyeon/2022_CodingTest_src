package C1304;

import java.util.Scanner;

class Cal{ //멤버변수
	int a;
	int b;
	
	public Cal(int n1, int n2) {
		this.a=n1;
		this.b=n2;
	}

	public void printResult() {	// 결과 출력
		System.out.println("===두수의 사칙연산 결과===");
		add(); minus(); mul(); div();
	}
	
	public void add(){ // 덧셈
	  System.out.println(a+" + "+b+" = "+(a+b));
	}
	
	public void minus() { // 뺼셈
		System.out.println(a+" - "+b+" = "+(a-b));
	}
	
	public void mul() { // 곱셈
		System.out.println(a+" * "+b+" = "+(a*b));
	}
	
	public void div() { // 나눗셈
		double div=(a/b);
		System.out.printf("%d / %d = %.1f", a, b, div);
	}

}

public class Calculate {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		 System.out.print("계산하고자 하는 첫번째 수 입력 : ");
		 int n1 = scan.nextInt();
		 System.out.print("계산하고자 하는 두번째 수 입력 : ");
		 int n2 = scan.nextInt();
		 Cal c1 = new Cal(n1,n2);
		 c1.printResult();


	}

}
