package homework6;

import java.util.Scanner;

public class AptPersonCount {
	 int apt[][]=new int[5][3];
		
     void input(){
			
		  Scanner s=new Scanner(System.in);
		  
		  for(int i=0;i<this.apt.length;i++){
	  		
	  	    for(int j=0;j<this.apt[0].length;j++){
	  	    	System.out.print((i+1)+"0"+(j+1)+"호에 살고 있는 사람의 숫자 :");
				this.apt[i][j]=s.nextInt();
			}
		  }
	  		print();
	}
	
	void print(){
		 int levelsum[]=new int[5];
		 int linesum[]=new int[3];
		 int totalsum=0;
		 
		 for(int i=0;i<this.apt.length;i++){
			   for(int j=0;j<this.apt[0].length;j++){
				   totalsum+=this.apt[i][j];
			   if(i==0) levelsum[i]+=this.apt[i][j];
			   if(i==1) levelsum[i]+=this.apt[i][j];
			   if(i==2) levelsum[i]+=this.apt[i][j];
			   if(i==3) levelsum[i]+=this.apt[i][j];
			   if(i==4) levelsum[i]+=this.apt[i][j];
			   }
			   
		 }
		  System.out.println("이 아파트의 거주자는 모두"+totalsum+"입니다");	   
	  
		
		   for(int i=0;i<this.apt.length;i++)
		System.out.println((i+1)+"층에 사는 거주자는 모두"+levelsum[i]+"명입니다");
		   
		   for(int i=0;i<this.apt.length;i++)
			   for(int j=0;j<this.apt[0].length;j++){
			   if(j==0) linesum[j]+=this.apt[i][j];
			   if(j==1) linesum[j]+=this.apt[i][j];
			   if(j==2) linesum[j]+=this.apt[i][j];
			   
			   
			   }
		   
		   for(int i=0;i<this.apt[0].length;i++)
				System.out.println(i+1+"호 라인에 사는 거주자는 모두"+linesum[i]+"명입니다");
	}
}
