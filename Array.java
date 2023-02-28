import java.util.*;
public class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values into the arrays ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.println("The arrays are: ");
        for(int i=0;i<n;i++)
        {
           System.out.print(a[i]+" ");

        }
    }
}