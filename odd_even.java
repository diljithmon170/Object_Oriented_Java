import java.util.*;
class odd extends Thread
{
    public void run()
    {
    System.out.println("odd numbers\n");
    for(int i=1;i<101;i++)
    {
        if(i%2!=0)
        {
            System.out.print(i+" ");
        }
    }
    }
}
class even extends Thread
{
    public void run()
    {
    System.out.println("\n even numbers\n");
    for(int i=1;i<101;i++)
    {
        if(i%2==0)
        {
            System.out.print(i+" ");
        }
    }
    }
}
class odd_even
{
    public static void main(String args[])
    {

        odd od=new odd();
        even ev=new even();
        try{
        od.start();
        od.join();
        ev.start();
        }
        catch(Exception e)
        {
            System.out.println("catch the exceptions ");
        }
    }
}