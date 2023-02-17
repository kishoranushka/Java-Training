class parent 
{
   parent()
   {
   System.out.println("parent class constructor called");
   }
}

class child extends parent
{
   child()
   {
   super();
   {
System.out.println("child class constructor called");
   }
   }
}

class SuperMain2
{
	public static void main(String arg[]){
		 child c1= new child();
	}
 

}