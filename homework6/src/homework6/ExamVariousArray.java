package homework6;

import java.util.*;
public class ExamVariousArray {

	public static void main(String[] args) {
		int number;
		Scanner s=new Scanner(System.in);
	    do{
	    	System.out.println("1. 두번째로 큰수 찾기");
	    	System.out.println("2. 심사 점수 계산");
	    	System.out.println("3. 학생 총점, 평균값구하기");
	    	System.out.println("4. 5층 아파트의 거주자 숫자 구하기");
	    	System.out.println("5. 겹치지 않는 숫자 10개 입력받기");
	    	System.out.println("6. 종료하기");
	    	System.out.println("원하는 메뉴는>>");
	    	number=s.nextInt();
	    	
	    		if(number==1)
	    			new SecondMax().input();
	    		
	    		else if(number==2)
	    			new AvgScore().input();
	    		
	    		else if(number==3)
	    			new StudentScore().input();
	    		
	    		else if(number==4)
	    			new AptPersonCount().input();
	    		
	    		else if(number==5)
	    			new OnlyNumber().input();
	    		
	    		
	   	    	
	    }
	    while(number!=6); 
	    System.out.print("종료되었습니다.");
	   

	}

}