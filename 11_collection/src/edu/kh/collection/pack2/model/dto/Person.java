package edu.kh.collection.pack2.model.dto;

import java.util.Objects;

public class Person {

	private String name;
	private int age;
	private char gender;

	public Person() {
	}

	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, gender, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && gender == other.gender && Objects.equals(name, other.name);
	}

	// 객체같음(동일,동등)을 어떻게 비교할까?
	// 동일:가리키고 있는 것이 같음->메모리주소같음->HashCode()로 객체 식별
	// 동등:값이 같음->메모리주소 달라도 객체 내부 값이 같으면 같은 객체로 간주->equals() 메서드로 판단

}
