package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
//import edu.kh.oop.cls.model.vo.TestVO;
import edu.kh.oop.cls.model.vo.User;

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

	public void ex2() {
//		static 필드 확인 예제

		Student std1 = new Student();
		Student std2 = new Student();

		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
//		노란줄(경고) 뜨는 이유->제대로 작성안함

//		static이 붙은 변수(필드)/메서드는 '클래스명.변수명'으로 사용함
//		객체안만들고 클래스 이름으로 값에 바로 접근가능
		System.out.println(Student.schoolName);
	}

	public void ex3() {
//		생성자 확인 테스트
//		USer 클래스 이용해 u1 객체 생성
		User u1=new User();
//		개발자가 기본생성자를 만들지 않았다면 컴파일러가 자동생성
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
	
		User u2=new User();
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
//		문제점:u1이 참조하는 User 객체와 u2가 참조하는 User객체의 필드값이 동일
//		같은 기본생성자로 User객체 생성하고 있기 때문에
//		기본생성자에 작성된 코드가 똑같이 수행됨
	
		System.out.println("--------------------------------");
//		방법1:setter 이용해 새로운값 재대입
		u2.setUserId("as12");
		u2.setUserPw("ssap");
		u2.setUserName("김영희");
		u2.setUserAge(25);
		u2.setUserGender('여');
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
//		방법2:매개변수 생성자 이용해 객체생성부터 다른값으로 필드 초기화
		User u3=new User("test3", "pass12");
		
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		System.out.println(u3.getUserName());
		System.out.println(u3.getUserAge());
		System.out.println(u3.getUserGender());
		
		
	}
	
	public void ex4() {
//		매개변수 생성자 예제
		User u1=new User();
		User u2=new User();
		User u3=new User("user03","pass03","홍길동03",23,'남');
//		매개변수 5개 생성자 (전부 초기화)
		
		System.out.printf("u1:%s/%s/%s/%d/%c\n", u1.getUserId(), u1.getUserPw(),
						   u1.getUserName(), u1.getUserAge(), u1.getUserGender());
		
		System.out.printf("u2:%s/%s/%s/%d/%c\n", u2.getUserId(), u2.getUserPw(),
				u2.getUserName(), u2.getUserAge(), u2.getUserGender());
		
		System.out.printf("u3:%s/%s/%s/%d/%c\n", u3.getUserId(), u3.getUserPw(),
				u3.getUserName(), u3.getUserAge(), u3.getUserGender());
		
		
		
	}
	
}
