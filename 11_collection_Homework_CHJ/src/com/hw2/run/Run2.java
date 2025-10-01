package com.hw2.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Tiger;
import com.hw2.model.dto.Monkey;

public class Run2 {//service 클래스 없을때
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        //Animal 타입, Animal을 상속한 객체(Tiger, Monkey 등)만 넣을 수 있음
        //List<String> animals = new ArrayList<>(); <-"호랑이", "원숭이"같은 문자열만 저장
        
        // 동물 추가
        animals.add(new Tiger());
        animals.add(new Monkey());

        int menuNum = 0;
        do {
            System.out.println("***** KH 동물원 ******");
            System.out.println("원하는 작업을 선택하세요");
            System.out.println("1. 동물들의 울음소리 듣기");
            System.out.println("2. 종료");
            System.out.print("선택 : ");

            menuNum = sc.nextInt();

            switch (menuNum) {
                case 1:
                    System.out.println("동물들의 울음소리를 들어보세요~");
                    for (Animal animal : animals) {
                        animal.sound();
                    }
                    break;
                case 2:
                    System.out.println("프로그램 종료합니다");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요...");
            }

        } while (menuNum != 2);

        sc.close();
    }
}