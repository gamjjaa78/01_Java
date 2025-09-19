package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
//		메소드 명 : public void practice1(){}
//		길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)

//		[실행 화면]
//		1 2 3 4 5 6 7 8 9
//		짝수 번째 인덱스 합 : 25

		int[] arr = new int[9];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i; // 1~9까지 대입
		}
//		if ( % 2 == 0) { // 짝수번째 인덱스 값의 합,,,
//				sum+= arr[i];
//			}
		System.out.println(Arrays.toString(arr));
	}

	public void practice2() {
//		길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
//
//		[실행 화면]
//		9 8 7 6 5 4 3 2 1
//		홀수 번째 인덱스 합 : 20
//		
		int[] arr = new int[9];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i; // 1~9까지 대입
		}

		System.out.println(Arrays.toString(arr));
	}

	public void practice3() {
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//
//		[실행 화면]
//		양의 정수 : 5
//		1 2 3 4 5

		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));
	}

	public void practice4() {
//		정수 5개를 입력 받아 배열을 초기화 하고
//		검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
//		배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
//		
//		[실행 화면 1]
//				입력 0 : 5
//				입력 1 : 8
//				입력 2 : 9
//				입력 3 : 10
//				입력 4 : 4
//				검색할 값 : 8
//				인덱스 : 1
//				
//				[실행 화면 2]
//						입력 0 : 5
//						입력 1 : 8
//						입력 2 : 9
//						입력 3 : 10
//						입력 4 : 4
//						검색할 값 : 1
//						일치하는 값이 존재하지 않습니다.		

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) { // 값받아 출력함
			System.out.printf("입력 %d : ", i);
			arr[i] = sc.nextInt();

		}
		System.out.println(Arrays.toString(arr) + "\n");

		// 검색할 값 받아서 인덱스 출력 또는 존재안함 출력,,
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {

			if (input == arr[i]) {
				System.out.printf("인덱스 : %d", i);
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("존재하지 않음");
		}
	}

	public void practice5() {
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//
//		[실행 화면]
//		문자열 : application
//		문자 : i
//		application에 i가 존재하는 위치(인덱스) : 4 8
//		i 개수 : 2
		
		
		
		
	}
	
}
