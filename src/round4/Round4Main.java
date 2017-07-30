package round4;

public class Round4Main {

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
		r.rotateLogic();
	}
}
