package homework6;

import java.util.*;
public class AvgScore {
        double jumsu[]=new double[10];
	
        void input(){
				 
		  Scanner s=new Scanner(System.in);
		  
		  for(int i=0;i<this.jumsu.length;i++){
	  		System.out.print(i+1+"번 심사점수 입력 :");
	  		this.jumsu[i]=s.nextDouble();
		  }
	  		print();
	}
	
	void print(){
		double Max=0.0;
		double Min=0.0;
		double avg=0.0;
		if(this.jumsu[0]>this.jumsu[1]){
			Max=this.jumsu[0];
			Min=this.jumsu[1];
		}
		else {
			Max=this.jumsu[1];
			Min=this.jumsu[0];
		}
		for(int i=2;i<this.jumsu.length;i++){
			if(Max<this.jumsu[i])
				Max=this.jumsu[i];
		
		if(Min>this.jumsu[i])
			Min=this.jumsu[i];
		}
		for(int i=0;i<this.jumsu.length;i++){
			avg+=this.jumsu[i];
			
		}
		avg-=(Max+Min);
		avg=avg/8.0;
		System.out.println("가장 큰 점수와 가장작은 점수를 제외한 8개의 점수 평균은 "+String.format("%.1f",avg)+"입니다");
	}
}