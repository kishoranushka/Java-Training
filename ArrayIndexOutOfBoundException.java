class  ArrayIndexOutOfBoundException
{
	public static void main(String[] args) 
	{int ary[]=new int[5];
		try
		{
			
			ary[10]=40;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		ary[4]=9;
		
		System.out.println(ary[4]);
	}
}
