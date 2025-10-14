package com.model.dto.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.model.dto.Toy;

public class ToyFactory2 {

	List<Toy> toyList = new ArrayList<Toy>();
	Map<Integer, String> materials = new TreeMap<Integer, String>();
	Scanner sc = new Scanner(System.in);

	public void mainmenu() {
		int num = -1;

		materials.put(1, "면직물");
		materials.put(2, "플라스틱");
		materials.put(3, "유리");
		materials.put(4, "고무");

		toyList.add(new Toy("키시미시", 5, 15000, "분홍색", 19940505, new HashSet<>(Arrays.asList("면직물", "플라스틱"))));
		toyList.add(new Toy("캣냅", 8, 15000, "분홍색", 19940505, new HashSet<>(Arrays.asList("면직물", "플라스틱"))));
		toyList.add(new Toy("파피", 12, 15000, "분홍색", 19940505, new HashSet<>(Arrays.asList("면직물", "플라스틱"))));
		toyList.add(new Toy("허기워기", 5, 15000, "분홍색", 19940505, new HashSet<>(Arrays.asList("면직물", "플라스틱"))));
		toyList.add(new Toy("마미롱레그", 8, 15000, "분홍색", 19940505, new HashSet<>(Arrays.asList("면직물", "플라스틱"))));

		try {
			do {
				System.out.println("\n<<플레이타임 공장>>");
				System.out.println("1. 전체 장난감 조회");
				System.out.println("2. 새로운 장난감 만들기");
				System.out.println("3. 장난감 삭제");
				System.out.println("4. 장난감 제조일 순으로 조회");
				System.out.println("5. 연령별 사용가능한 장난감 순으로 조회");
				System.out.println("6. 재료 추가");
				System.out.println("7. 재료 제거");
				System.out.print("번호 눌러어 : ");
				num = sc.nextInt();
				sc.nextLine();

				switch (num) {
				case 1:
					SelectAllToy();
					break;
				case 2:
					AddNewToy();
					break;
				case 3:
					RemoveToy();
					break;
				case 4:
					SelectByDate();
					break;
				case 5:// SelectByAge();
					break;
				case 6:// AddMaterials();
					break;
				case 7:// RemoveMaterials();
					break;
				default:
					System.out.println("메뉴번호만 눌러어");
				}
			} while (num != 0);
		} catch (Exception e) {
			System.out.println("숫자 눌러어");
			num = -1; // 필드변수 초기화(혹시 다른 값 있을까봐)
		}
	}

	public void SelectAllToy() {
		System.out.println("\n<전체 장난감 목록>");
		for (int i = 0; i < toyList.size(); i++) {

			System.out.print(i + 1 + ". ");
			System.out.println(toyList.get(i));
		}
	}

	public void AddNewToy() {
		System.out.println("\n<새 장난감 추가>");
		System.out.print("장난감 이름 : ");
		String name = sc.nextLine();
		System.out.print("사용가능연령 : ");
		int age = sc.nextInt();
		System.out.print("가격 :");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("색상 :");
		String color = sc.nextLine();
		System.out.print("제조일(YYYYMMDD 형식으로 입력) : ");
		int createDate = sc.nextInt();
		sc.nextLine();

		char answer = 'A';
		String material = "";
		Set<String> material_set = new HashSet<String>();
		do {
			System.out.println("재료를 입력하세요(종료하려면'q'를 입력하세요):");
			material = sc.next();
			if (material.length() > 1) {
				material_set.add(material);
			} else {
				answer = material.toLowerCase().charAt(0);
			}
		} while (answer != 'q');
		toyList.add(new Toy(name, age, price, color, createDate, material_set));
		System.out.println("새로운 장난감이 추가되었습니다.");
	}

	public void RemoveToy() {
		System.out.print("\n삭제할 장난감의 이름을 입력하세요 : ");
		String name = sc.nextLine();
		int delete_num = -1;

		for (int i = 0; i < toyList.size(); i++) {
			if (toyList.get(i).getName().equals(name)) {
				delete_num = i;
			}
		}
		if (delete_num == -1) {
			System.out.println("해당 이름의 장난감이 없습니다.");
		} else {
			toyList.remove(delete_num);
			System.out.println("장난감이 삭제되었습니다.");
		}
	}

	public void SelectByDate() {
		System.out.println("\n제조일 순으로 장난감 정렬");
		toyList.sort(Comparator.comparingInt(null));
		
		
		
	}

}
