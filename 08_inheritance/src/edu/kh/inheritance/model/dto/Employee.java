package edu.kh.inheritance.model.dto;

public class Employee extends Person {
//	Object->Person->Employee/Student (같은 부모만 상속, 서로 관계없음)
	private String company;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality); // Person 매개변수 생성자
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

//	Person으로부터 상속받은 메서드 중
//	move() 메서드를 Employee 에 맞게 재정의
//	@Override 어노테이션 : 해당 메서드가 오버라이딩됐음을 컴파일러에게 알려줌
//	->컴파일러에게 문법체크하도록 알림
//	->부모에게 해당 메서드 있는지 체크
//	->이름, 매개변수 타입과 개수, 순서 일치하는 여부검사

	@Override
	public void move() {
		System.out.println("오버라이딩된 move()");
		System.out.println("효율적으로 일하고 빨리 퇴근, 어두운 조명 아래~");
	}

	@Override
	public String toString() {
		return super.toString() + "/" + company;
	}

}
