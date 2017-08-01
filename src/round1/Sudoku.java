package round1;

import java.util.ArrayList;
import java.util.List;

public class Sudoku {
	
	int[][] sudoku={
			 {5,3,4,6,7,8,9,1,2},
             {6,7,2,1,9,5,3,4,8},
             {1,9,8,3,4,2,5,6,7},
             {8,5,9,7,6,1,4,2,3},
             {4,2,6,8,5,3,7,9,1},
             {7,1,3,9,2,4,8,5,6},
             {9,6,1,5,3,7,2,8,4},
             {2,8,7,4,1,9,6,3,5},
             {3,4,5,2,8,6,1,7,9}
	};
	
	ArrayList<Integer> row=new ArrayList<>();
	ArrayList<Integer> col=new ArrayList<>();
	ArrayList<Integer> square=new ArrayList<>();
	public boolean checkSudoku()
	{
		boolean isValid=true;
		
		//Rows and Columns
		for(int i=0;i<sudoku.length;i++){
			for(int j=0;j<sudoku[0].length;j++){
				if(row.contains(sudoku[i][j]) || sudoku[i][j] > 9 || sudoku[i][j] < 0){isValid=false;}
				row.add(sudoku[i][j]);
				
				if(col.contains(sudoku[j][i]) || sudoku[j][i] > 9 || sudoku[j][i] < 0){isValid=false;}
				col.add(sudoku[j][i]);
				
				if(square.contains(sudoku[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3]) || 
						sudoku[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3] > 9 ||
						sudoku[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3] < 0){isValid=false;}
				square.add(sudoku[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3]);
				
				//System.out.print(((i / 3) * 3 + j / 3) + " , "+(i * 3 % 9 + j % 3));
			}
			//System.out.println(" ");
			row.clear();
			col.clear();
			square.clear();
		}
		
		/*//Squares
		int r=0,c=0;
		while(r<sudoku.length){
			while(c<sudoku[0].length){
				for(int i=r;i<r+3;i++){
					for(int j=c;j<c+3;j++){
						if(square.contains(sudoku[i][j])){
							isValid=false;
						}
					}
				}
				square.clear();
				c=c+3;
			}
			c=0;
			r=r+3;
		}*/

		return isValid;
	}
	
	public boolean checkSudokuStatus() {
	    for (int i = 0; i < 9; i++) {

	        int[] row = new int[9];
	        int[] square = new int[9];
	        int[] column = sudoku[i].clone();

	        for (int j = 0; j < 9; j ++) {
	            row[j] = sudoku[j][i];
	            square[j] = sudoku[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3];
	            System.out.println(((i / 3) * 3 + j / 3) + " , "+(i * 3 % 9 + j % 3));
	        }
	       // if (!(validate(column) && validate(row) && validate(square)))
	         //   return false;
	    }
	    return true;
	}

}
