package round3;

public class RecursionReverseString {

	String s=" I love india",op="";
	int length=s.length()-1;
	int end=length+1;
	boolean endFlag=true;
	
	public void print()
	{
		System.out.println(recursion(s));
		
	}
	public String recursion(String s)
	{
		if(length==0){
			return op;
		}
		else{
			if((int)s.charAt(length) == 32){
				System.out.println("Start : "+length+" End : "+end +" Str : "+s.substring(length+1,end));
				endFlag=false;
				op=op.concat(s.substring(length,end));
				if(endFlag==false){end=length; endFlag=true;}
				length-=1;
				return recursion(s);	
			}
			else if(length==1){
				System.out.println("Start : "+length+" End : "+end +" tr : "+s.substring(length-1,end));
				op=op.concat(" ").concat(s.substring(length-1,end));
				length-=1;
				return recursion(s);
			}
			else{
				length-=1;
				return recursion(s);
			}
		}
		
	}
}
