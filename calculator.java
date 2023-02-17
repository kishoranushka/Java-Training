import java.util.Scanner;
class calculator
{
public static void main(String arg[])
{
int a,b;
int op;
System.out.println("enter any two numbers: ");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();

System.out.println("Enter your choice:");
System.out.println("1)Add 2)Sub 3)Mul 4)Div");
op=sc.nextInt();

arthmetic ar=new arthmetic();
switch(op)
{
     case 1:
                  ar.Add(a,b);
                  break;
      case 2:
                  ar.Sub(a,b);
                  break;
      case 3:
                   ar.Mul(a,b);
                   break;
      case 4:
                   ar.Div(a,b);
                   break;

      default:
               System.out.println("invalid input");
}
} 
}

class arthmetic
{

void Add(int a, int b)
{
System.out.println("Addition of both the numbers is "+(a+b));
}


void Sub(int a, int b)
{
System.out.println("Substractionof both the numbers is "+(a-b));
}
void Mul(int a, int b)
{
System.out.println("Multiplication of both the numbers is "+(a*b));
}
void Div(int a, int b)
{
System.out.println("Division of both the numbers is "+(a/b));
}
}