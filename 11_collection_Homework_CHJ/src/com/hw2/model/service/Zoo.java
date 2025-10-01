package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {

	private List<Animal> animals; // null

	public Zoo() {
		animals = new ArrayList<Animal>();
		// 실제 동물담을 리스트 객체 생성해서 animals에 할당->animals가 빈 ArrayList 가리켜
		// addAnimal() 메서드 등에서 animal.add()를 호출해도 NullPointerException없이 정상작동
	}

	public void addAnimal(Animal animal) { // 다형성으로 Animal의 자식 클래스 객체받아 리스트에 추가
		animals.add(animal);
	}

	public void showAnimals() {
		System.out.println("동물들의 울음소리를 들어보세요~");
		for (Animal animal : animals) {
			animal.sound();
		}
	}

	public void displayMenu() {

		Scanner sc = new Scanner(System.in);

		int menuNum = 0;
		do {
			System.out.println("***** KH 동물원 ******");
			System.out.println("원하는 작업을 선택하세요");
			System.out.println("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			System.out.print("선택 : ");

			menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				showAnimals();
				break;
			case 2:
				System.out.println("프로그램 종료합니다");
				break;
			default:
				System.out.println("잘못된 선택입니다. 다시 선택해주세요...");
			}

		} while (menuNum != 2); // 2번 입력할때까지 반복

	}

}