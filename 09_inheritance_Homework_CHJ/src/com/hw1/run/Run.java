package com.hw1.run;

import java.util.Arrays;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run {

	public static void main(String[] args) {
		
//		강사, 배열넣을때 객체 바로 생성, 객체 재사용 불편
		Book[]books=new Book[3];
		books[0] = new Novel("해리 포터", "J.K. 롤링", "판타지"); // 부모타입 참조변수 = 자식객체 (업캐스팅)
		books[1] = new Textbook("자바 프로그래밍", "James Gosling", "컴퓨터 과학");
		books[2] = new Poetry("우리들의 사랑시", "김소월", 30);
		
//		향상된 for문 or for-each문
//		"books 배열의 각 요소(Book 객체)를 하나씩 꺼내서 book 변수에 담고 반복 실행"
		for (Book book : books) { 
			book.displayInfo();
			System.out.println();// 개행
	}
			
			
			
//		나, 객체 생성 후 배열에 저장, 재사용이나 디버깅 적합
//		Book nv = new Novel("해리 포터", "J.K.롤링", "판타지");
//		Book tb = new Textbook("자바 프로그래밍", "James Gosling", "컴퓨터 과학");
//		Book pt = new Poetry("우리들의 사랑시", "김소월", 30);
//
//		Book[] arr = new Book[3];
//		arr[0] = nv;
//		arr[1] = tb;
//		arr[2] = pt;
		
//		toString 오버라이딩 안한 예제라 배열 요소값이 아니라 기본toString 결과값나옴
//		대신 getter를 이용해 직접 출력문을 작성하는 게 실용적
//		추가 정보는 instanceof로 타입 구분 후 출력 가능
//				for (int i = 0; i < arr.length; i++) {
//			System.out.println(Arrays.toString(arr));}

//		출력은 되는데 추가정보 안나와
//		for (int i = 0; i < arr.length; i++) {
//		    Book book = arr[i];
//		    System.out.println("제목: " + book.getTitle() + ", 저자: " + book.getAuthor());
//		}
//		
//		for (Book book : arr) {
//		    System.out.println("제목: " + book.getTitle() + ", 저자: " + book.getAuthor());
//		}
			
		
	}

}
