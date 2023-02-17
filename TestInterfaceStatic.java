interface Drawable
{
	void draw();
	static int msg()
	{
		System.out.println("default method.");
		return 1;
	}
}
class rectangle implements Drawable
{
	static void draw()
	{
	     System.out.println("drawing rectangle");
	}
}

class TestInterfaceStatic
{
	public static void main(String args[])
{
 	Drawable d = new rectangle();
	d.draw();
	System.out.println("Static Method"+Drawable.msg());
}
}