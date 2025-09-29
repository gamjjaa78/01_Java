package com.hw1.run;

import java.util.Arrays;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run {

	public static void main(String[] args) {

		Book nv = new Novel("해리 포터", "J.K.롤링", "판타지");
		Book tb = new Textbook("자바 프로그래밍", "James Gosling", "컴퓨터 과학");
		Book pt = new Poetry("우리들의 사랑시", "김소월", 30);

		Book[] arr = new Book[3];
		arr[0] = nv;
		arr[1] = nv;
		arr[2] = nv;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr)); //요소값이 안나왘ㅋㅋㅋ
		}

	}

}
