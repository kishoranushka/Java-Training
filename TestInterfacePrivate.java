interface Temp1
{
	void draw();
	default void show()
	{
		System.out.println("Default Method");
		msg();
	}
	private void msg()
	{
		System.out.println("private method");
	}
}

class temp2 implements Temp1
{
	public void draw()
	{
		System.out.println("default method");
	}
}

class TestInterfacePrivate
{
		public static void main(String arg[])
		{
			Temp1 T= new temp2();
			T.draw();
			T.show();
			//T.msg();
		}
}