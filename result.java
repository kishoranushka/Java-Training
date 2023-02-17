import java.util.Scanner;
class student
{
  	int roll;
	String name;
	void show()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		name=sc.next();
		System.out.println("Enter your roll no.: ");
		roll=sc.nextInt();
	}
}
class exam extends student
{
	int phy;
	int chem;
	int maths;
	int bio;
	int computer;
	int sst;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks of phy: ");
		phy=sc.nextInt();
		System.out.println("enter the marks of chem: ");
		chem=sc.nextInt();
		System.out.println("enter the marks of maths: ");
		maths=sc.nextInt();
		System.out.println("enter the marks of bio: ");
		bio=sc.nextInt();
		System.out.println("enter the marks of computer: ");
		computer=sc.nextInt();
		System.out.println("enter the marks of sst: ");
		sst=sc.nextInt();
	}
	int getMarks()
	{
		return phy+chem+bio+computer+sst;
	}
}

class result extends exam
{
	int total_marks;
	
	void display()
	{	exam e = new exam();
		total_marks= phy+chem+maths+bio+computer+sst;
	  	System.out.println("name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("Total marks: "+total_marks);
	}

	public static void main(String arg[])
	{
		result obj=new result();
		obj.show();
		obj.getdata();
           		obj.display();
	}
	
}