package C1304;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("영문자 입력 : ");
		String sentence = scan.nextLine();
		
		String reverse = "";
		
		for(int i=sentence.length()-1; i>=0; i--) {
			reverse += sentence.charAt(i) ;
		}
		System.out.print("변환된 문자 : "+reverse);
		
	}

}
