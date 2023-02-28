package C1304;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A[]=new int[5];		// 첫번째 데이타를 넣을 배열
		int B[]=new int[5];		// 두번째 데이타를 넣을 배열
		int tot[]=new int[10];	// 첫번째 두번째 데이타를 합친 배열
		int temp[]=new int[10];
		int count = 0;
		int num=0;				// 오름차순 비교 변수
		
		// 첫번째 배열(A)에 데이타 입력
		System.out.print("첫번째 배열의 데이타 : ");
		for(int i=0; i<A.length; i++) {
			A[i]=scan.nextInt();
			tot[i]=A[i];
		}
		
		// 두번째 배열(B)에 데이타 입력
		System.out.print("두번째 배열의 데이타 : ");
		for(int i=0; i<B.length; i++) {
			B[i]=scan.nextInt();
			tot[i+5]=B[i];
		}

		// 중복을 걸러주는 for문
		for(int i = 0; i < tot.length; i++){
			boolean flag = false;
			for(int j = 0; j < temp.length; j++){
				if(tot[i] == temp[j]){
					flag= true;
				}
			}
			// 중복이 배제된 값이 저장
			if(!flag){
				temp[count++] = tot[i];
			}
		}
			
		// 배열 A와 B 데이타 오름차순 정렬
		for(int i=0; i<tot.length; i++) {
			for(int j=(i+1); j<tot.length; j++) {	
				if(tot[i]>tot[j]) { 
					num=tot[i];	
					tot[i]=tot[j];
					tot[j]=num;
				}
			}
		}
		
		// 0을 배제 해주기 위한 부분
		int[] result = new int[count];
		for(int i = 0; i < result.length; i++){
			result[i] = temp[i];
		}
		
		// 병합된 배열의 데이타
		System.out.println("병합된 배열의 데이타 : "+Arrays.toString(result)+" ");
		
	}

}
	
