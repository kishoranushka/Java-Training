class student
{
    int roll;
    String name;
    static String college="SISTec";
    student(int r, String n)
    {
      roll=r;
      name= n;
    }
    void display()
    {
	System.out.println("roll: "+roll+" name: "+name+" college: "+college);
    }

}

public class StaticVariableExample
{
	public static void main(String arg[])
	{
		student s1=new student(11,"Anushka");
		student s2=new student(12,"Abhinav");
		s1.display();
		s2.display();
	}
}