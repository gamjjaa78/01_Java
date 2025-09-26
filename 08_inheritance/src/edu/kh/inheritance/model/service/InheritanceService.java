package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

public class InheritanceService {
	// 상속 확인 예제
	public void ex1() {
		Person p = new Person();
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");

		System.out.println(p.toString());

		Student std = new Student();
		// Person 클래스로부터 상속받은 멤버메서드
		// 사용가능
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("대한민국");

		// Student만의 고유한 멤버 사용가능
		std.setGrade(1);
		std.setClassroom(3);

		// Student만의 고유한 멤버 사용 가능
		std.setGrade(1);
		std.setClassroom(3);

		Student std2 = new Student("홍길순", 20, "미국", 1, 3);

		System.out.println(std2.getName());
		System.out.println(std2.getAge());
		System.out.println(std2.getNationality());
		System.out.println(std2.getName());
		System.out.println(std2.getName());

		Employee emp = new Employee("김노동", 30, "한국", "KH");
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		System.out.println(emp.getCompany());

	}

	// 오버라이딩 확인 예제
	public void ex2() {
		Student std = new Student();
		Employee emp = new Employee();

		std.move(); // 오버라이딩 안됨, Person(부모)의 메서드 수행
		emp.move(); // 오버라이딩 됨, Employee에서 재정의한 메서드 수행

	}

	// toString() 오버라이딩 예제
	public void ex3() {
		Person p = new Person("김철수", 17, "한국");
		System.out.println(p); // 원래는 Person 클래스의 주소값이 나오나 toString으로 재정의해놓음
		System.out.println(p.toString()); // 참조변수명만 작성해도 자동으로 toString() 메서드 호출

		Student std = new Student("강호동", 18, "미국", 2, 6);
		System.out.println(std.toString());

		Employee emp = new Employee("김노동", 36, "한국", "샘송");
		System.out.println(emp);

	}

}
