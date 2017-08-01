package round12;
/*
 * for n = 6
 * 1	7	12	16	19	21
 * 2	8	13	17	20
 * 3	9	14	18	
 * 4	10	15
 * 5	11	
 * 6 
 */
public class PrintPattern {
	int num;
	public PrintPattern(int n) {
		// TODO Auto-generated constructor stub
		num=n;
	}
	
	public void printPattern(){
		int endPattern=1;
		int startNumber=1;
		int count=num;
		while(num >= 1){
			int temp=startNumber;
			for(int i=count;i>=endPattern;i--){
					System.out.print(" "+temp);
					temp+=i;
				}
			
			System.out.println(" ");
			num=num-1;
			startNumber++;
			temp=startNumber;
			endPattern++;
		}
	}

}
