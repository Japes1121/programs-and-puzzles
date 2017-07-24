package round1;

public class SortAscDescInArray {
	
	int[] numbers={1,2,3,4,5,6,7,8,9};
	int temp;
	public void sortArray(){
		for(int i=1;i<3;i++){
				//sorting even number positions in ascending order
				if(i%2==0){
					for(int j=1;j<numbers.length;j=j+2){
						for(int k=1;k<numbers.length;k=k+2){
							if(numbers[k] > numbers[j]){
								temp=numbers[k];
								numbers[k]=numbers[j];
								numbers[j]=temp;
							}
						}
					}
					
				}
				//sorting odd number positions in descending order
				else{
					for(int j=0;j<numbers.length;j=j+2){
						for(int k=0;k<numbers.length;k=k+2){
							if(numbers[k] < numbers[j]){
								temp=numbers[k];
								numbers[k]=numbers[j];
								numbers[j]=temp;
							}
						}
					}
				}
		}
		
		for(int n : numbers){
			System.out.print(n+" ");
		}
	}
	
	//1,2,3,4,5,6,7,8,9
	
	
	public void sortArrayOpt(){
		
		for(int j=0;j<numbers.length;j++){
			for(int k=0;k<numbers.length;k++){
			//sorting even number positions in ascending order
			if(j%2==0 && k%2==0){
						if(numbers[k] < numbers[j]){
							temp=numbers[k];
							numbers[k]=numbers[j];
							numbers[j]=temp;
						}
				
			}
			//sorting odd number positions in descending order
			else if (j%2 != 0 && k%2 !=0){
						if(numbers[k] > numbers[j]){
							temp=numbers[k];
							numbers[k]=numbers[j];
							numbers[j]=temp;
						}
				
			}
		    }
		}
		
		for(int n : numbers){
			System.out.print(n+" ");
		}
	}

}

// 2 15 10