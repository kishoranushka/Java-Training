import java.util.Scanner;
class pattern3
{
    public static void main(String arg[])
{
       int i,j,n;
      System.out.println("enter any number: ");
      Scanner sc=new Scanner(System.in);
n=sc.nextInt();
 for(j=n;j>0;j--)
      
{
       for( i=n;i>0;i--)
{
      if(i>j)
{
     System.out.print(" ");
}
      else
{
      System.out.print("*"); 
}
}

System.out.println("\n");
}
}
}