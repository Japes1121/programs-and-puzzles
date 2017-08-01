package round3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedArrays {

	Integer[] array1={2,4,5,6,7,9,10,13};
	Integer[] array2={2,3,4,5,6,7,8,9,11,15};
	
	List<Integer> finalArray=new ArrayList();
	
	int aLength=array1.length;
	int bLength=array2.length;
	
	boolean araay1Greater=false;
	
	public void logic()
	{
		//Logic 1
		/*loadArrayList();
		populateFinalArray();
		printArray();*/
		
		//Logic 2
		logic2();
	}
	
	public void loadArrayList()
	{
		if(aLength > bLength){
			finalArray.addAll(Arrays.asList(array1));
			araay1Greater=true;
		}
		else{
			finalArray.addAll(Arrays.asList(array2));
			araay1Greater=false;
		}
	}
	
	public void populateFinalArray()
	{
		if(araay1Greater==true){
			for(int i=0;i<bLength;i++){
				if(!finalArray.contains(array2[i])){
					finalArray.add((Integer)array2[i]);
				}
			}
		}
		else{
			for(int i=0;i<aLength;i++){
				if(!finalArray.contains(array1[i])){
					finalArray.add((Integer)array1[i]);
				}
			}
		}
		
		Collections.sort(finalArray);
	}
	
	public void printArray()
	{
		for(Integer num : finalArray){
			System.out.print(num+" ");
		}
	}
	
	public void logic2()
	{
		 int[] answer = new int[array1.length + array2.length];
		    int i = 0, j = 0, k = 0;
		    while (i < array1.length && j < array2.length)
		    {
		        if (array1[i] < array2[j])
		        {
		            answer[k] = array1[i];
		            i++;
		        }
		        else if(array1[i]==array2[j]){
		        	answer[k] = array2[j];
		            j++;
		            i++;
		        }
		        else
		        {
		            answer[k] = array2[j];
		            j++;
		        }
		        k++;
		    }

		    while (i < array1.length)
		    {
		        answer[k] = array1[i];
		        i++;
		        k++;
		    }

		    while (j < array2.length)
		    {
		        answer[k] = array2[j];
		        j++;
		        k++;
		    }

		    for(i=0;i<answer.length;i++){
				System.out.print(answer[i]+" ");
			}
	}
	
}
