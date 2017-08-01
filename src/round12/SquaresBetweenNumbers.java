package round12;
/*
1.Given two numbers a and b both < 200 we have to find the square numbers which lie between a and b(inclusive)

eg) i/p a = 20;b = 100;
      o/p 25,36,49,64,81,100 
      
*/
public class SquaresBetweenNumbers {
	int a,b,squaresCount=0;
	public SquaresBetweenNumbers(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	public void findSquares(){
		/*
		 * Find min value if input is 9 it will return 3 if input is 10 it will return 4  
		 * System.out.println(Math.ceil(Math.sqrt(a)));
		 * Find max value if input is 100 it will return 10 if input is 99 it will return 9
		 * System.out.println(Math.floor(Math.sqrt(b)));
		 * 
		 */
		
		
		for(int i=(int)Math.ceil(Math.sqrt(a));i<=(int)Math.floor(Math.sqrt(b));i++){
			System.out.printf("Square of %d is %d",i,i*i);
			System.out.println("");
			squaresCount++;
		}
		
		System.out.printf("%d squares are between %d and %d ", squaresCount,a,b);
		
	}

}
