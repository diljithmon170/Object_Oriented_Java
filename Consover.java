import java.util.*;
class perimeter
{
    void perimeter(double r)
    {
        System.out.println("The perimeter of a circle is: "+3.14*r*r);
    }
    void perimeter(double l,double b)
    {
        System.out.println("The perimeter of a rectangle is: "+2*(l+b));
    }
}
public class Consover
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius of the circle: ");
        int r=sc.nextInt();
        System.out.println("Enter the Length and Bredth of the Rectangle: ");
        int l,b;
        l=sc.nextInt();
        b=sc.nextInt();
        perimeter p1=new perimeter();
        System.out.println("enter the no");
        int n=sc.nextInt();
        int i;
        for(i=0;i<n;i++)
        {
        p1.perimeter(r);
        p1.perimeter(l,b);
        }
    }
}