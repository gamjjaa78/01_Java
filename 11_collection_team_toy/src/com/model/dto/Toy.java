package com.model.dto;

import java.util.Set;

public class Toy {
	private String name;
	private int age;
	private int price;
	private String color;
	private int createDate;
    private Set<String> usedIngredients;
	
	public Toy() {
		// TODO Auto-generated constructor stub
	}

	public Toy(String name, int age, int price, String color, int createDate, Set<String> usedIngredients) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.createDate = createDate;
		this.usedIngredients = usedIngredients;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCreateDate() {
		return createDate;
	}

	public void setCreateDate(int createDate) {
		this.createDate = createDate;
	}
	
	public Set<String> getUsedIngredients() {
		return usedIngredients;
	}

	public void setUsedIngredients(Set<String> usedIngredients) {
		this.usedIngredients = usedIngredients;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + " / 사용가능연령 : " + age + " / 제조년월일 : "
			+ createDate + " / 재료 : " + usedIngredients_print();
	}
		
	public String usedIngredients_print() {
		String result = String.join(", ", usedIngredients);
		return result;
	}
	
}