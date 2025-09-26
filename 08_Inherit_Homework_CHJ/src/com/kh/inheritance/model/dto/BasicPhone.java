package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone {

	private boolean hasPhysicalKeybord;

	public BasicPhone() {
	}

	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeybord) {
		super(brand, model, year, price);
		this.hasPhysicalKeybord = hasPhysicalKeybord;
	}

	public boolean isHasPhysicalKeybord() {
		return hasPhysicalKeybord;
	}

	public void setHasPhysicalKeybord(boolean hasPhysicalKeybord) {
		this.hasPhysicalKeybord = hasPhysicalKeybord;
	}

	public void checkKeyboard() {

		if (hasPhysicalKeybord) {
			System.out.println("물리적 키보드 있음");
		} else {
			System.out.println("물리적 키보드 없어");
		}

	}

}
