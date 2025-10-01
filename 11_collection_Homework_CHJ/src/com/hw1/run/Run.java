package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {
	public static void main(String[] args) {
		List<Friend> ffList = new ArrayList<>();
		ffList.add(new Friend("짱구"));
		ffList.add(new Friend("철수"));
		ffList.add(new Friend("유리"));
		ffList.add(new Friend("훈이"));
		ffList.add(new Friend("맹구"));
	
		int index = (int) (Math.random() * ffList.size());
		Friend select=ffList.get(index);
		System.out.println(select.getName()+"가 떡잎방범대 대장이다!");
		//랜덤으로 인덱스 번호만 뽑은 것, 해당 인덱스 내용알려면 겟으로 갖고와야돼
		//Friend에 toString 오버라이딩 안할거면 get으로 name만 직접출력
		//==System.out.println(ffList.get(index).getName()+"가 떡잎방범대 대장이다!");
	}
}
