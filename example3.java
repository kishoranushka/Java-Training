import java.util.Scanner;
class example3
{
    public static void main(String arg[])
{
    int a,b,c;
    System.out.println("Enter any three number: ");
     Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
if(a>b && a>c)
{
System.out.println(a+" is the greatest");
}
else if(b>a && b>c)
{
System.out.println(b+" is the greatest");
}
else
{
System.out.println(c+" is the greatest");
}
}
}