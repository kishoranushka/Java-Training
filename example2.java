import java.util.Scanner;
class example2
{public static void main(String arg[])
{
   int a;
System.out.println("Enter any number: ");
Scanner sc=new Scanner(System.in);
a= sc.nextInt();
if(a%2==0)
{
System.out.println("Even");
}
else
{
System.out.println("Odd");
}

}
}