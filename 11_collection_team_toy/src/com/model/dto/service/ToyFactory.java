package com.model.dto.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.model.dto.Toy;

public class ToyFactory {
	
	List<Toy> toylist = new ArrayList<Toy>();

	Map<Integer, String> default_Ingredients = new TreeMap<Integer, String>();

	Scanner sc = new Scanner(System.in);

	public void mainmenu() {
		int menunum = -1;
		
		default_Ingredients.put(1, "면직물");
		default_Ingredients.put(2, "플라스틱");
		default_Ingredients.put(3, "유리");
		default_Ingredients.put(4, "고무");

		toylist.add(new Toy("키시미시", 5, 15000, "분홍색", 19940505, new HashSet<>(Arrays.asList("면직물", "플라스틱"))));
		toylist.add(new Toy("캣냅", 8, 27000, "보라색", 19960128, new HashSet<>(Arrays.asList("면직물", "플라스틱"))));
		toylist.add(new Toy("파피", 12, 57000, "빨간색", 19931225, new HashSet<>(Arrays.asList("면직물", "플라스틱", "고무"))));
		toylist.add(new Toy("허기워기", 5, 12000, "파란색", 19940312, new HashSet<>(Arrays.asList("면직물", "플라스틱"))));
		toylist.add(new Toy("마미롱레그", 8, 36000, "분홍색", 19950805, new HashSet<>(Arrays.asList("면직물", "고무"))));

		try {
			do {
				System.out.println("\n<<플레이타임 공장>>");
				System.out.println("1. 전체 장난감 조회하기");
				System.out.println("2. 새로운 장난감 만들기");
				System.out.println("3. 장난감 삭제하기");
				System.out.println("4. 장난감 제조일 순으로 조회하기");
				System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
				System.out.println("6. 재료 추가");
				System.out.println("7. 재료 제거");
				System.out.println("0. 프로그램 종료");
				System.out.print("선택 : ");
				menunum = sc.nextInt();
				sc.nextLine();

				switch (menunum) {
				case 1:
					SelectAllToys();
					break;
				case 2:
					CreateNewToy();
					break;
				case 3:
					DeleteToy();
					break;
				case 4:
					SelectByDate();
					break;
				case 5:
					SelectByAge();
					break;
				case 6:
					AddIngredeint();
					break;
				case 7:
					DeleteIngredient();
					break;
				case 0:
					System.out.println("프로그램 종료...");
					break;
				default:
					System.out.println("메뉴 내에 숫자를 입력하세요.");
					break;
				}
			} while (menunum != 0);
		} catch (InputMismatchException e) {
			System.out.println("\nerror : 입력형식이 유효하지 않습니다.");
			menunum = -1;
		}
	}

	public void SelectAllToys() {
		System.out.println("<<플레이타임 공장>>");
		for (int i = 0; i < toylist.size(); i++) {
			System.out.print(i + 1 + ". ");
			System.out.println(toylist.get(i));
		}
	}

	public void CreateNewToy() {
		System.out.println("<새로운 장난감 추가>");
		System.out.print("장난감 이름:");
		String name = sc.nextLine();
		System.out.print("사용 가능 연령:");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("가격:");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("색상:");
		String color = sc.nextLine();
		System.out.print("제조일(YYYYMMDD 형식으로 입력):");
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

		toylist.add(new Toy(name, age, price, color, createDate, material_set));
		System.out.println("새로운 장난감이 추가되었습니다.");
	}

	public void DeleteToy() {
		System.out.print("\n삭제할 장난감의 이름을 입력하세요:");
		String name = sc.nextLine();
		int delete_num = -1;
		
		for (int i = 0; i < toylist.size(); i++) {
			if (toylist.get(i).getName().equals(name)) {
				delete_num = i;
			}
		}

		if (delete_num == -1) {
			System.out.println("해당 이름의 장난감이 없습니다.");
		} else {
			toylist.remove(delete_num);
			System.out.println("장난감이 삭제되었습니다.");
		}
	}

	public void SelectByDate() {
		System.out.println("<제조일 순으로 장난감을 정렬>");
		toylist.sort(Comparator.comparingInt(Toy::getCreateDate));
		toylist.forEach(System.out::println);
		
	}

	public void SelectByAge() {
		System.out.println("<연령별로 장난감을 정렬>");
		toylist.sort(Comparator.comparingInt(Toy::getAge));
		int prevAge = -1;
		int first_num=1;
		
		for (int i = 0; i < toylist.size(); i++) {
		    if (toylist.get(i).getAge() != prevAge) {
		        System.out.println("[" + toylist.get(i).getAge() + "세]");
		        prevAge = toylist.get(i).getAge();
		        first_num=1;
		    }
		    
		    System.out.println(first_num + ". " + toylist.get(i));
		    first_num++;
		}
	}
	
	public void AddIngredeint() {
	    List<Map.Entry<Integer, String>> entries = new ArrayList<>(default_Ingredients.entrySet());

	    System.out.println("<재료 추가>");
		System.out.println("--현재 등록된 재료--");

		for (int i = 0; i < entries.size(); i++) {
		    System.out.println(entries.get(i).getKey() + ": " + entries.get(i).getValue());
		}
		
		System.out.println("--------------------");
		System.out.print("재료 고유번호(key) 입력 : ");
		int key = sc.nextInt();
		sc.nextLine();
		System.out.print("재료명 입력 : ");
		String ingredient = sc.nextLine();
		
		if (default_Ingredients.containsKey(key)) {
		    System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
		    System.out.print("덮어쓰시겠습니까? (Y/N):");
		    char answer = Character.toUpperCase(sc.next().charAt(0));
		    
		    if (answer == 'Y') {
		        default_Ingredients.put(key, ingredient);
		        System.out.println("재료가 성공적으로 덮어쓰기 되었습니다.");
		    } else {
		        System.out.println("등록 취소");
		    }
		} else {
		    default_Ingredients.put(key, ingredient);
		    System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
		}
	}

	public void DeleteIngredient() {
	    List<Map.Entry<Integer, String>> entries = new ArrayList<>(default_Ingredients.entrySet());
	    
		System.out.println("<재료 삭제>");
		System.out.println("--현재 등록된 재료--");
		
		for (int i = 0; i < entries.size(); i++) {
		    System.out.println(entries.get(i).getKey() + ": " + entries.get(i).getValue());
		}
		
		System.out.println("--------------------");
		System.out.print("삭제할 재료 이름 입력: ");
	    String name = sc.nextLine();
	    
	    //숫자는 있을 수 있는 가능성이 있음.
	    Integer RemoveKey = null;

	    for (int i = 0; i < entries.size(); i++) {
	        if (entries.get(i).getValue().equals(name)) {
	        	RemoveKey = entries.get(i).getKey();
	            break;
	        }
	    }

	    if (RemoveKey != null) {
	        default_Ingredients.remove(RemoveKey);
	        System.out.println("재료'" + name + "'가 성공적으로 제거되었습니다.");
	    } else {
	        System.out.println("해당 이름의 재료가 존재하지 않습니다.");
	    }
    }
	
}