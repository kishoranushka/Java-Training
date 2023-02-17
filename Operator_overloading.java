// wap in java to implement operator overloading

class Operator_overloading
	{
		void add(int a,int b)
		{
			int sum= a+b;
		System.out.println("Sum of two numbers are: "+(a+b));	
		}

		void add(String s1, String s2)
		{
			String con_str=s1+s2;
		System.out.println("Your name is: "+(s1+s2));
		}
	

public static void main(String arg[])
	{
		Operator_overloading A=new Operator_overloading();
		
		A.add(3,4);
		A.add("Anushka","Kishor");
	}

}