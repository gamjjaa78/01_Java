package edu.kh.variable;

public class VariableExample4 {
	public static void main(String[] args) {
		
		/*강제형변환
		 * 기존 자료형을 원하는 자료형으로 강제변환시키는 것
		 * 값의범위가 큰 자료형을 작은 자료형으로 변환
		 * 출력되는 데이터의 표기법을 변환
		 * 
		 * 방법
		 * 자료형을 변환시키고 싶은 값 또는 변수 앞에 (자료형) 작성
		 * 
		 * 
		 */
		
		double temp=3.14;
		//int 강제 형변환시 소수점 아래자리 손실(데이터손실)
		int num=(int)temp;
		System.out.println(num);
		
		int iNum=290;
		byte bNum=(byte)iNum;
		System.out.println(bNum);
		//같은 정수형끼리의 변환시에도
		//값의 범위 차이 때문에 데이터 손실발생
		
		//char -> int 강제형변환
		char ch='A';
		System.out.println((int)ch);
		
		// int -> char
		int in=44085;
		System.out.println((char)in);
		
		int i6=2147483647;//int 형의 최대값
		int result2=i6+1;
		System.out.println(result2);
		//오버플로우 현상은 컴퓨터가 미리 예측불가
		//->개발자가 미리 예측해야돼
		

		
		
		
	}
	
}
