package Lab4;

import java.util.Random ;

public class MyClassicalArray {
	//Properties
	public int[] MyArray = new int[10];
	public Random rand = new Random();
	
	//Method
	public void Rand(){
		
		for(int i = 0 ; i <= 9 ; i ++) {
			
		this.MyArray[i] = rand.nextInt(100);
		
		System.out.print("Array["+i+"]");
		System.out.println(" = " + this.MyArray[i]);
		
		}//end
		
	}//end
	
	
	public int FMax() {

		int Max = this.MyArray[0];
		for(int i = 0 ; i <= 9 ; i++) {
			
			if(Max < this.MyArray[i]) {
			   Max = this.MyArray[i];
				
			}//end
			
		}//end
	return Max;
	}//end
	
	public int FMin() {

		int Min = this.MyArray[0];
		for(int i = 0 ; i <= 9 ; i++) {
			
			if(Min > this.MyArray[i]) {
			   Min = this.MyArray[i];
				
			}//end
			
		}//end
	return Min;
	}//end

}
