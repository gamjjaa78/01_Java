package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student[] st = new Student[3];
		st[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		st[1] = new Student("김말동", 21, 187.3, 80.0, 2, "경영학과");
		st[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

		// 향상된 for문
		// 자바에서 배열, 컬렉션과 같은 데이터를 순차적으로 간단하게 반복할 수 있는 구조 제공
		// 일반 for문보다 코드 간결, 가독성 좋아 반복작업을 더 쉽게 작성
		// for(자료형 변수명:배열 또는 컬렉션){반복실행코드}

		for (Student std : st) {
			System.out.println(std.information());
		}

//		for (int i = 0; i < st.length; i++) {
//			System.out.println(st[i].information());
//		}

		System.out.println("==========================================");

		Employee[] emp = new Employee[10];

		Scanner sc = new Scanner(System.in);

		int count = 0;

		while (true) {

			System.out.println("이름 : \n");
			String name = sc.next();
			System.out.println("나이 : \n");
			int age = sc.nextInt();
			System.out.println("신장 : \n");
			double height = sc.nextDouble();
			System.out.println("몸무게 : \n");
			double weight = sc.nextDouble();
			System.out.println("급여 : \n");
			int salary = sc.nextInt();
			System.out.println("부서 : \n");
			String dept = sc.next();

			emp[count] = new Employee(name, age, height, weight, salary, dept);
			count++;
			if (count == emp.length) { // 배열차면 반복종료
				break;
			}
			System.out.print("계속 추가할래? y/n");
			String str = sc.next().toUpperCase(); // 무조건 대문자로 받음, toLowerCase() 소문자로 받음
//			if(str.equals("n")||str.equals("n")
//			if(str.equalsIgnoreCase("n")) break; 대소문자 미구분, 두 문자열 같은지만 비교

			if (str.equals("N"))
				break;
		} // while문 끝

		for (Employee empp : emp) {
			if(emp==null) break; //NullPointerException 방지->null 만나면 종료
			System.out.println(empp.information());
		}

	}

}