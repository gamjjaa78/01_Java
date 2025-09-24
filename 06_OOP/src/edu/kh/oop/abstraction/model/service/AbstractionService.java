package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

//	service : 특정 기능(비즈니스 로직)을 제공하는 패키지
//	비밀번호 암호화, 파일 검사 등

public class AbstractionService {
//	속성, 기능

	public void ex1() {
//		people 클래스 이용해 국민 객체 만들기
		People p1 = new People();
//		People p1 : People 객체 주소 저장해 참조하는 변수 p1(==참조변수)
//		new People() : 새로운 People 객체를 Heap 영역에 생성

		/*
		 * p1.name="홍길동"; p1.gender='남'; p1.pNo="123456-1234567";
		 * p1.address="서울 중구 남대문로 120"; p1.phone="010-1234-1234"; p1.age=20;
		 * 
		 * p1.tax(); p1.vote();
		 * 
		 * System.out.println("p1의 name : "+p1.name);
		 * System.out.println("p1의 gender : "+p1.gender);
		 * System.out.println("p1의 pNo : "+p1.pNo);
		 * System.out.println("p1의 address : "+p1.address);
		 * System.out.println("p1의 phone : "+p1.phone);
		 * System.out.println("p1의 age : "+p1.age);
		 */

//		값을 호출한 자리로 얻어옴==getter
//		p1.getName(); //메서드의 호출

//		전달값을 객체의 필드에 세팅==setter
//		p1.setName("홍길동");
		// 전달인자

//		p1.getGender();
//		p1.setGender('남');
//
//		p1.getpNo();
//		p1.setpNo("123456-1234567");
//
//		p1.getAddress();
//		p1.setAddress("서울 중구");
//
//		p1.getPhone();
//		p1.setPhone("02-123-1234");
//
//		p1.getAge();
//		p1.setAge(20);
//
//		System.out.println(p1.getName());
//		System.out.println(p1.getGender());
//		System.out.println(p1.getpNo());
//		System.out.println(p1.getPhone());
//		System.out.println(p1.getAddress());
//		System.out.println(p1.getAge());

		People p2 = new People();

		p2.getName();
		p2.setName("최현정");

		p2.getGender();
		p2.setGender('여');

		p2.getpNo();
		p2.setpNo("123456-2111111");

		p2.getAddress();
		p2.setAddress("서울 중구");

		p2.getPhone();
		p2.setPhone("010-1234-1234");

		p2.getAge();
		p2.setAge(37);

		System.out.println(p2.getName());
		System.out.println(p2.getGender());
		System.out.println(p2.getpNo());
		System.out.println(p2.getPhone());
		System.out.println(p2.getAddress());
		System.out.println(p2.getAge());

	}
}
