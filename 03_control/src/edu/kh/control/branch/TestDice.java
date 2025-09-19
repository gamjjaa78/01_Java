package edu.kh.control.branch;

import java.util.Scanner;

public class TestDice {

	Scanner sc = new Scanner(System.in);

	public void DICE() {

		int count = 0;
		System.out.println("===주사위 맞히기 게임 시작===");
		System.out.println("1~6 사이 숫자를 맞혀보세요. (종료를 원한다면\"종료\"입력)\n");

		while (true) {

			System.out.print("숫자 입력 >> ");
			int num = sc.nextInt();
			count++;
			if (num < 1 || num > 6) {
				System.out.print("잘못된 입력입니다. 1~6 사이 숫자를 입력하세요.");

			} else {
				int random = (int) (Math.random() * 6 + 1);
				// System.out.println(random);

				if (num == random) {
					System.out.println("정답입니다!!!!!!!!!!!!!!!!");
					System.out.println("새로운 숫자가 생성됐습니다.\n");
				}
				if (num > random) {
					System.out.print("틀렸습니다. 더 작은 수를 입력하세요.\n\n");
				}
				if (num < random) {
					System.out.print("틀렸습니다. 더 큰 수를 입력하세요.\n\n");
				}
			}
		}
		//System.out.print(count);
	}

}
