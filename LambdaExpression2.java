import java.util.*;
class LambdaExpression2
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> A= new ArrayList<Integer>();
		A.add(10);
			A.add(20);
			A.add(30);
			A.add(40);
			System.out.println(A);

			A.forEach((g)->{
				System.out.println((g*10)+" ");
			});
				
	}
}
