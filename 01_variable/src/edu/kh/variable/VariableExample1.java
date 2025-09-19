package edu.kh.variable;
//class:코드작성하는곳
public class VariableExample1 {
	public static void main(String[] args) {
		//변수미사용
		System.out.println(2*3.141592653589793*5);//원둘레
		System.out.println(3.141592653589793*5*5);//원넓이
		System.out.println(3.141592653589793*5*5*20);//원기둥부피
		System.out.println(4*3.141592653589793*5*5);//구의겉넓이
		
		double pi = 3.141592653589793;//원주율, 실수
		int r = 5;//반지름radius, 정수
		int h = 20;//높이height
		
		System.out.println(2*pi*r);//원둘레
		System.out.println(pi*r*r);//원넓이
		System.out.println(pi*r*r*h);//원기둥부피
		System.out.println(4*pi*r*r);//구의겉넓이
		/*변수 Variable
		 * 메모리(RAM)에 값을 기록하는 공간
		 * 공간에 기록되는 값(date)이 변할 수 있어서 변수라고 함
		 * 여러종류로 저장되는 값의 형태, 크기다름
		 * 장점-가독성 증가, 재사용성 증가, 코드길이감소, 유지보수성증가(코드수정간단)
		 *
		 *
		 */
	}
}
