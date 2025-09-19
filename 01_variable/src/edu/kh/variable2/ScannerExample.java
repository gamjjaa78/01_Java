package edu.kh.variable2;

import java.util.Scanner;

//C+S+o:현재 클래스에서 import 되지 않은 클래스를 자동 import
//사용되지 않는 클래스도 자동 import 삭제

//import:수입, 다른 패키지에 존재하는 클래스를 얻어와야 할 때
//java.util.Scanner:java.util에서 Scanner라는 클래스(설계도)를 수입

public class ScannerExample {

	public static void main(String[] args) {

		//Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할
		//Scanner 객체 생성->프로그램 안에 스캐너라는 기계 생성
		Scanner sc=new Scanner(System.in);
		//import 구문없음 설계도 없는 것과 같아 기계생성불가
		//->오류확인될 시 적절히 import 작성하여 해결
		
		System.out.print("정수 1 입력:");
		int input1=sc.nextInt();//정수입력받는 기능
		//System.out.println(input1);
		
		System.out.print("정수 2 입력:");
		int input2=sc.nextInt();
		
		System.out.printf("%d+%d=%d", input1, input2, input1+input2);
		
		
	}

}
