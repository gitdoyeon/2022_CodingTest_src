package C1304;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		double num[]=new double[6];

		for(int i=0; i<num.length-1; i++) {
			System.out.print((i+1)+"번째 수 : ");
			num[i]=scan.nextInt();
			num[5]+=num[i];	//1~5번째 수의 합
		}
		double avg=num[5]/(num.length-1);	//1~5번째 수 평균 계산
		
		System.out.printf("평균 : %.2f", avg);	//출력

	}

}
