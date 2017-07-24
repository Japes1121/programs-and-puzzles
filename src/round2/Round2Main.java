package round2;

public class Round2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberWeight nw=new NumberWeight();
		//nw.printNumbers();
		
		FindStringPatternInMatrix fs=new FindStringPatternInMatrix("WELCOMETOZOHOCORPORATION");
		//fs.searchIn2D("TOO");
		
		Sudoku s=new Sudoku();
		System.out.println(s.checkSudoku());
		//System.out.println(s.checkSudokuStatus());
	}

}
