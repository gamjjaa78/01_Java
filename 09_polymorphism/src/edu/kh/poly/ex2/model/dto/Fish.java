package edu.kh.poly.ex2.model.dto;

public class Fish extends Animal {
	public Fish() {
	}

	public Fish(String type, String eatType) {
		super(type, eatType);
	}

	@Override
	public void eat() {
		System.out.println("입을 뻐끔뻐끔 먹어");
	}

	@Override
	public void breath() {
		System.out.println("아가미 호흡 제 1장");

	}

	@Override
	public void move() {
		System.out.println("꼬리로 헤엄");

	}

	@Override
	public String toString() {
		return "Fish:" + super.toString();
	}
}
