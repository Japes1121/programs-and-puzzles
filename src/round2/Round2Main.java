package round2;

public class Round2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={1, 2, 3, 4, 5, 6, 7};
		FirstMaxSecondMinArraySorting f=new FirstMaxSecondMinArraySorting(numbers);
		//f.printArray();
		
		String expr="((abc)((de))";
		RemoveUnbalancedParantheses r=new RemoveUnbalancedParantheses(expr);
		r.removeUnbalancedBrackets();
	}

}
