package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
   	   /*1) 기본 생성자 이용하여 첫 번째 Book 객체 생성
		 2) 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고)
		 3) 객체가 가진 필드 값을 toString()을 이용하여 출력

		 4) 첫 번째 객체가 가진 값을 setter를 이용하여 수정
		 5) 수정된 객체의 필드 값을 toString() 메소드를 이용하여 출력

		 6) 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		 7) 할인된 가격 = 가격 - (가격 * 할인율)
	
			기본 생성자, 매개변수 생성자 이용하여 2개의 Book 객체 생성 후 필드 정보 출력.
	 		setter 메소드를 이용하여 첫 번째 객체 값 수정 후 필드 정보 출력
			getter 메소드를 이용하여 할인율을 적용한 책 가격 출력

	
	사용데이터
	title         price   discountRate   author
	자바의 정석   30000   0.2            남궁성
	
	실행화면
	null / 0 / 0.0 / null
	자바의정석 / 30000 / 0.2 / 남궁성
	=============================
	수정된 결과 확인
	C언어 / 30000 / 0.1 / 홍길동
	=============================
	도서명 = C언어
	할인된 가격 = 27000원
	도서명 = 자바의정석
	할인된 가격 = 24000원*/
		

	public void practice() {
		Book book1=new Book(); //jvm 기본값
		Book book2=new Book("자바의 정석", 30000, 0.2, "남궁성");
		System.out.println(book1.toString()); //book1만 써도 toString이 암시적으로 따라옴
		System.out.println(book2.toString());
		System.out.println("===========================");
		
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(book1.toString()); 
		System.out.println("===========================");

		System.out.printf("도서명 = %s\n", book1.getTitle());
		System.out.printf("할인된 가격 = %d원\n", (int)(book1.getPrice()-(book1.getPrice()*book1.getDiscountRate())));
		System.out.printf("도서명 = %s\n", book2.getTitle());
		System.out.printf("할인된 가격 = %d원\n", (int)(book2.getPrice()-(book2.getPrice()*book2.getDiscountRate())));
	}
}
