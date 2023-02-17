class Assignment2 
{
	static int count;
	int n;
	Assignment2()
	{
		count++;
		n=count;
		
	}
	void display()
	{
		System.out.println("This is object number: "+n);
	}
}
 class Assignment2Day4
 {
	 public static void main(String arg[])
	 {
		 Assignment2 A1= new Assignment2();
		 Assignment2 A2= new Assignment2();
		 Assignment2 A3= new Assignment2();
		 A1.display();
		  A2.display();
		 A3.display();
	 }
 }