package edu.kh.poly.ex2.model.dto;

public class Person extends Animal {

	// The type Person must implement the inherited abstract method Animal.move()
	// 반드시 구현해야 되는 상속받은 추상메서드 있음
	// ->Animal이 가진 추상메서드 eat(), breath(), move() 모두
	// 상속받은 Person이 본인에게 맞게끔 오버라이딩(재정의)해라!(강제화)

	private String name;

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String type, String eatType, String name) {
		super(type, eatType);
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("숟가락, 젓가락 등 도구이용해 먹음");
	}

	@Override
	public void breath() {
		System.out.println("코와 입으로 들숨날숨");
	}

	@Override
	public void move() {
		System.out.println("두 발로 걷고 뛰고");
	}

	@Override
	public String toString() {
		return "Person:" + super.toString() + "/" + name;
	}

}
