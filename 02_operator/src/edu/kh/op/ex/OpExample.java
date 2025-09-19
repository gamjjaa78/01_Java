package edu.kh.op.ex;

import java.util.Scanner;

//예제 코드 작성용 클래스(기능용/메서드용)
public class OpExample {
	
	//기능들만,,==메서드들
	//ex1() method
	public void ex1() {
		System.out.println("안녕!");
	}
	
	public void ex2() {
		System.out.println("점심뭐먹지~!");
	}
	
	public void testEx1() {
		//증감 연산자 : ++, --
		//1을 더하거나 감소시키는 연산자
		
		int iNum1=10;
		int iNum2=10;
		
		iNum1++;
		iNum2--;
		
		System.out.println("iNum1: "+iNum1);
		System.out.println("iNum2: "+iNum2);
		
		int temp1=5;
		System.out.println(++temp1+5);//11
		                   //6+5->11
		
		int temp2=3;
		System.out.println(temp2-- +2);//5
		                  //+2 -> 5 그리고 출력
		                  //-1 -> 2 
		System.out.println(temp2); //2
		
		int a=3;
		int b=5;
		int c=a++ + --b;
		
		//3++ + --5     
		//3++ + --4 (b) ->전위연산자 계산돼 b가 1 줄어들고, 3인 a와 더해짐
		//c=7 			->c에 값이 대입됨
		//3++ -> 4 (a)  ->이후 후위연산자 ++ 계산돼 증가
		
		System.out.printf("%d / %d / %d", a,b,c); //  447
	}
	
	public void testEx2() {
		
		//비교 연산자: > < >= <= == !=
		//값은 늘 논리값(true/false)
		
		int a=10;
		int b=20;
		System.out.println((a==b)==false);
						//(false)==false
						//->true
		
		int c=4;
		int d=5;
		System.out.println((++c!=d)==(--c!=d));
							//4!=5 ->5!=5 ->f
							//5!=5(<-전항에서 c는 5가 됨) ->4!=5 ->t 
							//f
		
		System.out.println(100>99);//t
		System.out.println(100>=99);//t
		System.out.println(99<94);//f
		System.out.println(99<=100);//t
						
	}
	
	public void testEx3() {
		//논리 연산자 &&(and), ||(or)	
		//|| ->S+백슬래시
			
		//&& 둘다 true시 true, 나머지 false
		//와, 그리고, ~면서, ~부터 ~까지, 사이
			
		int a=101;
		//a는 100 이상이면서 짝수인가? f
		System.out.println((a>=100)&&(a%2==0)); //짝수, 2로나눌때 나머지0
		
		int b=5;
		//b는 1부터 10까지 숫자범위에 포함돼 있는가? t
		System.out.println((b>=1)&&(b<=10));
		
		
		//|| 둘다 false면 false, 나머지 true
		//또는, 혹은, ~거나
		
		int c=10;
		//c는 10을 초과하거나 짝수인가? t
		System.out.println((c>10)||(c%2==0));
		
		
	}
		
	public void testEx4() {	
		//삼항 연산자 :
		//조건식?true일때 수행될 값 : false일때 수행될값 <-형태
		
		int num=30;
		//num이 30보다 크면(초과) "num은 30보다 큰수이다"
		//아니면 "num은 30 이하의 수이다"
	
		String result=num>30? "num은 30보다 큰 수이다" : "num은 30 이하의 수이다";
					 //num>30?이 조건식
		//답이 아닌건 사라짐, 답은 변수에 넣어야돼
		System.out.println(result);
		
			//입력받은 정수가 음수인지 양수인지 구분, 0은 양수로 처리
				//정수 입력 : 4
				//양수 입니다.
				//정수 입력 : -5
				//음수 입니다.
		
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int input=sc.nextInt();
		String result1=input>=0? "양수 입니다." : "음수 입니다.";
		System.out.println(result1);
		
	}
		
	public void testEx5() {
		//복합대입 연산자
		//+= -= *= /= %=

		int a = 10;
		a += 10;
		// a=a+10;
		System.out.println(a); 
		
		int b = 20;
		b -= 10;
		//b=b-10;
		System.out.println(b);
		
		//부정연산자 !논리값
		//논리값을 반대로 적용
		
		System.out.println(!true);
		System.out.println(!(10!=10));
							//!(false) / t
		
		//비트 단위 부정(not) 연산자
		int c=5;
		System.out.println(~c);
		//32bit (int는 4byte)
		//00000000 00000000 00000000 00000101
		//11111111 11111111 11111111 11111010
						
	}
	
}
