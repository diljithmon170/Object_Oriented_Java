import java.util.*;
public class Freq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        System.out.println("enter the char to find the frequency");
        char x=sc.nextLine().charAt(0);
        int i,count=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==x)
            {
                count=count+1;
            }
        }
        if(count>0)
        {
            System.out.println("The "+x+" is repeating "+count+" times");
        }
        else
        {
            System.out.println("not in the string");
        }
    }
}