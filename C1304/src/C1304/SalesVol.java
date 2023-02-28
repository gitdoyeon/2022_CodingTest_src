package C1304;

import java.util.Scanner;

public class SalesVol {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int sale[][]=new int[3][6];
		
		// 년도별 판매량 입력
		for(int i=0; i<sale.length; i++) {
			System.out.print((i+2019)+"년도 : ");
			for(int j=0; j<(sale[i].length-2); j++) {
				sale[i][j]=scan.nextInt();
				sale[i][4]+=sale[i][j];	// 연간판매량
			}
		}
		
		// 누적판매량
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(sale[i][5]==sale[0][5]) {
					sale[0][5]=sale[0][4];
				}
				else {
					sale[i][5]=sale[j][5]+sale[j][4];
				}
			}
		}
		System.out.print("\n");
		
		// 년도별, 분기별 판매량과 연간판매량 누적판매량을 출력
		System.out.println("\t\t1사분기\t2사분기\t3사분기\t4사분기\t연간판매량\t누적판매량");
		for(int i=0; i<sale.length; i++) {
			System.out.printf("%d년도 :\t%4d\t%4d\t%4d\t%4d\t%4d\t%4d\n", (i+2019), sale[i][0], sale[i][1], sale[i][2], sale[i][3], sale[i][4], sale[i][5]);
		}
		
	}

}