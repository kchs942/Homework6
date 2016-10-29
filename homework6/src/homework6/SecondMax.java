package homework6;
import java.util.*;
public class SecondMax {
        int su[]=new int[10];
	
        void input(){
				 
		  Scanner s=new Scanner(System.in);
		  
		  for(int i=0;i<this.su.length;i++){
	  		System.out.print(i+1+"번째 수를 입력하시오 :");
	  		this.su[i]=s.nextInt();
		  }
	  		print();
	}
	
	void print(){
		int Max=0;
		int secondmax=0;
		int maxindex=0;
		int secondindex=0;
		if(this.su[0]>this.su[1]){
			Max=this.su[0];
			secondmax=this.su[1];
			maxindex=0;
			secondindex=1;
		}
		else {
			Max=this.su[1];
			secondmax=this.su[0];
			maxindex=1;
			secondindex=0;
		}
		
		for(int i=2;i<this.su.length;i++){
			if(this.su[i]>Max){
				secondmax=Max;
				secondindex=maxindex;
				Max=this.su[i];
				maxindex=i;
			}
			else if(this.su[i]>secondmax){
				secondmax=this.su[i];
				secondindex=i;
			}
		}
		System.out.println("두번째로 큰수는 "+(secondindex+1)+"번쨰수"+secondmax+"입니다");
	}
}

