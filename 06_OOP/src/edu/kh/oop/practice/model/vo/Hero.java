package edu.kh.oop.practice.model.vo;

public class Hero {
	private String nickname;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private double exp;
	
	
	
	public Hero() {
	}

	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
		
		System.out.printf("=====캐릭터 생성=====\n"
				+ "%s 직업으로 '%s'님이 생성됐다.\n"
				+ "현재 레벨 : %d\n"
				+ "현재 hp : %d\n"
				+ "현재 mp : %d\n"
				+ "현재 경험치 : %.1f\n", job, nickname, level, hp, mp, exp);
	}
	
	
	
	public void attck(double exp) {
		this.exp += exp; // 매개변수 exp와 구별위해 this, 전달받은 경험치를 현재 경험치에 누적
		System.out.printf("'%s' 은/는 공격을 했다! 현재 경험치: %.1f\n", nickname, this.exp);

		if (this.exp >= 300) {
			level++; // level +=1;
			System.out.println("레벨오름! 현재 레벨: " + level);
		}

	}

	public void dash() {

		if (mp <= 0) {
			System.out.println("[마력 부족] 더이상 대시불가");
			// return; else대신 사용가능

		} else {
			mp -= 10;
			System.out.printf("'%s'의 엄청 빠른 대시! 남은 마력:%d\n", nickname, mp);
		}
	}

	@Override
	public String toString() {
		return "========'%s님의 정보'========\n" + "현재 레벨 %d\n" + "현재hp %d\n" + "현재mp %d\n" + "현재exp %.1f\n";
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

}
