package edu.kh.poly.ex2.run;

import edu.kh.poly.ex2.model.service.CMCalculator;
import edu.kh.poly.ex2.model.service.Calculator;
import edu.kh.poly.ex2.model.service.HJCalculator;

public class AbstractRun {
	public static void main(String[] args) {
//		new AbstractService().ex1();
//		Calculator cal2 = new HJCalculator();

		Calculator cal = new CMCalculator();

		System.out.println("합:" + cal.plus(20, 30));
		System.out.println("차:" + cal.minus(20, 30));
		System.out.println("곱:" + cal.multiple(20, 30));
		System.out.println("몫:" + cal.divide(20, 30));

		// 인터페이스==미완성 설계도==객체 생성 불가능
		// 참조변수로는 사용가능

		// 코드의 큰 수정없이 자식 객체 생성 코드만 바꾸면 새 클래스 코드 수행가능

		// 인터페이스 특징
		// 인터페이스를 부모 참조변수로 사용하면 다형성 중 업캐스팅 적용돼
		// 상속받은 모든 클래스르르 자식객체로 참조가능
		// ->이를 이용해 중요한 메인코드 수정 최소화

		// 자식클래스에 공통된 메서드 강제 구현 요구해서 모든 자식 클래스가 동일형태
		// ->이를 이용해 공동작업(팀프로젝트)에 필요한 개발환경 조성 용이!

	}
}
