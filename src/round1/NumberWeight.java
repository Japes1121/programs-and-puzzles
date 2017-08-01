package round1;

public class NumberWeight {

	int[] number={10, 36, 54, 89, 12};
	int arrayLength=number.length;
	int[][] numweWithWeightage= new int[arrayLength][2]; 
	int weightage;
	
	public void findWeightage(){

		for(int i=0;i<arrayLength;i++){
			weightage=0;
			
			if(Math.floor(Math.sqrt(number[i])) == Math.ceil(Math.sqrt(number[i]))){
				weightage+=5;
			}
			
			//If a number is divisible by 4 and 6 then it is definitely even number
			if(number[i] % 4 ==0 && number[i] %6 ==0){
				weightage+=7;
				numweWithWeightage[i][0]=number[i];
				numweWithWeightage[i][1]=weightage;
				continue;
			}
			
			if(number[i]%2==0){
				weightage+=3;
			}
			
			numweWithWeightage[i][0]=number[i];
			numweWithWeightage[i][1]=weightage;
		}		
	}
	
	
	public void printNumbers(){
		this.findWeightage();
		int val,wei;
		
		/*for(int n=0;n<arrayLength;n++){
			System.out.println("<"+numweWithWeightage[n][0] + " , "+numweWithWeightage[n][1]+">");
		}
		*/
		for(int i=0;i<arrayLength;i++){
			for(int j=0;j<arrayLength;j++){
			if(numweWithWeightage[j][1] > numweWithWeightage[i][1]){
				val=numweWithWeightage[j][0];
				wei=numweWithWeightage[j][1];
				
				numweWithWeightage[j][0]=numweWithWeightage[i][0];
				numweWithWeightage[j][1]=numweWithWeightage[i][1];
				
				numweWithWeightage[i][0]=val;
				numweWithWeightage[i][1]=wei;
				
				}
			}
		}
		
		
		for(int n=0;n<arrayLength;n++){
			System.out.println("<"+numweWithWeightage[n][0] + " , "+numweWithWeightage[n][1]+">");
		}
	}
	
	
}
