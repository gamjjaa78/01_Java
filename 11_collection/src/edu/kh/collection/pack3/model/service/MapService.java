package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {

//	Map:Key와 Value 한 쌍이 데이터가 돼 이를 모아둔 객체
//	Key:Value(Key=Value)->Entry 라고 부름

//	Key를 모으면 Set의 특징(중복x)
//	Value를 모으면 List의 특징(중복o)

	public static void ex1() {

//		HashMap<K, V>:Map의 자식 클래스 중 가장 대표되는 Mmap
		Map<Integer, String> map = new HashMap<Integer, String>();

//		Map.put(Integer, String):추가
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "박길동");
		map.put(5, "이길동");
		map.put(6, "최길동");
		System.out.println(map);

		// Key 중복테스트
		map.put(1, "조미현"); // 중복불가, Value 덮어쓰기

		// Value 중복테스트
		map.put(7, "최길동"); // 중복허용
		System.out.println(map);

	}

	public void ex2() {

		// Map 사용 예제
		// VO/DTO (값저장용객체)는 특정 데이터 묶음의 재사용이 많은 경우 사용
		// ->재사용 적은 VO는 오히려 코드 낭비
		// Map을 이용해 VO와 비슷한 코드 작성가능

		// 1)VO 버전
		Member member = new Member();

		// 값 세팅
		member.setId("userId");
		member.setPw("pass01");
		member.setAge(30);

		// 2) Map 버전
		Map<String, Object> map = new HashMap<>();
		// value가 Object 타입==value에 어떤 객체든 들어올 수 있다!

		// 값 세팅
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 25);

		// 값 출력
		// Object(Value) Map.get(Key)
		// 매개변수로 전달받은 Key와 대응되는 Value 반환
		System.out.println(map.get("id"));
		System.out.println(map.get("pw"));
		System.out.println(map.get("age"));

		System.out.println("------------------------------");

//		Map에 저장된 데이터 순차접근하기
//		Map에서 Key만 모아두면 Set의 특징가짐
//		Map에서 Keyset() 메서드 제공
//		Key만 모아서 Set으로 반환

		Set<String> set = map.keySet(); // id, pw, age라는 key가 저장된 Set 반환
		System.out.println("KeySet():" + set);

		// 향성된 for문
		for (String key : set) {
			System.out.println(map.get(key));
		}

		// map에 저장된 데이터가 많거나(반복 필요)
		// 어떤 key가 있는지 불분명할때
		// 또는 map에 저장된 모든 데이터에 접근해야할 때
		// KeySet()+향상된 for문 코드 용이

	}

	public void ex3() {

		// List에 Map 여러개 추가하여 다루기

		// List 객체 생성
		List<Map<String, Object>> list = new ArrayList<>();
		// List 객체 생성, 해당 List에는 Map 객체만 들어올 수 있음을 제한함!
		// Map 객체 미생성

		for (int i = 0; i < 10; i++) {
			// Map 객체 생성
			Map<String, Object> map = new LinkedHashMap<>();
//			HashMap은 순서 미보장
//			LinkedHashMap은 put한 순서 유지

			// Map에 데이터 추가
			map.put("id", "user0" + i);
			map.put("pw", "pass0" + i);

			// Map을 list에 추가
			list.add(map);

		}
		// for문 종료시 list에 10개의 Map 객체가 추가됨
		System.out.println(list);

		// 향상된 for문으로 key가 "id"에 대응되는 value값 전부 출력하기

		for (Map<String, Object> temp : list) {
			System.out.println(temp.get("id"));
		}
	}

}
