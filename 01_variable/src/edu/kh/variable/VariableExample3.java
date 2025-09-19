package edu.kh.variable;

public class VariableExample3 {
	public static void main(String[] args) {
		
	
	/*형변환(Casting):값의 자료형을 변환하는 것(단, boolean 제외
	 * 컴퓨터는 기본적으로 같은 자료형끼리만 연산 가능, 다른 자료형과 연산시 오류 발생
	 * -> 이런 상황 해결시 필요한 기술
	 * 
	 * 자동 형변환/강제 형변환 존재
	 */
	
	int num1=10;
	double num2=3.5;
	System.out.println("자동 형변환 결과:"+(num1+num2));
	//13.5 원래 에러발생이지만 '자동형변환' 덕분에 발생안함
	//작은게 큰쪽으로 변환
	
	//int->long 형변환
	int i2=2_100_000_000;//21억
	long l2=10_000_000_000l;//100억
	long result=i2+l2;
	//			int->long
	//long=long+long
	
	System.out.println(result);
	
	//char->ing
	char ch3='V';
	System.out.println(ch3);
	int i3=ch3;
	System.out.println(i3);
	
	char ch4='악';
	System.out.println(ch4);
	int i4=ch4;
	System.out.println(i4);
	
	
	
	
	
	
	
	
	}
}
