// Bank scenario

class Bank_inheritence
	{
		public static void main(String arg[])
		{
		Bank obj1=new SBI();
		System.out.println(ob1.getRateOfInterest());

		Bank obj2=new ICICI();
		System.out.println(ob1.getRateOfInterest());

		Bank obj3=new AXIS ();
		System.out.println(ob1.getRateOfInterest());
		

		}
	}

class Bank
 	{
		float getRateOfInterest()
		{
			
		}
	
	}
class SBI extends Bank
 	{
		float getRateOfInterest()
		{
		return(8.4);	
		}
}

class ICICI extends Bank
 	{
		float getRateOfInterest()
		{
			return( 7.3);
		}
}

class AXIS extends Bank
 	{
		float getRateOfInterest()
		{
			return( 9.7);
		}
}