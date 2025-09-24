package edu.kh.control.practice;

import java.util.Scanner;

public class ATM {
	Scanner sc = new Scanner(System.in);

	public void Atm() {

		int money = 10000;
		int sum = money;
		System.out.println("===ATM===");
		System.out.printf("현재 잔액: %d원\n\n", money);

		for (int i = 1; i <= 4; i++) {
			System.out.println("메뉴를 선택하세요 : ");
			System.out.println("1. 입금하기");
			System.out.println("2. 출금하기");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print(">> ");
			int menu = sc.nextInt();

			if (menu == 4) {
				System.out.print("프로그램을 종료합니다. 이용해주셔서 감사합니다!");
				break;
			}
			if (menu < 1 || menu > 4) {
				System.out.println("잘못된 입력입니다. 1~4번 중에서 선택하세요.\n");
				continue;
			}
			switch (menu) {

			case 1:
				System.out.print("입금할 금액을 입력하세요 :");
				int plus = sc.nextInt();
				sum += plus; // sum= sum+plus
				System.out.printf("입금 완료! 현재 잔액 : %d원\n\n", sum);
				break;

			case 2:
				System.out.print("출금할 금액을 입력하세요 :");
				int minus = sc.nextInt();
				if (sum < minus) {
					System.out.printf("잔액부족! 현재 잔액은 %d원 입니다.", sum);
				} else {
					sum -= minus;
					System.out.printf("출금 완료! 현재 잔액 : %d원\n\n", sum);
				}
				break;

			case 3:
				System.out.printf("현재 잔액은 %d원 입니다.\n\n", sum);
				break;
			}
		}
	}
}
