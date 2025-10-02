package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.pack2.model.dto.Person;

public class SetService {

//	 *Set(집합, 주머니)
//	 기본적으로 순서유지않음 (index 없음!)
//	 중복데이터 저장않함
//	 *인터페이스, 자식 클래스
//	 1.HsahSet(대표):처리속도빠름
//	 2.LinkedHashSet:순서유지
//	 3.TreeSet:자동정렬->cpmpareTo()활용, null 저장불가, NullPointerException 발생

	public void method1() {

		// HastSet 객체 생성
		Set<String> set = new HashSet<>();

		// 1. boolean add(E e):추가
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");

		System.out.println(set);

		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");

		System.out.println(set);

		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);

		System.out.println(set);

		// 2. int size():Set에 저장된 객체의 수 반환
		System.out.println("set의 size : " + set.size());

		// 3.boolean remove(E e)
		// 전달받은 인자 e를 Set에서 제거
		// 제거 성공true, 없으면 false
		System.out.println(set.remove("배달의민족"));
		System.out.println(set);
		System.out.println(set.remove("유플러스"));

		// 4. boolean contains (E e):
		// 전달받은 e가 Set에 있으면 true, 없으면 false
		System.out.println("쿠팡있냐:" + set.contains("쿠팡"));
		System.out.println("삼성있냐:" + set.contains("삼성"));

		// 5.void clear():Set에 있는 내용 모두 삭제
		set.clear();

		// 6.boolean isEmpty():비어있음 true, 아님 false
		System.out.println(set.isEmpty());
		System.out.println(set);
	}

//	Set 에 저장된 요소(객체) 꺼내는 방법
//	1. Iterator(반복자) 이용
//	2. List 로 변환
//	3. 향상된 for 문 이용
	public void method2() {
		Set<String> set = new HashSet<>();
		set.add("몽쉘");
		set.add("꼬북칩");
		set.add("쿠쿠다스");
		set.add("빈츠");
		set.add("포카칩");

//		1. Iterator(반복자)
//		컬렉션 객체에 저장된 요소를 하나씩 순차 접근하는 객체
		System.out.println("[Iterator 이용방법]");
//		Iterator set.iterator()
//		현재 Set을 순차접근할 수 있는 Iterator 객체 반환
		Iterator<String> it = set.iterator();

//		boolean Iterator.hasNext():
//		다음 순차 접근할 요소있음 true, 없음 false

		while (it.hasNext()) {
			// 다음 요소있음 반복, 없음 종료
			// E Iterator.next():다음 요소
			String temp = it.next();
			System.out.println(temp);
		}

		System.out.println("---------------------------------");
		System.out.println("[List로 변환]");
//			Set에 저장된 객체이용해 List 생성
		List<String> list = new ArrayList<>(set);
//			Set->List로 변환

		// 일반 for문
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("---------------------------------");
		System.out.println("[향상된 for문 이용]");
		for (String snack : set) {
			System.out.println(snack);
		}
	}

//	직접 만든 클래스(Person)을 이용해 만든 객체를 Set에 저장(중복제거확인)
	public void method3() {

//		*************Hash 라는 단어가 포함된 컬렉션 이용시->해당 컬렉션에 들어가는 객체에!!!!!
//		*************hashCode(), equals() 오버라이딩 필수적으로 진행!!

		Person p1 = new Person("홍길동", 25, '남');
		Person p2 = new Person("홍길동", 25, '남');
		Person p3 = new Person("홍길동", 30, '남');
		Person p4 = new Person("김길순", 20, '여');

//		Set 객체 생성 후 p1~p4까지 추가
		Set<Person> personSet = new HashSet<Person>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);

		for (Person p : personSet) {
			System.out.println(p);
		}

		// 같은 필드값을 가진 객체는 해시코드 번호가 같다!
		System.out.println("p1:" + p1.hashCode());
		System.out.println("p2:" + p1.hashCode());
		System.out.println("p3:" + p1.hashCode());
		System.out.println("p4:" + p1.hashCode());

		// A.equals(B):A와B의 필드값이 전부 같으면 true
		System.out.println(p1.equals(p2)); // 메모리, 가진 값도 똑같대->제거됨
		System.out.println(p1.equals(p3)); // 얘넨 다르대
	}

//	TreeSet 이용한 로또번호 생성기
//	기본오름차순 정렬
//	TreeSet 안에 저장되는 객체는 Comparable 인터페이스 상속 필수!!
//	컬렉션에는 객체만 저장가능
//	int->Integer 라는 Wrapper 클래스 이용해 저장
//	TreeSet<Integer>
//	Integer는 Comparable 인터페이스 이미 상속됨 (자동 정렬됨)
	public void method4() {

//		Integer 저장할 TreeSet 객체 생성
		Set<Integer> lotto = new TreeSet<Integer>();

//		난수 생성
//		1)Math.random()
//		2)Random.nextInt(10):0~9 범위 내 정수 반환

//		Random 객체 생성
		Random random = new Random();

//		lotto 저장된 값이 6개 미만이면 반복==6개 멈춤
		while (lotto.size() < 6) {
			// 1~45 범위 난수 발생
			lotto.add(random.nextInt(45) + 1); // (46)으로 하면 0~45임ㅋㅋㅋ, +1해야 1~45
		}
		System.out.println(lotto);

	}

}
