// complete the code to find the swapping of two numbers
import java.util.Scanner;
class Swap_Example
{
	int e1,e2;
	
	void getdata()
	{
		System.out.println("Enter any two number to swap: ");
		Scanner sc=new Scanner(System.in);
   e1=sc.nextInt();
   e2=sc.nextInt();
   System.out.println("Before swap, The numbers are: " +e1+" "+e2);
	}
   
}

public class MainMethod extends Swap_Example
{
	public void swap()
	{
     int temp=e1;
     e1=e2;
     e2=temp;
	}

 public static void main(String arg[])
   {
     MainMethod s1= new MainMethod();
	 s1.getdata();
	 s1.swap();
   
    System.out.println("after swap, The numbers are: "+s1.e1+" "+s1.e2);

   } 
}