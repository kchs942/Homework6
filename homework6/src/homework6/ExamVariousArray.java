package homework6;

import java.util.*;
public class ExamVariousArray {

	public static void main(String[] args) {
		int number;
		Scanner s=new Scanner(System.in);
	    do{
	    	System.out.println("1. �ι�°�� ū �� ã��");
	    	System.out.println("2. �ɻ� ���� ���");
	    	System.out.println("3. �л� ����,��հ� ���ϱ�");
	    	System.out.println("4. 5�� ����Ʈ�� ������ ���� ���ϱ�");
	    	System.out.println("5. ��ġ�� �ʴ� ���� 10�� �Է¹ޱ�");
	    	System.out.println("6. ��ġ�� �ʴ� ���� 10�� �Է¹ޱ�");
	    	System.out.println("���ϴ� �޴���>>");
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
	    System.out.print("�����ϼ̽��ϴ�.");
	   

	}

}