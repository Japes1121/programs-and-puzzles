package round2;

public class RemoveUnbalancedParantheses {
	private String expr;
	private StringBuilder sb=new StringBuilder();
	public RemoveUnbalancedParantheses(String str){
		expr=str;
	}
	
	public StringBuilder removeUnbalancedBrackets(){
		int balance=0;
		for(int i=0;i<expr.length();i++){
			//40 is for left open bracket (
			if((int)expr.charAt(i)==40){
				balance+=1;
			}
			//41 is for left open bracket )
			else if((int)expr.charAt(i)==41){
				balance-=1;
			}
			else{
				
			}
			
		}
		
		System.out.println("Balance : "+balance);
		
		return sb;
	}
}
