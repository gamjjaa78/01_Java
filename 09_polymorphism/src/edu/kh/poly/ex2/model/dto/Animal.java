package edu.kh.poly.ex2.model.dto;

public abstract class Animal {
	// 추상클래스
	// 미완성 클래스로 미완성메서드(추상메서드) 보유
	// ->객체로 만들 수 없음
	// ->여러 타입들을 관리키위한 상위 타입의 목적(=부모타입 참조변수)
	// 객체 생성 후 사용하기 위한 목적아님

	// 속성
	private String type;
	private String eatType;

	// 기능
	public Animal() {
	}

	public Animal(String type, String eatType) {
		super();
		this.type = type;
		this.eatType = eatType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEatType() {
		return eatType;
	}

	public void setEatType(String eatType) {
		this.eatType = eatType;
	}

	// 동물의 공통기능 추출(추상화)
	// 동물은 공통적으로 먹고 숨쉬고 움직이지만, 어떤 동물이냐에 따라 방법이 다 다름!
	// -> 헤딩 클래스에 메서드 정의를 자세히 할 수 없다!
	// ->미완성 상태로 메서드 만들어 상속받은 자식들이 본인에게 맞는 정의를 하도록 오버라이딩 강제화
	// ->추상 메서드(abstract method)로 작성

	public abstract void eat();

	public abstract void breath();

	public abstract void move();
	// 추상 메서드가 하나라도 있다면 해당 클래스는 반드시 추상클래스어야 함
	// 추상 클래스는 일반 멤버(필드, 메서드도 작성가능)

	@Override
	public String toString() {
		return type + "/" + eatType;
	}

}
