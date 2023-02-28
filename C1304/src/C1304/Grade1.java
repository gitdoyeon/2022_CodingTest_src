package C1304;

import java.util.Scanner;

public class Grade1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("학생수 입력 : ");
		int stu=scan.nextInt();
		System.out.print("\n");
		
		int score[][]=new int[stu][5];
		
		// 점수 입력
		for(int i=0; i<stu; i++) {
			for(int j=0; j<3; j++) {
				do {
					System.out.print("점수 "+(j+1)+" 입력 : ");
					score[i][j]=scan.nextInt();
					if(score[i][j]<0 || score[i][j]>100) {
						System.out.print("다시 입력하세요==>");
					}
				}while(score[i][j]<0 || score[i][j]>100);
			}
			System.out.print("\n");
		}
	
		// 최고점 구하기
		for(int i=0; i<stu; i++) {
			for(int j=0; j<score.length; j++) {
			if(score[i][j]==score[0][j]) { 			// 순번1 학생의 최고점
				for(int k=0; k<4; k++) { 
					if(score[0][k]>score[0][k+1]) {	
						score[0][3]=score[0][0];
					}
					else {
						score[0][3]=score[0][k+1];
					}
				}
			}
			else {									// 순번1 학생을 제외한 학생들의 최고점
				if(score[i][j]>score[i][j+1])
					score[i][3]=score[i][j];
				else 
					score[i][3]=score[i][j+1];
			}
			}
		}
			
		// 평점
		for(int i=0; i<stu; i++) {
				switch(score[i][3]/10) {
					case 9: case 10: score[i][4]+=5; break;
					case 8: score[i][4]+=4; break;
					case 7: score[i][4]+=3; break;
					case 6: score[i][4]+=2; break;
					default: score[i][4]+=1; break;
			}	
		}
		
		// 학급 성적 출력
		System.out.println("===========================================");
		System.out.println("순번\t점수1\t점수2\t점수3\t최고점\t평점");
		System.out.println("===========================================");
		for(int i=0; i<stu; i++) {
			System.out.printf("%d\t%3d\t%3d\t%3d\t%3d\t%3d\n", (i+1), score[i][0], score[i][1], score[i][2], score[i][3], score[i][4]);
		}
		System.out.println("===========================================");
		
	}

}
