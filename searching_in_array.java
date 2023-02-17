import java.util.Scanner;
class searching_in_array
{
     public static void main(String arg[])
{   
       int n ,i;
int flag=0;
      System.out.println("Enter the size of array: ");
      Scanner sc= new Scanner(System.in);
     n=sc.nextInt();
    
      int ary[]=new int[n];
System.out.println("Enter the elements of array: ");
       for(i=0;i<n;i++)
{
         ary[i]=sc.nextInt();     

}
System.out.println("Enter the element to search: ");
int a=sc.nextInt();

for(i=0;i<n;i++)
{
if(ary[i]==a)
{
flag++;
break;
}


}
if(flag==1)
{
System.out.println(a+ "is at "+(i+1)+"th position");
}
       
}
}