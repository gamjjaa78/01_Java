package edu.kh.oop.method.model.vo;

public class Member { //회원클래스
//	속성+기능
//	필드(==속성)
	private String memenrId;
	private String memenrPw;
	private String memenrName;
	private int memenrAge;
	
	//	기능(==메서드/생성자)
	public Member() {}
		
	public Member(String memenrId, String memenrPw, String memenrName, int memenrAge) {
		this.memenrId = memenrId;
		this.memenrPw = memenrPw;
		this.memenrName = memenrName;
		this.memenrAge = memenrAge;
	}



	public String getMemenrId() {
		return memenrId;
	}
	public void setMemenrId(String memenrId) {
		this.memenrId = memenrId;
	}
	public String getMemenrPw() {
		return memenrPw;
	}
	public void setMemenrPw(String memenrPw) {
		this.memenrPw = memenrPw;
	}
	public String getMemenrName() {
		return memenrName;
	}
	public void setMemenrName(String memenrName) {
		this.memenrName = memenrName;
	}
	public int getMemenrAge() {
		return memenrAge;
	}
	public void setMemenrAge(int memenrAge) {
		this.memenrAge = memenrAge;
	}
	
	
	
	
}
