package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
//
//		[실행화면]
//		1이상의 숫자를 입력하세요 : 4
//		1 2 3 4
//		—----------------------------------------
//		1이상의 숫자를 입력하세요 : 0
//		1 이상의 숫자를 입력해주세요.

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		// String result = "";

		if (num >= 1) { // num이 1 이상인지, 조건에 맞는지 먼저 확인, 조건 o

			for (int i = 1; i <= num; i++) { // 숫자 출력
				// result += i + " ";
				System.out.print(i + " ");
			}

		} else { // 조건 x

			System.out.print("1 이상의 숫자를 입력해주세요");
		}

	}

	public void practice2() {

//		메소드 명 : public void practice2(){}
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//
//		[실행화면]
//		1이상의 숫자를 입력하세요 : 4
//		4 3 2 1
//		—-------------------------------------
//		1이상의 숫자를 입력하세요 : 0
//		1 이상의 숫자를 입력해주세요.

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {

			for (int i = num; i >= 1; i--) { // for 문에서 역순으로 실행되게,,ㅠㅠㅋㅋㅋ
				System.out.print(i + " ");

			}

		} else {

			System.out.print("1 이상의 숫자를 입력해주세요");
		}

	}

	public void practice3() {

//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
//
//		[실행화면]
//		정수를 하나 입력하세요 : 8
//		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36

		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();

		String result = ""; // 나열할 문자열 변수
		int sum = 0; // 합계를 구하기 위한 변수

		for (int i = 1; i <= input; i++) {
			sum += i; // 합계

			if (i == input) { // 마지막 턴
				result += i;

			} else { // 마지막 이전 모든 턴들
				result += i + " + ";
			}

		}
		System.out.printf("%s = %d", result, sum);
	}

	public void practice4() {

//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
//		
//		[실행화면]
//		첫 번째 숫자 : 8
//		두 번째 숫자 : 4
//		4 5 6 7 8
//
//		첫 번째 숫자 :4
//		두 번째 숫자 :8
//		4 5 6 7 8
//		
//		첫 번째 숫자 : 9
//		두 번째 숫자 : 0
//		1 이상의 숫자를 입력해주세요.

		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		// String result;

		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");

		} else {
			int start = num1;
			int end = num2;

			if (num1 > num2) { // 정렬때 자주 씀,,

				start = num2;
				end = num1;

			}

			for (int i = start; i <= end; i++) {
				// result += i + " ";
				System.out.print(i + " ");

			}

		}

	}

	public void practice5() {

//		사용자로부터 입력 받은 숫자의 단을 출력하세요.
//		
//		숫자 : 4
//		===== 4단 =====
//		4 * 1 = 4
//		4 * 2 = 8
//		4 * 3 = 12
//		4 * 4 = 16
//		4 * 5 = 20
//		4 * 6 = 24
//		4 * 7 = 28
//		4 * 8 = 32
//		4 * 9 = 36

		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		System.out.printf("==== %d단 ====\n", dan);

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan);
		}

	}

	public void practice6() {

//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//		단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
//
//		숫자 : 4 
//		===== 4단 ===== 
//		===== 5단 =====
//		===== 6단 =====
//		===== 7단 =====
//		===== 8단 =====
//		===== 9단 =====
//		(해당 단의 내용들은 길이 상 생략)
//		
//		숫자 : 10
//		2~9 사이 숫자만 입력해주세요.

		System.out.print("숫자 : ");
		int input = sc.nextInt();

		if (input < 2 || input > 9) {
			System.out.print("2~9 사이 숫자만 입력해주세요");
//			System.out.printf("==== %d단 ====\n", dan);
//
//			for (int dan = 1; dan <= 9; dan++) {
//				System.out.printf("%d X %d = %d\n", dan, i, dan);
//			}

		} else { // 2~9사이 정상범위

			for (int dan = input; dan <= 9; dan++) { // 단
				System.out.printf("==== %d단 ====\n", dan);

				for (int i = 1; i <= 9; i++) { // 곱해지는 수
					System.out.printf("%d X %d = %d\n", dan, i, dan * i);

				}

			}

		}
	}

	public void practice7() {

//		1부터 사용자에게 입력 받은 수까지 중에서
//		1) 2와 3의 배수를 모두 출력하고
//		2) 2와 3의 공배수의 개수를 출력하세요.
//
//		* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
//		모두 나머지가 0이 나오는 수
//
//		ex.
//		자연수 하나를 입력하세요 : 15
//		2 3 4 6 8 9 10 12 14 15
//		count : 2

		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		// String result = ""; // 공배수를 나열할 문자열 변수
		int count = 0; // n의 공배수의 개수를 세기 위한 변수

		for (int i = 1; i <= num; i++) {

			if (i % 2 == 0 || i % 3 == 0) { // 2 또는 3의 배수 출력
				System.out.print(i + " ");

				if (i % 2 == 0 && i % 3 == 0) { // 2와 3의 공배수
					count++; // 개수세기

				}

			}

		}

		System.out.println("\ncount : " + count);

	}
}
