package edu.kh.variable2;

import java.util.Scanner;

public class ScannerExample4 {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		//nextInt(), nextDouble(), sc.next() 공백미수집
		//위 기능 사용 후 se.nextLine() 사용시 문제발생
		
		System.out.print("nextInt() 입력 : ");
		int inNum=sc.nextInt();//정수값 입력
		//정수값과 공백문자(엔터)가 입력버퍼에 들어감
		//nextInt()는 정수값만 수집해 입력버퍼에 공백문자 남음
		
		//입력버퍼에 남은 개행문자 제거
		sc.nextLine();
				
		System.out.print("nextLine() 입력 : ");
		String word=sc.nextLine();//공백포함(개행까지)
		
			

	}

}
