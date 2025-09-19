package edu.kh.array.ex;

import java.util.Arrays;

public class arrayExample2 {

	public void shallowCopy() {
//		얕은 복사
//		주소복사해 서로 다른 두 참조변수가
//		하나의 배열(또는 객체)을 참조하는 상태를 만드는 복사 방법

		int[] arr = { 1, 2, 3, 4, 5 }; // 주소값 저장됨
		int[] copyArr = arr;

		System.out.println("==변경 전==");
		System.out.println("주소 " + arr);
		System.out.println("주소 " + copyArr);
		System.out.println("요소 " + Arrays.toString(arr));
		System.out.println("요소 " + Arrays.toString(copyArr) + "\n");

		copyArr[2] = 999; // 복사본의 배열값 변경

		System.out.println("==변경 후==");
		System.out.println("주소 " + arr);
		System.out.println("주소 " + copyArr);
		System.out.println("요소 " + Arrays.toString(arr));
		System.out.println("요소 " + Arrays.toString(copyArr) + "\n");
	}

	public void deepCopy() {
//		깊은 복사
//		같은 자료형의 새로운 배열을 만들어 기존 배열 데이터 모두 복사

		int[] arr = { 1, 2, 3, 4, 5 };

//		1. for문 
		int[] copyArr1 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			copyArr1[i] = arr[i];

		}
		System.out.println("for문");
		System.out.println("주소 " + arr);
		System.out.println("주소 " + copyArr1);
		System.out.println("요소 " + Arrays.toString(arr));
		System.out.println("요소 " + Arrays.toString(copyArr1) + "\n");

//		2. System.arraycopy((원본배열명, 원본복사 시작인덱스, copyArr1, 0, 0);
//			    		    복사베열명, 복사배열의 삽입시작인덴스, 복사길이
		int[] copyArr2 = new int[arr.length];
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		System.out.println("System.arraycop " + Arrays.toString(copyArr2) + "\n");

//		3. 복사할 참조변수 = Arrays.copyOf(원본배열명, 복사할 참
		int[] copyArr3 = Arrays.copyOf(arr, arr.length);
		System.out.println("Arrays.copyOf " + Arrays.toString(copyArr3) + "\n");

//		값 변경 후 확인
		copyArr1[2] = 0;
		copyArr2[2] = 999;
		copyArr3[2] = 5000;
		System.out.println("값 변경 후 확인");
		System.out.println(Arrays.toString(copyArr1));
		System.out.println(Arrays.toString(copyArr2));
		System.out.println(Arrays.toString(copyArr3));

	}

	public void createLottoNumber() {
//		**로또 번호 생성기**
//		배열 이용한 중복데이터 제거+정렬
		
//		1~45 사이 중복되지 않은 난수 6개 생성
//		생성된 난수를 오름차순 정렬
//		[5, 11, 13, 18, 24, 25]
		
//		1. 정수 6개 저장할 배열 선언 및 할당
		int[] lotto=new int[6];
		
//		2. 생성된 배열(lotto)을 처음부터 끝까지 순차접근하는 for문 작성
		for(int i=0; i<lotto.length; i++) {
		
//		3. 1~45 사이 난수 생성
			int random=(int)(Math.random()*45+1);
			
//		4. 생성된 난수를 순서대로 배열 요소에 대입
			lotto[i]=random;
		  //lotto[0]=8; [8,0,0,0,0,0]
		  //lotto[1]=10; [8,10,0,0,0,0]
		  //lotto[2]=8; [8,10,8,0,0,0]

//		5. 중복 검사를 위한 for문 작성
			for (int x=0; x<i; x++) {
				
//		6. 현재 생성된 난수와 같은 수가 이전 요소에 존재하는지 검사
				if(random==lotto[x]) {
				i--; //i가 1씩 증가할때마다 난수1개 생성, 중복값 존재시 새 난수 생성필요
					 //i값을 인위적으로 1 감소시켜 난수발생의 기회를 한번 더 줌!!
				break; //인덱스 0번의 8과 같은 수가 나왔으니 인덱스 1번의 10과 비교할 필요없어	
					   //앞쪽에서 중복데이터 발견시 남은 값 비교필요없음->효율향상위해 중복검사용 for문 종료
				}
				
			}
			
		} //바깥쪽 for문의 끝
		
//		7. 정렬
//		선택, 삽입, 버블, 퀵 등 자바가 정렬방법을 미리 만들어 제공함
//		Arrays.sort(배열명) : 배열 내 요소값들이 오름차순 정렬
		
		Arrays.sort(lotto);
		System.out.println("즐거운 로또번호!!");
		System.out.println(Arrays.toString(lotto));
	}
}
