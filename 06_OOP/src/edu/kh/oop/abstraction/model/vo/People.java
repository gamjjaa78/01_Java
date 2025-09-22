package edu.kh.oop.abstraction.model.vo;
//	m(model), v(view) 화면, c(controller) 서버중심

//	model : 프로그램 로직과 관련돼있는 데이터를 저장하는 용도 + 비즈니스 로직
//	vo(Value Object) : 값 저장용 생성위한 클래스 모아두는 패키지

public class People {
//	클래스란 객체의 특성(속성과 기능)을 정의한 것, 객체 생성위하 설계도
//	속성==값, date, 값을 저장하기 위한 변수 선언
//	->국민이라면 공통적으로 가지고 있는 속성만 작성(추상화)
//	->이름, 성별, 주민번호, 주소, 전화번호, 나이
//	->필드==필드변수==멤버변수

//	캡슐화 : 데이터(속성)와 기능을 하나로 묶어서 관리하는 기법
//	-데이터 직접 접근 제한하는 것이 원칙
//	->클래스 내부에 간접접근방법 제공하는 기능(메서드) 작성 후 사용
//	->getter/setter
	
//	데이터 직접접근제한
//	public (공공의) -> private (사적인, 개인적인) 변경

//	[접근제한자] 자료형 변수명;
	private String name;
	private char gender;
	private String pNo;
	private String address;
	private String phone;
	private int age;

//	기능==행동/동작==method(메서드)

	public void tax() {
		System.out.println("세금 내");
	}

	public void vote() {
		System.out.println("투표 해");
	}

	
//	R+s, source-generate getter and setter
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
//	캡슐화에서 사용할 간접접근기능
//	[접근제한자] 반환형 메서드명(매개변수) {}
//	name 변수의 값을 호출한 쪽으로 돌려보내는 간접접근기능 중 getter
//	void 반환값 없을때, 반환형(자료형)없음 ex.public void getName()
	
//	public String getName() {
//		return name; //name 이라는 반환값 있음, 반환형 : 반환하는 값의 자료형
//		return 반환, 되돌려주다
//		return; 현재 메서드 종료, 호출한 쪽으로 되돌아감
//		return; 현재 메서드 종료, 호출한 쪽으로 되돌아감
//		return 값/변수; 현재 메서드 종료, 값/변수가지고 호출한 쪽으로 되돌아감
//	}
//	public void setName(String name) {
//		this.name=name;
//	}
	
//	*캡슐화때문에 만들어짐
//	getter() 반환형이 무조건 있음
//	getter 은 필드에 작성된 변수값은 호출한 쪽으로 되돌려주는 것
//	-> 변수값은 자료형이 있음
//	-> 변수를 되돌려준다면 당연히 반환형도 존재힘
	
//	setter() 반환형이 없음
//	setter 은 전달인자에 작성된 값을 통해 매개변수로 들어온 값을 객체의 필드에 세팅
//	->매개변수가 항상 있음(==전달인자 값)
//	->전달인자에는 자료형있음->매개변수에도 자료형있음
//	->매개변수 작성법: (자료형 매개변수명)
//	단순히 전달값으로 필드에 값을 세팅하는 역할, 호출한 쪽으로 되돌려준 값은 없음
//	->반환형도 없음 (void 사용)
	
//	public char getGender() {
//		return gender;
//	}
//	public void setGender(char gender) {
//		this.gender=gender;
//	}
//	
//	public String getpNo() {
//		return pNo;
//	}
//	public void setpNo(String pNo) {
//		this.pNo=pNo;
//	}
//	
//	public String getaddress() {
//		return address;
//	}
//	public void setaddress(String address) {
//		this.address=address;
//	}
//
//	public String getphone() {
//		return phone;
//	}
//	public void setphone(String phone) {
//		this.phone=phone;
//	}
//	
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age=age;
//	}
	
	
	
	
	
}
