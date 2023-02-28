package C1304;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int score[]=new int[10];
		
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+"번째 수 : ");
			score[i]=scan.nextInt();
		}
		int max=score[0];
		
		for(int i=0; i<score.length; i++) {
			if(max<score[i])
				max=score[i];
		}
		System.out.print("가장 큰 수 : "+max);
	}

}
