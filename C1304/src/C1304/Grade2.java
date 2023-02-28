package C1304;

import java.util.Scanner;

public class Grade2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		double score[][]=new double[3][2]; //점수
		double tot=0; //점수 총합
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print((i+1)+"학년 "+(j+1)+"학기 점수 입력 : ");
				score[i][j]=scan.nextInt();
				tot+=score[i][j];
			}
		}
		double avg=tot/6; //평균
		
		System.out.printf("3년간 의 평균 : %.2f", avg);
				
	}

}