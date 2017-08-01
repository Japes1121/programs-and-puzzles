package round1;

public class FindStringPatternInMatrix {
	
	String str;
	int R,C;
	char[][] grid;
	
	public FindStringPatternInMatrix(String arrayString){
		this.str=arrayString;
		this.R=(this.str.length()/5)+1;
		this.C=5;
		this.grid=new char[R][C];
	}
	
	public void searchIn2D(String str)
	{
		this.populateArray();
		this.printArray();
		this.patternSearch(grid, str);
	}
	
	public void populateArray()
	{
		int len=str.length()-1;
		int charidx=0;
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++){
				grid[i][j]=str.charAt(charidx);
				charidx+=1;
				len-=1;
				if(len==0){break;}
			}
			if(len==0){break;}
		}
	}
	
	//  Searches given word in a given matrix in all 8 directions
	public void patternSearch(char grid[][], String word)
	{
	    // Consider every point as starting point and search
	    // given word
	    for (int row = 0; row < R; row++)
	       for (int col = 0; col < C; col++)
	          if (findInArray(grid, row, col, word)){
	        	  System.out.println("Pattern Found at : "+row+","+col);
	          }
	             
	}
	
	public boolean findInArray(char grid[][], int row, int col, String word){
		// For searching in all 8 direction
		int x[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int y[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
		    // If first character of word doesn't match with
		    // given starting point in grid.
		    if (grid[row][col] != word.charAt(0))
		      return false;
		 
		    int len = word.length();
		 
		    // Search word in all 8 directions starting from (row,col)
		    for (int dir = 0; dir < 8; dir++)
		    {
		        // Initialize starting point for current direction
		        int k, rd = row + x[dir], cd = col + y[dir];
		 
		        // First character is already checked, match remaining
		        // characters
		        for (k = 1; k < len; k++)
		        {
		            // If out of bound break
		            if (rd >= R || rd < 0 || cd >= C || cd < 0)
		                break;
		 
		            // If not matched,  break
		            if (grid[rd][cd] != word.charAt(k))
		                break;
		 
		            //  Moving in particular direction
		            rd += x[dir];
		            cd += y[dir];
		        }
		 
		        // If all character matched, then value of must
		        // be equal to length of word
		        if (k == len)
		            return true;
		    }
		    return false;
		}
		

	
	public void printArray()
	{
		for(int i=0;i<(str.length()/5)+1;i++){
			for(int j=0;j<5;j++){
			System.out.print(grid[i][j]+" ");	
			}
			System.out.println(" ");
		}
	}

}
