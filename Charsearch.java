import java.util.*;
public class Charsearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        System.out.println("enter the character to search: ");
        char x=sc.nextLine().charAt(0);
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==x)
            {
                count=1;
            }
        }
        if(count==1)
        {
            System.out.println("the character is presented in the string");
        }
        else
        {
            System.out.println("not in the string");
        }
    }
}