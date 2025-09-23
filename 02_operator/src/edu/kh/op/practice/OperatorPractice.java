package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1 () {
//		인원 수 : 29
//		사탕 개수 : 100
//		1인당 사탕 개수 : 3
//		남는 사탕 개수 : 13
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int per=sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy=sc.nextInt();
		System.out.printf("1인당 사탕 개수 : %d\n", candy/per);
		System.out.printf("남은 사탕 개수 : %d\n\n", candy%per);
														//모듈러는 나머지자리에 기입
														//나누기 후 나머지만 표시한다는 뜻 
	}
	
	public void practice2 () {
//		이름 : 홍길동
//		학년(정수만) : 3
//		반(정수만) : 4
//		번호(정수만) : 15
//		성별(남학생/여학생) : 남학생
//		성적(소수점 아래 둘째 자리까지) : 85.75
//		3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name=sc.next();
		System.out.print("학년(정수만) : ");
		int lv1=sc.nextInt();
		System.out.print("반(정수만) : ");
		int lv2=sc.nextInt();
		System.out.print("번호(정수만) : ");
		int lv3=sc.nextInt();
		System.out.print("성별(남학생/여학생) : ");
		//String gender=sc.next();
		
		String gender=sc.nextLine(); //문자열만 수집, nextLine은 공백도 수집해 공백문자만 출력됨,
										//성별입력 후 개행문자 수집해 공백만 나옴, 개행문자받을 변수1개 더 필요
		String gender2=sc.nextLine();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double gr=sc.nextDouble();
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", lv1, lv2, lv3, name, gender2, gr);
	}
	
	public void practice3 ( ) {
//		국어 : 60
//		영어 : 80
//		수학 : 40
//		합계 : 180
//		평균 : 60.0
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor=sc.nextInt();
		System.out.print("영어 : ");
		int eng=sc.nextInt();
		System.out.print("수학 : ");
		int math=sc.nextInt();
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.1f\n", avg);

		//각 과목 40점 이상, 평균 60점 이상시 합격
		
		boolean result=(kor>=40)&&(eng>=40)&&(math>=40)&&(sum>=60);
		System.out.println(result? "합격":"불합격");		
		//result==true, 로 할 수도 있지만 이미 result에 boolean값 논리값이 있음
		
	}
	
	
}
