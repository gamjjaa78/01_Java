package edu.kh.basic;

// 초록색으로 변하는데 이건 주석줄이야~
// 한줄주석:컴파일러가 해석하지 않는대~
/* 다줄주석으로
 * 7번까지 주석이 되는거야~
별 없어도 에러안나ㅋㅋㅋㅋ
  */ 
public class JavaTest {
	//main 메서드=함수식(하나의 기능을 하는 식)
	//자바 프로그램(애플리케이션)을 실행하기 위한 반드시 필요한 구문
	//main > C+space > 메인메서드 자동완성
	public static void main(String[] args) {
		//실행방법:C+f11 동시
		//상단 초록색 재생버튼
		System.out.println("Hello World!!!");
		//syso > 자동완성단축키
		//C+R+위아래방향키:해당줄복사
		System.out.println("hi");
		System.out.println();//개행만
		System.out.println("성심당 가고 싶다");
		System.out.println("1234");
		System.out.println("1+2");//"" 안의 코드는 단순 문자열로 인식
		System.out.println(1+2);//숫자, 변수로 인식
		System.out.println(50-23);
		System.out.println(12*13);
		System.out.println(300/5);
		System.out.println(12%7);//모듈러modulo, 나누기의 몫이 아니라 나머지를 구함
		System.out.println("14*19="+14*19);
		System.out.println("90+70+65="+ 90+70+65);//사칙연산 우선순위 
		System.out.println("90+70+65="+ (90+70+65));//계산원할시 () 사용
		
	}


}

