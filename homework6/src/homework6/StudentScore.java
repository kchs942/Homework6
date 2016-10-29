package homework6;

import java.util.Scanner;

public class StudentScore {
	 int subject[][]=new int[5][3];
		
     void input(){
				 
		  Scanner s=new Scanner(System.in);
		  
		  for(int i=0;i<this.subject.length;i++){
	  		System.out.print(i+1+"번 학생 국어,영어,수학 :");
	  	    for(int j=0;j<this.subject[0].length;j++)
	  	    	this.subject[i][j]=s.nextInt();
		  }
	  		print();
	}
	
	void print(){
		String classname[]={"국어","영어","수학"};
		 int subjectsum[]=new int[3];
		 int Studentsum[]=new int[5];
		   for(int i=0;i<this.subject.length;i++)
			   for(int j=0;j<this.subject[0].length;j++){
			   if(j==0) subjectsum[j]+=this.subject[i][0];
			   if(j==1) subjectsum[j]+=this.subject[i][1];
			   if(j==2) subjectsum[j]+=this.subject[i][2];
			   }
		
		   for(int i=0;i<this.subject[0].length;i++)
		System.out.println(classname[i]+"총점은"+subjectsum[i]+"점이고, 평균은"+String.format("%.1f",(subjectsum[i]/5.0)));
		   
		   for(int i=0;i<this.subject.length;i++)
			   for(int j=0;j<this.subject[0].length;j++){
			   if(i==0) Studentsum[i]+=this.subject[i][j];
			   if(i==1) Studentsum[i]+=this.subject[i][j];
			   if(i==2) Studentsum[i]+=this.subject[i][j];
			   if(i==3) Studentsum[i]+=this.subject[i][j];
			   if(i==4) Studentsum[i]+=this.subject[i][j];
			   
			   }
		   
		   for(int i=0;i<this.subject.length;i++)
				System.out.println(i+1+"번 학생의 총점은"+Studentsum[i]+", 평균은"+String.format("%.1f",(Studentsum[i]/3.0)));
	}
}
