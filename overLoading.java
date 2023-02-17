class overLoading
{
	void add(int a,int b)
	{
		System.out.println("sum= "+(a+b));
	}
	
	void add(double a, double b)
	{
		System.out.println("sum= "+(a+b));
	}
   public static void main(String arg[])
	{
		overLoading A=new overLoading();
		A.add(3,4);
		A.add(3.14, 4.12);
	}
}