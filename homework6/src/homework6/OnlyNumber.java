package homework6;

import java.util.Scanner;

public class OnlyNumber {
	      int num[];
	
	 void input(){
		  this.num=new int[10];
		  int temp;
		  Scanner s=new Scanner(System.in);
		  
		    System.out.println("0~100사이의 숫자를 입력하세요");
		  
		    for(int i=0;i<this.num.length;){
		    	int overlap=0;
		    	
	  		   System.out.print((i+1)+"번째 숫자 :");
	  		         temp=s.nextInt();
	  		     for(int j=0;j<i;j++){
	  		      if(temp==this.num[j]){
	  			       overlap=1;
	  		           break;
	  		      }
	  		    }
	  		     if(overlap!=1&&temp<=100&&temp>=1){
	  			      num[i++]=temp;
	  		        
	  		        }
	  		    else 
	  		    	System.out.println("잘못 입력 하셨습니다.");
		     }
	  		
		    
		  print();

	 }

	 
	 
	 void print(){
		   for(int i=this.num.length-1;i>=0;i--)
			   System.out.println((i+1)+"번째 숫자는"+this.num[i]+"입니다");
			
			
		}
	}

