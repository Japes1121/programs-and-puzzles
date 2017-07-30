package round4;
/*
 * Given an array and a threshold value find the o/p
 * 
 * eg) i/p {5,8,10,13,6,2};
 * 		 threshold = 3;
 *       o/p  count = 17
 *       explanation:
 * Number			parts	            counts
 * 5	            {3,2}                 2
 * 8                {3,3,2}               3
 * 10               {3,3,3,1}             4
 * 13               {3,3,3,3,1}           5
 * 6                {3,3}                 2
 * 2                {2}                   1 
 */
public class ThresholdOfFormingElementsInArray {
	int[] a;
	int threshold;
	int op=0;
	public ThresholdOfFormingElementsInArray(int[] a,int threshold){
		this.a=a;
		this.threshold=threshold;
	}
	
	public void printThreshold(){
		this.findThreshold();
		System.out.println("Threshold : "+op);
	}
	
	public int findThreshold(){
		int num=0;
		for(int i=0;i<a.length;i++){
			num=a[i];
			while(num >0){
				if(num >=3){
					num=num-3;
					op++;
				}else if(num==2){
					num=num-2;
					op++;
				}else if(num==1){
					num=num-1;
					op++;
				}
			}
		}
		return op;
	}
}
