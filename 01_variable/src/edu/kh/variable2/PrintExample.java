package edu.kh.variable2;

public class PrintExample {

	public static void main(String[] args) {

		
		//System.out.println(); 한줄 출력용 메서드(출력 후 줄바꿈 수행)
		System.out.println("테스트1");
		System.out.println("테스트2");
		
		//System.out.print("테스트3"); 단순 출력용 메서드(출력 후 줄바꿈 안함)
		System.out.print("테스트3");
		System.out.println(); //내용 없으면 단순줄바꿈
		System.out.print("테스트4");
		System.out.println(); 
		
		//10+5=15
		int iNum1=10;
		int iNum2=5;
		System.out.println(iNum1+"+"+iNum2+"="+(iNum1+iNum2));
		
		System.out.printf("%d+%d=%d\n", iNum1, iNum2, iNum1+iNum2);
		//System.out.printf("패턴", 패턴자리에 각각 들어갈 값/변수 나열);
		/*
		 * %d 정수형
		 * %f 실수형
		 * %c 문자, %s 문자열
		 * %b 논리형
		 */
		
		//이스케이프 문자(escape character)
		//특별한 의미를 갖도록 하는 용도로 사용
		//앞에 \가 붙음
		// \n 줄바꿈
		
		//10+10*5/2=35
		System.out.printf("%d+%d*%d/2=%d", iNum1, iNum1, iNum2, iNum1+iNum1*iNum2/2);
		System.out.println();
		System.out.printf("%d+%d*%d/%d=%d", iNum1, iNum1, iNum2, 2, iNum1+iNum1*iNum2/2);
		System.out.println();
		
		//공간확보 패턴연습
		int iNum3=3;
		System.out.printf("%d\n", iNum3);
		System.out.printf("%5d\n", iNum3); //5칸공간확보 후 오른쪽정렬
		System.out.printf("%-5d\n", iNum3); //5칸공간확보 후 왼쪽정렬
		
		//소수점 자리 제어 (반올림처리)
		System.out.printf("%f\n", 10/4.0); //2.500000
		System.out.printf("%.2f\n", 10/4.0); //2.50 (소수점 둘째자리까지)
		
		//역슬래시 표시원할시 2개ㅋㅋㅋㅋ
		System.out.println("\\o/");
		
		
		//\t : tab 한공간이 아니라 한번에 공간차지
		System.out.println("a\tb\tc\td");
		
		
		//유니코드 이스케이프
		System.out.println("\u0041");
		//65를 16진수로 표현
		//65 나누기16 몫4, 나머지1
		
	}

}
