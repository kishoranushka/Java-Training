//super keyword in java

class parent
{
    String color="white";
	void display()
	{
		System.out.println("You are beautiful.");
	}
}

class child extends parent
{
    String color="Red";
	void printcolor()
	{
		System.out.println("Color of child class : "+color);
		System.out.println("Color of parent class : "+super.color);
	super.display();
	}
}

class SuperMain
{
	public static void main(String arg[])
	{
		child c1= new child();
	c1.printcolor();
	
	}
	
}

