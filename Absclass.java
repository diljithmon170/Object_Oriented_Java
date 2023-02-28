import java.util.*;
abstract class shape
{
    abstract void no_of_sides();
}
class rect extends shape
{
    void no_of_sides()
    {
        System.out.println("rect has 4 sides");
    }
}
class tri extends shape
{
    void no_of_sides()
    {
        System.out.println("tri has 3 sides");
    }
}
class pent extends shape
{
    void no_of_sides()
    {
        System.out.println("pent has 5 sides");
    }
}
class Absclass
{
    public static void main(String args[])
    {
        rect r1=new rect();
        tri t1=new tri();
        pent p1=new pent();
        r1.no_of_sides();
        t1.no_of_sides();
        p1.no_of_sides();
    }
}