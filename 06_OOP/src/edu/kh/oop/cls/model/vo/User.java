package edu.kh.oop.cls.model.vo;

public class User {
//	속성(필드)
//	아이디, 비밀번호, 이름, 나이 성별 (추상화 진행)
//	클래스 외부에서 데이터에 직접접근 불가원칙
//	->필드 접근제한자를 모두 private 작성(캡슐화 진행)
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
//	기본생성자->매개변수없는 생성자, 일종의 메서드, 객체생성해줌
//	기본생성자 자동완성 단축키 C+space+enter
	public User () {
		System.out.println("기본생성자로 User 객체 생성");
	
//	필드 초기화
//		userId="user01";
//		userPw="pass01";
//		userName="홍길동01";
//		userAge=21;
//		userGender='남';
//		ㄴ주석처리시 컴파일러가 기본생성자 없음 자동생성
	}
	
//	매개변수 생성자
//	매개변수:생성자나 메서드 호출시 () 안에 작성돼 전달되는 값을 저장하는 변수
	
	public User(String userId, String userPw) {
//		필드 초기화
		this.userId=userId; //색깔 or C+마우스좌클릭로 변수확인가능
		this.userPw=userPw;
//		this 참조변수
//		객체가 자기자신을 참조할 수 있도록 하는 변수
//		필드명과 매개변수명이 같은 경우 이를 구분하기 위해 사용
	}

//	매개변수 생성자 자동완성
//	A+s -> generate construction-> generate 클릭
//	필드를 전부 초기화하는 목적의 매개변수 생성자
	public User(String userId, String userPw, String userName,
			    int userAge, char userGender) {
		
//		this() 생성자:같은 클래스의 다른 생성자 호출시 사용
//		중복코드제거, 코드길이감소, 재사용성증가 / 가독성 저하
//		매개변수없으면 기본생성자, 아래 2줄과 같음
//		생성자 내에서 반드시 첫줄에 있어야함
		this(userId, userPw); 
//		this.userId = userId;
//		this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	
	}
	
	//	기능(메서드)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public char getUserGender() {
		return userGender;
	}
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
//	자바는 기본적으로 필드명,생성자명,메서드명,변수명의 중복 허용안함
//	private String userId; //Duplicate field User.userId
	
//	오버로딩 Overloading
//	클래스 내 동일한 이름의 메서드(생성자 포함)를 여러개 작성하는 기법
//	1)메서드명 동일
//	2)매개변수의 타입(자료형), 개수, 순서가 달라야
//	3)리턴타입은 상동 상관없음
//	4)변수명은 신경안씀->변수명 달라도 매개변수 자료형,개수,순서같다면 오버로딩 성립불가
	
//	public User() {}
	public User(String userId) {}
//	매개변수의 개수가 같은 생성자 없음->오버로딩 성립
	public User(int userAge) {}
//	매개변수의 개수가 같은 것은 있으나 타입다름->오버로딩 성립
	public User(String userId, int userAge) {}
//	매개변수의 개수가 같은 것은 있으나 하나의 타입다름->오버로딩 성립
	public User(int Age, String name) {}
//	매개변수의 개수, 타입, 순서 모두 같아 불가->변수명은 신경않씀
	
	/*생성자 constructor
	 * new 연산자를 통해 객체생성시 생성된 객체의 필드값 초기화+지정된 기능 수행
	 * 
	 * 작성규칙
	 * 생성자 이름은 반드시 클래스명과 일치
	 * 반환형 미존재
	 * 
	 * 생성자 종류
	 * 기본 생성자
	 * 매개변수 생성자
	 * 
	 * 생성자가 하나도 없을때 컴파일러가 기본생성자 자동생성	 
	 */
}
