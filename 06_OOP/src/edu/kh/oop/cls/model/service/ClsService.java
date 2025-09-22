package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
//import edu.kh.oop.cls.model.vo.TestVO;

//	ClsService와 Student/TestVO는 패키지가 다름
public class ClsService extends Student {
//	부모로 Student 클래스를 상속받음
//	ClsService(자식)<Student(부모)

	public void ex1() {
		Student std = new Student();

//		TestVO testvo = new TestVO();
//		(default) 클래스는 같은 패키지에서만 사용가능
//		다른 패키지라 import 불가능

//		필드 접근제한자 확인하기
//		상속 관계에서 직접 접근가능 범위테스트
//		*상속받으면 부모의 것도 내것처럼 이용
		System.out.println(v1); // public 전체에서 접근가능
//		System.out.println(v2); //protected 가능
//		System.out.println(v3); //default -> 다른패키지 불가
//		System.out.println(v4); //private -> 같은 클래스 아니라서 안됨

	}

}
