import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
int p,temp,r,sum=0;
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
p=sc.nextInt();
temp=p;
while(p>0)
{
r=p%10;
sum=(sum*10)+r;
p=p/10;
}
if(temp==sum)
{
System.out.println("palindrome no");
}
else
{
System.out.println("not palindrome");
}
}
}
