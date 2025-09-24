package edu.kh.oop.method.model.service;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService {
	// 속성(필드)
	private Scanner sc = new Scanner(System.in);

	// 가입한 회원의 정보를 저장할 변수
	private Member memberInfo = null;

	// 로그인한 회원의 정보를 저장할 변수
	private Member loginMember = null;

	// 기능(생성자, 메서드)
	public void displayMenu() {
		int menuNum = 0; // 메뉴 선택용 변수

		// 무조건 한번은 수행
		do {
			System.out.println("====회원 정보 관리 프로그램====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine(); // 입력버퍼의 개행문자 제거용

			switch (menuNum) { // 내가 호출한 메서드가 return하는 값을 잘 생각하기!
			case 1:
				System.out.println(singUp());
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
				} else { // result==1
					System.out.println("회원정보가 수정됨!");
				}

				break;
			case 0:
				System.out.println("\n프로그램 종료,,");
				break;
			default:
				System.out.println("메뉴번호만 입력해~\n");
			}

		} while (menuNum != 0); // 0이 되면 반복종료
	}

	// 회원 가입 기능
	public String singUp() {
		System.out.println("\n****회원 가입****");
		System.out.print("아이디 : ");
		String memberId = sc.next();

		System.out.print("비밀번호 : ");
		String memberPw = sc.next();

		System.out.print("비밀번호 확인 : ");
		String memberPwCheck = sc.next();

		System.out.print("이름 : ");
		String memberName = sc.next();

		System.out.print("나이 : ");
		int memberAge = sc.nextInt();

		// 비밀번호, 비밀번호 확인이 일치하면 회원가입 진행, 불일치시 가입실패
		if (memberPw.equals(memberPwCheck)) { // 일치

			// 회원가입:새로운 회원객체 생성
			// ->member 클래스 이용해 새로운 객체 생성
			// ->매개변수 생성자 이용
			memberInfo = new Member(memberId, memberPw, memberName, memberAge);
			// 회원가입한 정보를 가진 객체 주소값을
			// memberInfo 필드변수에 참조시킴
			// ->회원가입 후 memberInfo는 더이상 null이 아님!

			return "회원 가입 성공😆😆\n";

		} else { // 불일치
			return "회원가입 실패!! (비밀번호 불일치)";
		}
	}

	// 로그인 기능
	public String login() {
		// 회원가입된 사람 유무 검사
		// 입력한 아이디와 비밀번호로 가입한 사람의 정보있는지 확인

		System.out.println("\n****로그인****");
		// 회원가입했는지부터 확인
		// ==memberInfo 가 객체참조하고 있는지 확인->==null(미참조) 인지 확인

		if (memberInfo == null) { // 회원가입을 안한 경우
			return "회원가입부터 해\n";
			// return:현재 메서드 종료하고 값을 가지고 해당 메서드 호출한 곳으로 되돌아감!!
		}
		// 회원가입 했다면 해당 라인으로 도달->로그인 기능 수행
		System.out.println("아이디 : ");
		String memberID = sc.next();

		System.out.println("비밀번호 : ");
		String memberPw = sc.next();

		// 회원가입정보(memberInfo가 참조하는 Member객체)에
		// 저장된 아이디, 비밀번호가
		// 입력한 아이디, 비밀번호과 같으면 "로그인 성공"
		// 불일치시 "아이디 또는 비밀번호 불일치" 리턴

		// 아이디, 비밀번호가 모두 일치할 경우
		if (memberID.equals(memberInfo.getMemberId()) && memberPw.equals(memberInfo.getMemberPw())) {
			// 매개변수는 메서드 안에서 태어나 메서드 안에서 사라짐

			// 로그인한 사람의 정보 저장
			// loginMember에 현재 로그인한 사람의 정보 저장
			// ==loginMember에 memberInfo가 참조하는 객체 주소 대입
			loginMember = memberInfo; // 얕은 복사

			return loginMember.getMemberName() + "님 환영합니다!\n";

		} else {
			return "아이디 또는 비밀번호 불일치!";
		}
	}

	// 회원 정보 조회 기능
	public String selectMember() {
		// 조회하려면 로그인했는지부터 확인
		// 로그인했다면 현재 로그인한 사람의 정보를 저장한 객체에서
		// 정보 얻어오기(이름, 아이디, 나이)
		// 로그인 안했다면 '로그인 후 이용해주세요'

		System.out.println("\n****회원 정보 조회****");

		// 1) 로그인 여부 확인
		if (loginMember == null) {
			return "로그인 후 이용해주세요\n";
		}

		// 2) 로그인 돼있는 경우
		// 이름:홍길동, 아이디:user01, 나이:20세

		String str = "이름 : " + loginMember.getMemberName();
		str += "\n아이디 : " + loginMember.getMemberId();
		str += "\n나이 : " + loginMember.getMemberAge() + "세";

		return str;
	}

	// 회원 정보 수정 기능
	public int updateMember() {
		System.out.println("\n****회원 정보 수정****");
//		1)로그인 여부 판별
//		1-1)로그인 안돼있음 -1 반환
		if (loginMember == null) {
			return -1;
		}
//		2)로그인 돼있을때
//		2-1)수정할 회원 정보 입력 받기(이름,나이)
		System.out.println("수정할 이름 입력 : ");
		String inputName = sc.next();

		System.out.println("수정할 나이 입력 : ");
		int inputAge = sc.nextInt();

//		2-2)비밀번호 입력받아 현재 로그인한 회원의 비밀번호와 일치여부 확인
		System.out.println("비밀번호 입력 : ");
		String inputPw = sc.next();

		if (inputPw.equals(loginMember.getMemberPw())) {
			// 비밀번호 일치시
			// 로그인한 회원의 이름과 나이 정보를
			// 수정하기 위해 입력받은 값으로 변경 후 1 반환
			loginMember.setMemberName(inputName);
			loginMember.setMemberAge(inputAge);

			return 1;

		} else {
			return 0;
		}
	}

}
