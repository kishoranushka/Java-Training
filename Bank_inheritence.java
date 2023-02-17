// Bank scenario

class Bank_inheritence
	{
		public static void main(String arg[])
		{
		Bank obj1=new SBI();
		System.out.println(obj1.getRateOfInterest());

		Bank obj2=new ICICI();
		System.out.println(obj2.getRateOfInterest());

		Bank obj3=new AXIS ();
		System.out.println(obj3.getRateOfInterest());
		

		}
	}

class Bank
 	{
		double getRateOfInterest()
		{
		return 1;	
		}
	
	}
class SBI extends Bank
 	{
		double getRateOfInterest()
		{
		return 8.4;	
		}
}

class ICICI extends Bank
 	{
		double getRateOfInterest()
		{
			return 7.3;
		}
}

class AXIS extends Bank
 	{
		double getRateOfInterest()
		{
			return 9.7;
		}
}