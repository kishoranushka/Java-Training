class FinallyBlock 
{
	public static void main(String[] args) 
	{
		int a=10;
	try
		{
			System.out.println(a/0);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
	finally
		{
System.out.println("finally block executed");
	}
		
	}
}
