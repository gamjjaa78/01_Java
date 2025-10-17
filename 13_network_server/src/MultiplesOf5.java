
public class MultiplesOf5 {
	public static void main(String[] args) {
//		for(int i=1; i<=20; i++) {
//			switch(i%5) {
//			case 0 : System.out.println(i+" : 5의 배수"); break;
//			default : System.out.println(i+" : 5의 배수아냐"); break;
//			}
//		}
		
		/*
		int i = 1;
		while (i <= 20) { //i를 증가시키는 코드가 없음!!!!!!!!!!!!!!!

			if (i % 5 == 0) {
				System.out.println(i + " 는 5의 배수");
				continue; //아래 코드 미실행, 반복문 재실행 (->무한루프)
			} else if (i % 5 != 0) { //위 continue때문에 절대 실행안됨 
				System.out.println(i + " 는 5의 배수아님");
				continue;
			} else if (i == 20) { //위 조건에서 걸러짐
				break;
			}
		}*/

		/*
		int i = 1;
		while (i <= 20) {
		    if (i % 5 == 0) {
		        System.out.println(i + " 는 5의 배수");
		    } else {
		        System.out.println(i + " 는 5의 배수아님");
		    }
		    i++; // 꼭 넣어야 함! 루프에서 빠져나오게 하기 위해
		}*/
		
		//---------------------------------------------------------------//
		
		/*
		String str="banana";
		int i=0;
				while(i<str.length()) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch+" : 모음");
			} else {
				System.out.println(ch+" : 자음");
				
			} i++;
		}*/
		String str="banana";

		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			
			switch(ch) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
				System.out.println(ch+" : 모음"); break;
			default :System.out.println(ch+" : 자음"); 
		} 
		
		}
		
		
		
		
	}
}
