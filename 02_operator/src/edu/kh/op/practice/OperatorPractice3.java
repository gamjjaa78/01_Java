package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	Scanner sc = new Scanner(System.in); //전역변수
	
	public void practice1() {
//		회원이라면 10% 할인을 적용하고, 그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라
//		[실행화면]
//				가격을 입력 하세요 : 10000
//				멤버십 있으세요? (있으면 true / 없으면 false 입력) : true
//				할인을 포함한 최종금액 : 9000.0원


		//Scanner sc = new Scanner(System.in); //지역변수
		System.out.print("가격을 입력 하세요 : ");
		int price=sc.nextInt();
		System.out.print("멤버십 있으세요? (있으면 true / 없으면 false 입력) : ");
		//String isMember=sc.next() 자바에서 문자열끼리 비교불가, equals() 비교 사용
		boolean isMember = sc.nextBoolean();
	      
	    double discount = isMember ? price * 0.10 : price * 0.05;
	    double totaPrice  = price - discount;
	      
	    System.out.println("할인가격 : " + discount);
	    System.out.println("할인을 포함한 최종 금액 : " + totaPrice );
		System.out.println();
		
//		double total =  result ? price-(price/10) : price-(price/20);
//		System.out.printf("할인을 포함한 최종금액 : %.1f", total);
//		System.out.printf("할인을 포함한 최종금액 : %.1f\n\n", result ? price-(price/10.0) : price-(price/20.0));
												//정수와 실수계산시 실수로 자동형변환, %는 자바에선 모듈러임 
		

	}
	
	public void practice2() {
//		ATM에서 사용자가 원하는 금액을 입력하면, 5만원, 1만원, 5천원, 1천원 단위로 최소 개수의 지폐로 돈을 인출하라
//		[실행화면]
//				출금할 금액 입력 : 123000
//				50000원: 2
//				10000원: 2
//				5000원: 0
//				1000원: 3
		
		//Scanner sc = new Scanner(System.in);
		System.out.print("출금할 금액 입력 : ");
		int amount=sc.nextInt();
		
		int fiftyTh=amount/50000;
		amount %= 50000; //복합대입연산자, amount=amount%50000, 5만원 지폐를 거르고 난 뒤 나머지 금액
		System.out.println("5만원권 제거 " +amount);
		
		int tenTh=amount/10000;
		amount %= 10000;
		System.out.println("1만원권 제거 " +amount);

		int fiveTh=amount/5000;
		amount %= 5000;
		System.out.println("5천원권 제거 " +amount);
	
		int oneTh=amount/10000;
		
		System.out.println();
		System.out.println("50000원 : "+fiftyTh);		
		System.out.println("10000원 : "+tenTh);		
		System.out.println("5000원 : "+fiveTh);		
		System.out.println("1000원 : "+oneTh);		
		System.out.println();		
		
//		int price2=(price-price1*50000)/10000;
//		int price3=(price-(price1*50000)-(price2*10000))/5000;
//		int price4=(price-(price1*50000)-(price2*10000)-(price3*5000))/1000;
		
		//System.out.printf("50000원 : %d\n10000원 : %d\n5000원 : %d\n1000원 : %d\n", price1, price2, price3, price4);

	}
	
	public void practice3() {
		
//		사용자로부터 두 개의 정수를 입력받아, 
//		첫 번째 수가 두 번째 수의 배수인지 확인하고 결과를 출력해라
//		만약 배수라면 "배수입니다"를 출력하고, 아니라면 "배수가 아닙니다"를 출력
//
//		[실행화면]
//		첫 번째 수 : 100
//		두 번째 수 : 5
//		배수입니다
		
		//Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수 : ");
		int num=sc.nextInt();
		System.out.print("두 번째 수 : ");
		int num1=sc.nextInt();
		
		String result=num%num1==0? "배수입니다." : "배수가 아닙니다.";
		System.out.println(result);
		
	}
	
}
