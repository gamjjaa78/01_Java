package edu.kh.variable;

public class VariableExample2 {

	public static void main(String[] args) {

		/*자바의 기본자료형 8가지
		 *논리형:boolean 1byte
		 *정수형:byte, short, int, long
		 *실수형:float, double
		 *문자형:char
		 *
		 *참조형:문자열 String 
		 */

		//변수선언:메모리(RAm)에 값을 저장할 공간을 할당하는 것
		//변수값대입:변수에 값을 집어넣는 것==초기화
		
		boolean booleanData; //변수선언
		//자료형  변수명;
		//메모리에 논리값(t/f)을 저장할 공간을 1byte 할당하고
		//할당된 공간의 이름을 booleanData라고 정하겠다
		
		booleanData=true;//booleanData 변수에 true 논리값 대입
		//값을 변수에 최초로 대입->초기화
		
		System.out.println("booleanData : " + booleanData);
		
		
		
		byte byteData;//변수선언
		//메모리에 정수값을 저장할 공간을 1byte 할당하고
		//할당된 공간의 이름을 byteData라고 정하겠다
		
		byte byteNumber = 127; //값의범위(-128~128)
		//변수선언과 동시에 대입
		
		short shortNumber=32767;//값의범위(-32768~32767), 양수의 끝
		
		//정수 자료형의 대표 자료형! int
		
		int intNumber=2147483647;
		
		//리터럴:변수에 대입 또는 작성돼지는 값 자체
		//자료형에 따라 리터럴 표기법 상이
		long longNumber=10000000000l;
		//The literal 10000000000 of type int is out of range
		//100억이라는 값은 int의 범위를 벗어남
		//리터럴값 자체를 int로 인식
		//우리가 int형 리터럴 표기법으로 100억을 나타냈기 때문
		//->뒤에 L(대소문자 상관없음)을 붙여줌으로 long 자료형인것을 나타냄
		
		float floatNumber=1.2345f;
		//1.2345만 쓰면 double 자료형으로 인식
		//변수 타입인 float과 미일치로 Type mismatch 에러발생
		//->float의 리터럴 표기법인 f(대소문자 상관없음)를 붙여 float 자료형값임을 나타냄
		
		double doubleNumber=3.141592;
		//실수형 대표는 double
		//리터럴 표기법이 없는 실수는 기본적으로 double로 인식
		//리터럴 표기법 D/d를 쓸 수는 있음
		
		char ch='A';
		//문자형 리터럴 표기법 : ''(홑따옴표)
		//->문자 하나
		char ch2=66;//B를 쓰거나 B의 유니코드인 66을 쓰거나,,
		
		System.out.println("ch:"+ch);
		System.out.println("ch2:"+ch2);
		/*char 자료형에 숫자가 대입될 수 있는 이유
		 * 컴퓨터에는 문자표 존재
		 * 숫자에 따라 지정된 문자 모양이 각각 매핑되고
		 * 'B' 문자 그대로 대입되면 변수에 숫ㅅ자 66으로 변환돼 저장
		 * ->반대로 생각시 변수에 66이라는 숫자를 저장하는 것도 가능
		 */
		
		//변수명명규칙
		//1. 대소문자 구분, 길이제한x
		int abcdefg123456789;
		int abcdefG123456789;
		//2. 예약어 불가
		//double final;
		//3. 숫자 시작 x (포함은 가능)
		//char 1abc;
		char a1bc;
		//4. 특수문자 $, _만 사용가능(하지만 안씀)
		int $intNumber; //문제없음
		int int_Number; //자바는 카멜케이스 사용
						//_작성 표기법은 DB에서 사용
						//자바 상수에서 사용
						//PI_VALUE
		//5. 카멜표기법 (맨처음 소문자 시작, 후속단어 첫글자 대문자
		char helloWorldAppleBananaTomato;
		//6. 변수명은 언어안가림(하지만 안씀)
		int 정수1번;
		double 실수2번=3.14;
		System.out.println(실수2번);
		
		//------------------------------
		
		final double PI_VALUE=3.14;
		//PI_VALUE=2.23; 에러!재대입불가
		
		/*상수(항상 같은 수)
		 * 변수의 한 종류(값이 변하지 않는 변수)
		 * 한번 값이 대입되면 다른값 재대입 불가
		 * 자료형 앞에 final 키워드 작성
		 * 명명규칙:모두 대문자, 단어구분시 _ 사용
		 * 1)변하면 안되는 고정값을 저장할때 2)특정값에 의미부여시
		 */
		
		final int MIN_AGE=1;
		final int MAX_AGE=130;
		final int LEFT_MOVE=-1;
		final int RIGHT_MOVE=1;
		
		
		
		
		
		
		
	}

}
