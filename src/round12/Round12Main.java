package round12;

public class Round12Main {

	public static void main(String[] args){
		
		SquaresBetweenNumbers sq=new SquaresBetweenNumbers(9, 122);
		//sq.findSquares();
		
		int[] a={5,2,8,7,4,3,9};
		AlternativeSortAnUnsortedArray asaa=new AlternativeSortAnUnsortedArray(a);
		//asaa.sort();
		
		int[] b={5,8,10,13,6,2};
		ThresholdOfFormingElementsInArray tfa=new ThresholdOfFormingElementsInArray(b,3);
		//tfa.printThreshold();
		
		RotateAndCompareArray r=new RotateAndCompareArray();
		//r.rotateLogic();
		
		PrintPattern pp=new PrintPattern(6);
		//pp.printPattern();
		
		int[][] c={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		int[][] d={
				{10,11},
				{14,15}
		};
		
		FindMatrixInMatrix fm=new FindMatrixInMatrix(c, d);
		fm.rotateAndCheck();
	}
}
