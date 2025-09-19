package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample2 {

	public void RSPGame2() {
//		가위바위보 게임
//		몇 판할지 입력받음
//		입력받은 판 수 만큼 반복
//		
//		컴퓨터:Math.random() : 0.0~1.0 사이 난수 생성
//		1~3 사이 난수 생성 -> 1==가위, 2==바위, 3==보
//		컴퓨터와 플레이어 가위바위보 판별
//		플레이어 승! / 졌습니다ㅠㅠ / 비겼습니다
//		매판마다 현재 기록 : n승 n무 n패 출력

		Scanner sc=new Scanner(System.in);
		System.out.println("가위바위보 게임!");
		System.out.print("몇 판할래? ");
		int round=sc.nextInt();
		
//		승패 기록용 변수
		int win=0;
		int draw=0;
		int lsoe=0;
		
 // 입력받은 판 수 만큼 반복
		for(int i=1; i<=round; i++) {
			System.out.printf("==%d번째 게임==\n", i);
			System.out.println("가위, 바위, 보 중? ");
			String str=
		}
		
		
		
			// 0.0 <= x < 1.0
			// 0.0 <=x*3 < 3.0
			// 1.0 <=x*3+1 < 4.0
			// 1 <= x < 4 -> 1 이상 4 미만 정수가 랜덤출력 -> 1,2,3




		// 컴퓨터와 플레이어 가위바위보 판별, 무승부시

		// 무승부 기록

		// 이기거나 진 경우

		//출력
		
	}
}
