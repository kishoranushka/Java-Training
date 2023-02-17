import java.util.Scanner;
class array
{
public static void main(String arg[])
{
     int n;
     
System.out.println("enter the size of the array: ");

     Scanner sc= new Scanner(System.in);
n=sc.nextInt();
 int ary[]= new int[n];
  int i;
System.out.println("Enter the elements of array: ");
for(i=0;i<n;i++)
{
    ary[i]=sc.nextInt();


}
System.out.println("Even numbers in the array are: ");
for(i=0;i<n;i++)
{
   if(ary[i]%2==0)
{System.out.println(ary[i]);
}

    
}
}
}
