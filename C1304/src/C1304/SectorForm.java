package C1304;

import java.util.Scanner;

class Sector{
	double radius=0;	// 반지름
	int angle=90;		// 중심각
	
	Sector(double r1){}
	
	public void Radius(double r1, int angle) {
		this.radius=r1;
		this.angle=angle;
	}
	
	public double getR(double radius) {
		return radius;
	}
	
	public void printResult(double radius) {	//결과 출력
		System.out.print("반지름이 "+radius+"인 부채꼴의 면적 : ");
		area(radius);
		System.out.print(" , 둘레 : ");
		circum(radius);
	}
	
	public void area(double radius) {	// 부채꼴 면적
		double area=(1/2)*radius*radius*angle;
		System.out.print(area);
	}
	
	public void circum(double radius) {	// 부채꼴 둘레
		double circum=(2*radius)+(angle*radius);
		System.out.print(circum);
	}
	
}

public class SectorForm {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("반지름 입력 : ");
		double r1=scan.nextDouble();
		Sector s1 = new Sector(r1);
		s1.printResult(r1);
	
	}

}