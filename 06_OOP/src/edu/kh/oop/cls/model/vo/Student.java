package edu.kh.oop.cls.model.vo;

public class Student { // 클래스 선언부
//	[접근제한자] [예약어] class 클래스명 {}
//	접근제한자 public : 같은 프로젝트 내부라면 어떤 클래스든 import하여 사용

//	TestVO testvo = new TestVO();
//	(default) 클래스는 같은 패키지에서만 사용가능

//	1. 필드 field
//	필드 접근제한자 예제
//	필드 접근제한자 : 직접 접근 가능한 범위를 나타냄
	public int v1 = 10; // 전체
	protected int v2 = 20; // 후손클래스
	int v3 = 30; // (default) 같은 패키지
	private int v4 = 40; // 해당 클래스 내부

//	2. 생성자
//	3. 메서드

	public void ex() {
		// 필드 접근제한자 확인하기
		// v1~v4까지 전부 Student 클래스 내부에서 생성된 변수로 전부 직접 접근 가능
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);

	}

}
