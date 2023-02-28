import java.util.*;
public class Fib
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    n=n+1;
    int a=1,b=0,i=2,c=0;
        while(i<=n)
        {
            System.out.print(c+" ");
            c=a+b;
            a=b;
            b=c;
            i++;
        }
    }
}