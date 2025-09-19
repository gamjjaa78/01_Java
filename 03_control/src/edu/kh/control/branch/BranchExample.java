package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {

	public void ex1() {
//		1부터 10까지 1씩 증가하며 출력하는 반복문
//		5 출력시 반복문 종료
//		1 2 3 4 5

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			if (i == 5) {
				break;
			}
		}
	}

	public void ex2() {
//		입력받은 모든 문자열 누적
//		exit@ 입력시 누적 종료, 결과출력

		Scanner sc = new Scanner(System.in);
		String str = ""; // 빈문자열

		while (true) { // 조건식은 무조건 t/f 가 나오는 논리값

			System.out.print("문자열 입력(exit@ 입력 시 종료) : ");
			String input = sc.nextLine(); // 다음 한 줄 수집, 공백수집 / next()는 다음 한 단어 수집, 공백미포

			// 자바에서 문자열(String 참조형) 비교는 비교연산사 ==로 불가
			// ==는 기본자료형끼리의 연산에서만 사용
			// equals() 메서드로 비교, 결과값 t/f 반환, boolean 값을 되돌려줌
			// 문자열1.equals(문자열2)

			if (input.equals("exit@")) {
				break;
			}
			str += input + "\n";
		} // while 문 종료
		System.out.println("======================");
		System.out.println(str);
	}

	public void ex3() {
		// continue : 다음 반복으로 넘어감
		// 1~10까지 1씩 증가하며 출력
		// 단 3의 배수 제외
		// 1 2 4 5 7 8 10

		for (int i = 1; i <= 10; i++) {

			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

	public void ex4() {
//		1~100까지 1씩 증가하며 출력하는 반복문
//		5의 배수 건너뜀
//		증가하는 값이 40 됐을때 반복 멈춤

		for (int i = 1; i <= 100; i++) {
			if (i == 40) {
				break; // continue 밑으로 가면 해당 조건문이 실행될 순서가 없음
			}
			if (i % 5 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

	public void RSPGame() {
//		가위바위보 게임
//		몇 판할지 입력받음
//		입력받은 판 수 만큼 반복
//		
//		컴퓨터:Math.random() : 0.0~1.0 사이 난수 생성
//		1~3 사이 난수 생성 -> 1==가위, 2==바위, 3==보
//		컴퓨터와 플레이어 가위바위보 판별
//		플레이어 승! / 졌습니다ㅠㅠ / 비겼습니다
//		매판마다 현재 기록 : n승 n무 n패 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임!!");
		System.out.print("몇 판 ? ");
		int round = sc.nextInt();

//		승패 기록용 변수
		int win = 0;
		int draw = 0;
		int lose = 0;

		for (int i = 1; i <= round; i++) { // 입력받은 판 수 만큼 반복
			System.out.println("\n" + i + "번째 게임");
			System.out.print("가위, 바위, 보 중 하나 입력 : ");
			String input = sc.next();

			int random = (int) (Math.random() * 3 + 1);
			// 0.0 <= x < 1.0
			// 0.0 <=x*3 < 3.0
			// 1.0 <=x*3+1 < 4.0
			// 1 <= x < 4 -> 1 이상 4 미만 정수가 랜덤출력 -> 1,2,3

			String com = null; // 참조형 값, 아무것도 참조하고 있지 않음

			switch (random) {
			case 1:
				com = "가위";
				break;
			case 2:
				com = "바위";
				break;
			case 3:
				com = "보";
				break;
			}

			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", com);

			if (input.equals(com)) { // 컴퓨터와 플레이어 가위바위보 판별, 무승부시
				System.out.println("비겼습니다.");
				draw++; // 무승부 기록
			} else { // 이기거나 진 경우
				boolean win1 = input.equals("가위") && com.equals("보");
				boolean win2 = input.equals("바위") && com.equals("가위");
				boolean win3 = input.equals("보") && com.equals("바위");
				if (win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
				} else {
					System.out.println("졌습니다ㅠㅠ");
					lose++;
				}
			} // if문 끝
			System.out.printf("현재 기록 : %d승 %d무 %d패\n", win, draw, lose);
		} // for문 끝
	}
}
