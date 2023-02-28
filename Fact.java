import java.util.*;
public class Fact
{
    
    public static void main(String args[])
    {
        int n,i,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("the Factorial of "+n+"="+fact);
    }
}