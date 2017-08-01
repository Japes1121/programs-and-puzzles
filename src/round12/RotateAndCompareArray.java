package round12;
/*
 * Rotate the given Array 90degree, 180 degree, 270 degree and compare with another array
 * Given two matrices a and b both of size NxN find if matrix a can be transformed to matrix b by rotating it 90deg , 180deg , 270deg if so print TRUE else print FALSE
 * Mirror an array horizontally and vertically 
 */
public class RotateAndCompareArray {

	int[][] a={
			{0,1,2},
			{3,4,5},
			{6,7,8}
	};
	
	int[][] b={
			{6,3,0},
			{7,4,1},
			{8,5,2}
	};
	
	
	int[][] bkp=new int[a.length][a[0].length];
	public void rotateLogic(){
		
		System.out.println("Exact match without rotation : "+this.compare(a, b));
		
		//Clock wise 90 degree rotation
		bkp = this.rotateClockWise(a);
		System.out.println("Match in 90deg clock wise : "+this.compare(bkp, b));
		
		//Clock wise 180 degree rotation
		bkp = this.rotateClockWise(bkp);
		System.out.println("Match in 180deg clock wise : "+this.compare(bkp, b));
		
		//Clock wise 270 degree rotation
		bkp = this.rotateClockWise(bkp);
		System.out.println("Match in 270deg clock wise : "+this.compare(bkp, b));
		
		//Anti-Clock wise 90 degree rotation
		bkp = this.rotateAntiClockWise(a);
		System.out.println("Match in 90deg anti-clock wise : "+this.compare(bkp, b));
		
		//Anti-Clock wise 180 degree rotation
		bkp = this.rotateAntiClockWise(bkp);
		System.out.println("Match in 180deg anti-clock wise : "+this.compare(bkp, b));
		
		//Anti-Clock wise 270 degree rotation
		bkp = this.rotateAntiClockWise(bkp);
		System.out.println("Match in 270deg anti-clock wise : "+this.compare(bkp, b));
		
		MirrorArray ma=new MirrorArray();
		int [][] testArray={{0,1,2},{3,4,5},{6,7,8}};
		
		bkp = ma.horizantalMirrorArray(testArray);
		this.printArray(bkp);
		
		bkp = ma.verticalMirrorArray(testArray);
		this.printArray(bkp);

	}
	
	public int[][] rotateClockWise(int[][] bkp){
		int[][] temp=new int[a.length][a[0].length];
		int[][] a=bkp;
		//System.out.println("Clock wise rotation");
		int row=0;
		int col=0;
		for(int j=0;j<a[0].length;j++){
		for(int i=a.length-1;i>=0;i--){
				//System.out.print(a[i][j]+" ");
				//System.out.print("["+i+","+j+"]");
				temp[row][col]=a[i][j];
				col++;
			}
			col=0;
			row++;
			//System.out.println(" ");
		}
		
		return temp;
	}
	
	
	public int[][] rotateAntiClockWise(int[][] bkp){
		int[][] temp=new int[a.length][a[0].length];
		int[][] a=bkp;
		int row=0,col=0;
		//System.out.println("Anti-Clock wise rotation");
		for(int i=a[0].length-1;i>=0;i--){
		for(int j=0;j<a.length;j++){
				//System.out.print(a[j][i]+" ");
				//System.out.print("["+j+","+i+"]");
				temp[row][col]=a[j][i];
				col++;
			}
			col=0;
			row++;
			//System.out.println(" ");
		}
		
		return temp;
	}
	
	public void printArray(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	
	public boolean compare(int[][] a1,int[][] a2){
		boolean flag=false;
		int matchCount=0;
		for(int i=0;i<a1.length;i++){
			for(int j=0;j<a1[0].length;j++){
				if(a1[i][j] == a2[i][j]){
					matchCount++;
				}
			}
		}
		
		if(matchCount == (a1.length * a1[0].length)){
			flag=true;
		}
		return flag;
	}
	
	
	class MirrorArray{
		
		public int[][] horizantalMirrorArray(int[][] a){
			int[][] temp=new int[a.length][a[0].length];
			int row=0,col=0;
			for(int i=a.length-1;i>=0l;i--){
				for(int j=0;j<a[0].length;j++){
					//System.out.print(a[i][j]+" ");
					//System.out.print("["+i+","+j+"]");
					temp[row][col]=a[i][j];
					col++;
				}
				//System.out.println(" ");
				col=0;
				row++;
			}
			return temp;
		}
		
		public int[][] verticalMirrorArray(int[][] a){
			int[][] temp=new int[a.length][a[0].length];
			int row=0,col=0;
			for(int i=0;i<a.length;i++){
				for(int j=a[0].length-1;j>=0;j--){
					//System.out.print(a[i][j]+" ");
					//System.out.print("["+i+","+j+"]");
					temp[row][col]=a[i][j];
					col++;
				}
				//System.out.println(" ");
				col=0;
				row++;
			}
			return temp;
		}
	}
}
