
import java.util.Scanner;
class Leap
{
public static void main(String args[])
{
int y;
System.out.println("enter any year");
Scanner sc=new Scanner(System.in);
y=sc.nextInt();
if(y % 4==0)
{
if(y % 100==0)
{
if(y % 400==0)
System.out.print("it is a leap year");
else
System.out.println("it is not a leap year");
}
else
System.out.println("it is not a leap year");
}
else
System.out.println("it is not a leap year");
}
}
