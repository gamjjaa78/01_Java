package edu.kh.variable.practice;

public class CastingPractice2 {

	public static void main(String[] args) {
	
		int age=30;
		System.out.println("나는 "+age+"살입니다.");
		
		int score=90;
		System.out.println("최종 점수 : "+(score+10));
		score=score+10; //강사
		System.out.println(score);
		score +=10; //강사
		System.out.println(score);

		int a=10;
		double b=a;
		System.out.println("a="+a);
		System.out.println("b="+b);
				
		double pi=3.14159;
		int num=(int)pi;//강사
		System.out.printf("%.2f, %d\n", pi, (int)pi);
		System.out.printf("pi=%.2f, num=%d\n", pi, num);//강사
	
		char ch='A';
		int code=ch;//강사
		System.out.println("문자:"+ch+", 코드값:"+(int)ch);
		System.out.printf("문자:%c, 코드값:%d\n", ch, (int)ch);
		System.out.printf("문자:%c, 코드값:%d\n", ch, code);//강사

		final int PRICE=5000;
		int count=3;
		int total=PRICE*count;//강사
		System.out.printf("물건 가격:%d원, 개수:%d개, 총액:%d\n", PRICE, count, PRICE*count);
		System.out.printf("물건 가격:%d원, 개수:%d개, 총액:%d\n", PRICE, count, total);//강사
		
		int kor=95;
		int eng=87;
		int math=90;
		//int kor=95, eng=87, math=90; 강사
		int sum=kor+eng+math;//강사
		double avg=sum/3.0;//강사
		System.out.printf("국어:%d, 영어:%d, 수학:%d\n", kor, eng, math);
		System.out.printf("총점:%d, 평균:%.2f\n", kor+eng+math, (float)(kor+eng+math)/3);
		System.out.printf("총점:%d, 평균:%.2f\n", sum, avg);//강사
		
		String str1="국어 "+kor;//string 한번 써봄ㅋㅋ 
		String str2="영어 "+eng;
		String str3="수학 "+math;
		System.out.println(str1+"\n"+str2+"\n"+str3);
				
		String name="영숙";
		int age2=28;
		double height=165.7;
		
		System.out.printf("출연자 이름:%s\n", name);
		System.out.printf("나이:%d세\n", age2);
		System.out.printf("키:%.1fcm\n", height);
		System.out.printf("출연자 이름:%s\n나이:%d세\n키:%.1fcm\n", name, age2, height);//강사
			
		double doubleage=age2;
		System.out.println("자동 형변환된 나이(double):"+doubleage);
		
		int inHeight=(int)height;
		System.out.println(inHeight);
		
				
		int score1=87;
		int score2=92;
		//double d3=(score1+score2)/2;
		//System.out.println(d3);
		System.out.printf("%.1f", (double)((score1+score2)/2));//강사
		//쌍따옴표 안의 내용이 그대로 출력됨, 우측 변수에서 연산돼야함
		
		
		
	}

}
