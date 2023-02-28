import java.util.*;
class laptop
{
    public void laptop()
    {
    System.out.println("laptop");
    String fea="portable";
    System.out.println(fea);
    }
}
class acer extends laptop
{
    public void acer()
    {
    System.out.println("acer");
    int price;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the price of acer");
    price=sc.nextInt();
    laptop();
    }
}
class nitro extends acer
{
    public void nitro()
    {
        System.out.println("nitro");
        System.out.println("Enter the price of nitro");
        Scanner sc=new Scanner(System.in);
        int p;
        p=sc.nextInt();
        acer();
    }
}
public class Inheritlap
{
    public static void main(String args[])
    {
       System.out.println("inherit_laptop");
       nitro lp=new nitro();
       lp.nitro(); 
    }
    
}