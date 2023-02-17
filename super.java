//super keyword in java

class parent
{
    String color="white";
}

class child extends parent
{
    String color="Red";
	void printcolor()
	{
		System.out.println("Color of child class : "+color);
		System.out.println("Color of parent class : "+super.color);
	}
}

class SuperMain
{
	public static void main(String arg[])
	{
		child C1= new child();
	c1.printcolor();
	}
	
}