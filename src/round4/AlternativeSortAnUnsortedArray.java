package round4;
/*
 * Alternately sort an unsorted array..
 * 
 * eg) i/p {5,2,8,7,4,3,9}
 *    o/p {9,2,8,3,7,4,5}
 */
public class AlternativeSortAnUnsortedArray {

	int[] numbers;
	
	public AlternativeSortAnUnsortedArray(int[] a){
		numbers=a;
	}
	
	public void sort(){
	int temp;
		for(int j=0;j<numbers.length;j++){
			for(int k=j;k<numbers.length;k++){
			//sorting even number positions in ascending order
			if(j%2==0){
						if(numbers[k] > numbers[j]){
							temp=numbers[k];
							numbers[k]=numbers[j];
							numbers[j]=temp;
						}
				
			}
			else{
				if(numbers[k] < numbers[j]){
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
