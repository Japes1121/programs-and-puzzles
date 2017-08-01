package round4;

/*
 * Given bigger NxN matrix and a smaller MxM matrix 
 * print TRUE if the smaller matrix can be found in the bigger matrix 
 * else print FALSE
 */
public class FindMatrixInMatrix {

	int[][] a,b;
	
	public FindMatrixInMatrix(int[][] a,int[][] b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
	}
	
	public void rotateAndCheck(){
		int[][] bkp;
		RotateAndCompareArray rca=new RotateAndCompareArray();
		
		this.findMatrix(a);
		
/*
 * This below logic is to rotate array and find whether the given array is present in rotated array
 * 
 		bkp = rca.rotateClockWise(a);
		
		bkp = rca.rotateClockWise(bkp);
		
		bkp = rca.rotateClockWise(bkp);
		
		bkp = rca.rotateAntiClockWise(a);
		
		bkp = rca.rotateAntiClockWise(bkp);
		
		bkp = rca.rotateAntiClockWise(bkp);*/
		
	}
	
	public void findMatrix(int[][] arr){
		int count = 0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j] == b[0][0]){
					int row=i,col=j;
					for(int k=0;k<b.length;k++){
						for(int l=0;l<b[0].length;l++){
							if(b[k][l] == arr[row][col]){
								count++;
							}
							col++;
						}
						row++;
						col=j;
					}
				}
				if(count==(b.length * b[0].length)){
					flag=true;
					break;
				}
			}
			if(count==(b.length * b[0].length)){
				flag=true;
				break;
			}
		}
		
		System.out.println("Status : "+flag);
	}
	
	
	
}
