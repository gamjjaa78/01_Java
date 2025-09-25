package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {
	// 속성
	private Scanner sc = new Scanner(System.in);

	// 회원가입한 사람의 정보를 저장해둘 참조변수
	// Member 5칸짜리 객체배열 선언 및 할당
	private Member[] memberArr = new Member[5];

	// 현재 로그인한 회원의 정보를 저장할 참조 변수 선언
	private Member loginMember = null;

	// 기능
	public MemberService() {
		// memberArr 배열 0,1,2 인덱스 초기화
		memberArr[0] = new Member("user01", "pass01", "홍길동", 30, "서울");
		memberArr[1] = new Member("user02", "pass02", "홍닐동", 40, "경기");
		memberArr[2] = new Member("user03", "pass03", "홍딜동", 50, "강원");
	}

	// 메뉴 출력용 메서드
	public void displaymenu() {
		int menuNum = 0; // 메뉴선택용 변수

		// 무조건 한번은 반복
		do {
			System.out.println("====회원 관리 프로그램 v2====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 검색(지역)");
			System.out.println("0. 프로그램 종료");

			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine(); // 입력버퍼에 남은 개행문자 제거

			switch (menuNum) {
			case 1:
				System.out.println(signUp());
				break;
			case 2:
				System.out.println(login());
				break;
			case 3:
				System.out.println(selectMember());
				break;
			case 4:
				int result = updateMember();
				if (result == -1) {
					System.out.println("로그인 후 이용바람\n");
				} else if (result == 0) {
					System.out.println("회원 정보 수정 실패(비밀번호 불일치)");
				} else {
					System.out.println("회원정보가 수정됨!\n");
				}
				break;
			case 5:
				searchRegion();
				break; // 반환값 없으니 걍 실행만 하면 돼
			case 0:
				System.out.println("프로그램 종료,,");
				break;
			default:
				System.out.println("잘못 누름, 메뉴번호만 선택해!!");
			}

		} while (menuNum != 0); // menuNum이 0되면 반복종료
	}

	// 사이드 메서드:메인기능아니나 다른 메서드에 도움되는 메서드(==헬퍼)
	// memberArr에 비어있는 인덱스 번호를 반환하는 역할, 안 비면 -1 반환
	public int emptyIndex() {
		for (int i = 0; i < memberArr.length; i++) {
			// 현재 인덱스에 이는 요소가 참조하는 값이 null인 경우 탐색
			if (memberArr[i] == null) {
				return i; // 현재 메서드 종료, 호출한 곳으로 i값 가지고 되돌아감
			}
		}
		return -1; // for문 수행했지만 인덱스값이 return 안됐을때 해당 위치 코드 수행!
					// ->배열에 빈칸이 없다!
	}

	// 회원가입 메서드
	public String signUp() { // String형 값을 리턴하는 메서드, return없음 오류떠ㅋㅋ
		System.out.println("\n====회원 가입====");

		// 객체배열 memberArr에 새로 가입할 회원정보를 저장할 예정
		// ->memberArr배열에 빈자리 있는지 확인
		// ->빈자리 있을때 : 빈 공간의 인덱스 번호 얻어오기
		// ->없을떄 : -1 반환 <-인덱스는 절대 음수값이 없어서 -1 선택

		int index = emptyIndex();

		if (index == -1) { // 빈자리없음->가입불가!
			return "회원가입 불가능(인원수 초과)\n";
		}

		// 회원가입 가능
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("비밀번호 확인 : ");
		String memberChechPw = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		System.out.print("지역 : ");
		String Region = sc.next();

		// 비밀번호 일치시 회원가입 진행
		// 불일치시 가입 실패
		if (memberPw.equals(memberChechPw)) { // 일치
			// 새로운 Member 객체 생성해서 할당된 주소를 memberArr의 비어있는 인덱스에 대입
			memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, Region);
			return "회원가입 성공!\n";
		} else { // 불일치
			return "회원가입 실패!(비밀번호 불일치)\n";
		}
	}

	// 로그인 메서드
	public String login() {
		System.out.println("\n====로그인====");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();

//		memberArr 배열 내 요소를 순서접근하여
		for (int i = 0; i < memberArr.length; i++) { // null 인지 확인->Null관련 런타임오류발생
			if (memberArr[i] != null) { // 회원정보 있을 경우 입력받은 아이디,비밀번호가 같은지 비교
				if (memberArr[i].getMemberId().equals(memberId) && memberArr[i].getMemberPw().equals(memberPw)) {
					// 아이디,비밀번호 같다면 로그인 회원정보 객체를 참조할 변수
					// loginMember에 현재 접근중인 memberArr[i]요소에 저장된 주소를 얕은복사
					loginMember = memberArr[i];
					break; // 더이상 같은 아이디, 비번 없을거라 예상->효율위해 for문 종료
				}
			}
		} // for문 종료
			// 로그인 성공,실패 여부에 따라 결과값 반환
			// 성공:홍길동님 환영합니다!, 실패:아이디 또는 비밀번호가 일치하지 않습니다.
		if (loginMember == null) {
			return "아이디 또는 비밀번호 불일치\n";
		} else {
			return loginMember.getMemberName() + " 환영!\n";
		}
	}

	// 회원정보조회 메서드
	public String selectMember() {
		System.out.println("\n====회원 정보 조회====");
		if (loginMember == null) {
			return "로그인 먼저 해라\n";
		}
		String str = "이름 : " + loginMember.getMemberName();
		str += "\n아이디 : " + loginMember.getMemberId(); //str에 누적
		str += "\n나이 : " + loginMember.getMemberAge();
		str += "\n지역 : " + loginMember.getRegion();
		return str;
	}

	// 회원정보 수정기능 메서드
	public int updateMember() {
		System.out.println("\n====회원 정보 수정====");
		if (loginMember == null) {
			return -1;
		}

		System.out.print("수정할 이름 입력 : ");
		String inputName = sc.next();

		System.out.print("수정할 나이 입력 : ");
		int inputAge = sc.nextInt();

		System.out.print("수정할 지역 입력 : ");
		String inputRegion = sc.next();

		System.out.print("비밀번호 입력 : ");
		String inputPw = sc.next();

		if (inputPw.equals(loginMember.getMemberPw())) {
			loginMember.setMemberName(inputName);
			loginMember.setMemberAge(inputAge);
			loginMember.setRegion(inputRegion);
			return 1;
		} else {
			return 0;
		}
	}

	// 회원 검색(지역) 메서드
	public void searchRegion() {
		System.out.println("\n====회원 검색(지역)====");
		System.out.print("검색 지역 : ");
		String inputRegion = sc.next();

		// memberArr 배열 모든 요소에 순차 접근
		boolean flag = true; // 검색 결과 신호용 변수

		for (int i = 0; i < memberArr.length; i++) {
			// memberArr[i] 요소가 null일시 반복종료
			if (memberArr[i] == null) {
				break;
			}
			// memberArr[i] 요소가 null 아닐시
			// memberArr[i] 요소에 저장된 지역(region)이 입력받은 지역(inputRegion)과 같을경우
			// memberArr[i] 요소에 저장된 객체의 회원 아이디, 이름 출력
			if (memberArr[i].getRegion().equals(inputRegion)) {
				System.out.printf("아이디 : %s, 이름 : %s\n\n", memberArr[i].getMemberId(), memberArr[i].getMemberName());
				flag = false; // 찾았다는 신호
			}
		}

		// 입력한 지역과 회원이 불일치시, 일치하는 검색결과 없음! 출력
		if (flag) {
			System.out.println("지역 없어!\n");
		}
	}
}
