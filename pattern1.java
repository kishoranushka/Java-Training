import java.util.Scanner;
class pattern1
{
    public static void main(String arg[])
{
       int i,j,n;
      System.out.println("enter any number: ");
      Scanner sc=new Scanner(System.in);
n=sc.nextInt();
       for( i=1;i<=n;i++)
{
       for(j=1;j<=i;j++)
{
            System.out.print("*");
}
System.out.println("\n");
}
}
}