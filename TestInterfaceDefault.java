interface Drawable
{
	void draw();
	default void msg()
	{
		System.out.println("default method.");
	
	}
}
class rectangle implements Drawable
{
	public void draw()
	{
	     System.out.println("drawing rectangle");
	}
}

class TestInterfaceDefault
{
	public static void main(String args[])
{
 	Drawable d = new rectangle();
	d.draw();
	d.msg();
}
}