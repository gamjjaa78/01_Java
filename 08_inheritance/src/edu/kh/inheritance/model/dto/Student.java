package edu.kh.inheritance.model.dto;

//	Object
//	ㄴPerson
//		ㄴStudent

//자식 			//부모
public class Student extends Person {
	// Student 클래스에 Person 클래스 내용을 확장/연장
	// Student 클래스에 Person 클래스의 필드, 메서드를 추가 및 확장

	// 속성
//	private String name;
//	private int age;
//	private String nationality; //person이 가지고 있음
	private int grade;
	private int classroom;

	public Student() {
	}

	public Student(String name, int age, String nationality, int grade, int classroom) {
//		this.name = name;
//		this.age = age;
//		this.nationality = nationality;
//		왜안될까? this 참조변수는 본인 자신만을 의미함
//		부모의 고유 필드인 name, age, nationality 는 this가 참조하고 있는 주소의 필드의 아니기 때문에 this 참조변수로 접근불가!

		super(name, age, nationality); // 부모의 매개변수 생성자
		// super() 생성자 작성시 생성자 메서드 내 반드시 첫번째 줄에 작성!

//		setName(name);
//		setAge(age);
//		setNationality(nationality);
//		setter 메서드로 초기화 가능은 하나 비효율적

		this.grade = grade;
		this.classroom = classroom;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getNationality() {
//		return nationality;
//	}
//
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	@Override
	public String toString() {
		//super. : super 참조변수
		//상속관계에서 부모객체를 가리키는 차조변수
		return super.toString() + " / " + grade + " / " + classroom;
	}
}
