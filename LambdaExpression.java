import java.util.*;
class LambdaExpression 
{
	public static void main(String[] args) 
	{
		ArrayList<String> A= new ArrayList<String>();
		A.add("I");
			A.add("am");
			A.add("going to");
			A.add("NewYork.");
			System.out.println(A);

			A.forEach((g)->
				System.out.println(g+" "));
				
	}
}
