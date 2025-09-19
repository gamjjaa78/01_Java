package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class arrayExample1 {

//		배열(Array)
//		같은 자료형의 변수를 하나의 묶음으로 다루는 것
//		묶여진 변수들은 하나의 배열명으로 불려짐
//		구분은 index를 이용 (index는 0부터 시작하는 정수)

	public void ex1() {

		int num;
//		stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당,
//		해당 공간에 num이라는 이름 부여
//		해당 영역의 변수는 무조건 초기화돼야함

		num = 10;
//		생성된 num이라는 변수공간에 10 이라는 정수값 대입

		System.out.println("num에 저장된 값 : " + num);

		int[] arr;
//		stack 영역에 int[] 자료형 공간 4byte 할당하고, arr 이라는 이름부여
//		해당 변수는 참조형으로 주소값만 저장

		arr = new int[3];
//		new : new 연산자
//		heap 메모리 영역에 새로운 공간(배열,객체)을 할당
//		int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
//		new int[3] : heap 영역에 int형 변수 3칸짜리 int[]를 생성(할당)

		System.out.println(arr); // 주소값 출력
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// heap 영역에 생성된 공간은 절대 비어있을 수 없음
//		jvm 기본값이 들어가짐
//		boolean : false
//		나머지 : 0
//		참조형 : null

//		배열요소 값 대입
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 100;
//		arr[3]=500; 런타임 에러, 배열범위 벗어나 예외발생

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
//		System.out.println(arr[3]); 런타임 에러

//		배열이 가진 모든 요소의 값을 알고 싶을 때
//		Arrays.toString(배열명); >- String 형 반환
//		Arrays.toString(arr); //"[1, 50, 100]"
		System.out.println(Arrays.toString(arr));

	}

	public void ex2() {
		int[] arr = new int[4];
//		arr[0~3] 전부 JVM(자바가상기계ㅋㅋ)에 의해 0으로 초기화됨

		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;

//		arr[4]=500;
//		java.lang.ArrayIndexOutOfBoundsException:
//		Index 4 out of bounds for length 4
//		배열의 인덱스 범위 벗어남
//		4칸짜리로 만든 배열인데 없는 인덱스번호인 4에 접근함

//		배열과 for문
//		배열의 길이(몇 칸인가) : 배열명.length ->메서드 아니므로 소괄호 안찍음

		System.out.println(arr.length + "\n");

		for (int i = 0; i < arr.length; i++) {
//				 i -> 0 1 2 3
			arr[i] = i * 100; // for문을 이용한 초기화 방법
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
//			arr[0]에 저장된 값 : 0
//			arr[1]에 저장된 값 : 100
		}

		int[] arr2 = { 1, 2, 3, 4, 5 };
//		stack에 int[] 자료형 공간 4byte 할당
//		공간에 arr2 라는 이름 부여

//		heap 메모리 영역에 int 5칸짜리 배열생성
//		0번 인덱스부터 각 요소에 1~5 정수값 대입
//		int[] 주소값을 arr2 참조변수가 참조함

		System.out.println(Arrays.toString(arr2)); // 요소값
		System.out.println(arr2); // 주소값

	}

	public void ex3() {
//		5명의 키(cm) 입력받고 평균구하기
//		1번 키 입력 : 170.5
//		...
//		5번 키 입력 : 170.5
//		평균 : 

		Scanner sc = new Scanner(System.in);
		double[] hei = new double[5];
		double sum = 0;
//		배열의 각 요소에 대입하는 용도의 반복문
		for (int i = 0; i < hei.length; i++) {
//		   	     i=0 1 2 3 4
			System.out.printf("%d번 키 입력 : ", i + 1); // 1 2 3 4 5
			hei[i] = sc.nextDouble();
			// hei[0]=170.2;
			// hei[1]=163.2;
			// hei[4]=140.8;
			sum += hei[i];
			// sum = sum + hei [i]
			// [0] <-170.2
			// 333.4 = 170.2 + hei [1] <-163.2

		}
		System.out.printf("\n평균 : %.2f cm", sum / hei.length);
	}

	public void ex4() {
//		입력받은 인원수 만큼의 점수를 입력받아 배열저장
//		입력완료시 점수 합계, 평균 출력
//		
//		입력받을 인원 수 : 4
//		1번 점수 입력 : 100 
//		1번 점수 입력 : 80
//		1번 점수 입력 : 50
//		1번 점수 입력 : 60
//		
//		평균 : 72.5
//		합계 : 290

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 받을 인원 수 : ");
		int input = sc.nextInt();
		int[] sco = new int[input];

		int sum = 0;
		int avg = 0;

		for (int i = 0; i < sco.length; i++) {
			System.out.printf("%d번 점수 입력 : ", i + 1);
			sco[i] = sc.nextInt();
			sum += sco[i];
		}
		System.out.printf("\n평균 : %.1f, 합계 : %d점", (double) sum / sco.length, sum);
	}

	public void ex5() {
		// 점심 메뉴 뽑기

		String[] arr = { "김밥", "서브웨이", "햄버거", "백반", "국밥", "짜장면" };
		System.out.println("오늘 점심 메뉴 : " + arr[(int) (Math.random() * 6)]);
//		Math,random():0.0~1.0
//		0.0 <= x < 1.0
//		0.0 <= x < 6.0
//		0 <= x < 6
//		0 1 2 3 4 5
	}

	public void ex6() {
		// 배열 이용해 검색
		// 입력받은 정수가 배열에 있는지 확인
		// 있다면 몇번 인데스인지 출력

		// 정수 입력 : 200
		// 1번째 인덱스에 존재

		// 정수 입력 : 5
		// 존재하지 않음

		int[] arr = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		boolean flag = false; // 찾음 여부를 표시하기 위한 변수
								// 검사 전에는 못찾았다고 가정

		for (int i = 0; i < arr.length; i++) {
			if (input == arr[i]) {
				System.out.println(i + "번째 인덱스에 존재");
				flag = true; // 일치하는 값을 찾았으므로 true로 변경
			}
		}
		if (!flag) { // if문은 무조건 true어야 실행됨
			System.out.println("존재하지 않음");
		}
	}

	public void ex7() {
//		입력받은 값이 일치시 인덱스 번호 출력
//		없으면 존재하지 않음 출력

//		과일 입력 : 아보카도
//		5번 인덱스에 존재 / 존재하지 않음

		String[] arr = { "사과", "딸기", "바나나", "키위", "멜론", "아보카도" };
		Scanner sc = new Scanner(System.in);
		System.out.print("과일 입력 : ");
		String input = sc.nextLine();
		boolean flag = true;

		for (int i = 0; i < arr.length; i++) { // i=0 1 2 3 4 5
			if (input.equals(arr[i])) { // string 비교시 equals() 사용!
				System.out.println(i + "번째 인덱스에 존재");
				flag = false; // 찾았다고 표시
			}
		}
		if (flag) {
			System.out.println("존재하지 않음");
		}
	}

	public void ex8() {
//		문자열 입력 : hello
//		[h, e, l, l, o]
//		검색할 문자 입력 : L
//		2개 있음 / 존재하지 않음

//		1. 문자열을 입력받아 한글자씩 잘라내 char 배열에 순서대로 저장
//		2. 문자 하나를 입력받아 일치하는 문자가 char 배열에 몇 개 존재하는지
//		3. 불일치시 존재하지 않습니다 출력

//		사용해야 하는 기술
//		1. 배열 검색
//		2. 문자열의 길이 구하기 String.length() ex. "hello".length() -> 5 반환
//		3. String.charAt(index) : 문자열에서 특정 index에 위치한 문자 1개 꺼냄
//			"hello".charAt(1) -> 'e'
//			 01234
//		4. count (숫자세기)

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();

//		1. 입력받은 문자열을 한글자씩 잘라내 char 배열에 순서대로 저장
//		 1-1)입력받은 문자열 길이만큼의 char 배열 선언 및 할당하기
		char[] arr = new char[input.length()];

//		 1-2)입력한 문자열을 한글자씩 잘라내 char 배열의 모든 요소에 순서대라 값 대입
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			// arr[0] = 'h';
			// arr[1] = 'e';
			// arr[2] = 'l';
			// arr[3] = 'l';
			// arr[4] = 'o';
		}
		System.out.println(Arrays.toString(arr));

//		2. 문자 하나 입력받아 일치하는 문자가 char 배열에 몇 개 존재하는지 확인
		System.out.print("검색할 문자 입력 : ");
		char ch = sc.next().charAt(0);
//					String.charAt(index) -> 문자형 ' '
//					"e".charAt(0); -> 'e'
//					Scanner에서는 char 형태를 받을 수 있는 메서드없음
//					String 으로 우선 입력받고, 입력받은 String에서
//					charAt(index) 메서드를 이용해 해당 index 번째 존재하는
//					문자 하나를 떼어 char 자료형 형태로 반환

//		arr 이라는 배열에 입력한 문자가 몇 개 존재하는지
//		0번 index부터 마지막 index까지 순회하며 검색하기 위함
		int count = 0; // 내가 찾는 글자 개수를 세기 위한 변수

		for (int i = 0; i < arr.length; i++) {
			if (ch == arr[i]) {
				count++; // arr[i]값과 검색할 문자 ch가 같은 경우 카운트 늘려!
			} // 결과 출력
		}
		if (count > 0) { // 일치값 있을때
			System.out.print(count + "개 있음");
		} else { // 일치 문자 없을때
			System.out.println("존재하지 않음");
		}
	}
}
