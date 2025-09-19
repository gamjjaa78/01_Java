package edu.kh.control.loop;

import java.util.Scanner;

public class whileExample {

//	while 문
//	별도의 초기식, 증감식 미존재
//	반복종료조건을 자유롭게 설정하는 반복문
//	언젠가 반복조건이 false 될때 반복종료

	Scanner sc = new Scanner(System.in);

	public void ex1() {
		int input = 9;

		while (input != 0) { // input이 0이 아니라면 반복, 0일시 종료

			System.out.println("==메뉴선택==");
			System.out.println("1. 떡볶이");
			System.out.println("2. 쫄면");
			System.out.println("3. 김밥");
			System.out.println("0. 종료");

			System.out.print("메뉴선택 >> ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println("떡볶이 주문함");
				break;
			case 2:
				System.out.println("쫄면 주문함");
				break;
			case 3:
				System.out.println("김밥 주문함");
				break;
			case 0:
				System.out.println("종료");
				break;
			default: // 디폴트 없어도됨ㅋㅋㅋㅋ
				System.out.println("메뉴에 있는 번호만 선택해");
			}

		}

	}

	public void ex2() {

//		입력되는 모든 정수의 합구하기
//		0 입력시 반복 종료 후 결과출력
//		0 미입력시 계속 반복

//		do {
//			반복 수행할 코드; / 무조건 1번은 수행됨
//		} while (조건식);

		int input = 0; // 입력받은 값 저장할 변수
		int sum = 0; // 합계저장할 변수

		do {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			sum += input; // sum= sum+input / 7= 0(초기값)+7(입력받은값) 누적됨

		} while (input != 0);
		System.out.println("합계 : " + sum);
	}
}
