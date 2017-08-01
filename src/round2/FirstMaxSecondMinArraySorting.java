package round2;

public class FirstMaxSecondMinArraySorting {
	private int[] numbers;
	
	public FirstMaxSecondMinArraySorting(int[] numbers){
		this.numbers=numbers;
	}

	public int[] sortFirstMaxSecondMinArray()
	{
		int temp;
		for(int i=0;i<numbers.length;i++){
			for(int j=i;j<numbers.length;j++){
				if(i%2==0){
					if(numbers[i]<numbers[j]){
						temp=numbers[i];
						numbers[i]=numbers[j];
						numbers[j]=temp;
					}
				}
				else{
					if(numbers[i]>numbers[j]){
						temp=numbers[i];
						numbers[i]=numbers[j];
						numbers[j]=temp;
					}
				}
			}
		}
		return numbers;
	}
	
	
	public void printArray(){
		this.sortFirstMaxSecondMinArray();
		for(int n:numbers){
			System.out.print(n+", ");
		}
	}
	
}
