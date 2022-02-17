class Rectangle5 extends Shape5 
{
    public String draw() 
    {
        return "The Rectangle has been drawn : []";
    }
}
class Line5 extends Shape5
{
    public String draw() 
    {
        return "The line has been drawn : ______";
    }
}

class Cube5 extends Shape5 
{
    public String draw() 
    {
        return "The Cube has been drawn : ()";
    }
}
abstract class Shape5 
{
    abstract public String draw();
}
public class Assignment2Q5
{
    public static void main(String[] args) 
    {
    Rectangle5 R1 = new Rectangle5 ();
    Line5 L1 = new Line5 ();
    Cube5 C1 = new Cube5 ();
    System.out.println(R1.draw());
    System.out.println(L1.draw());
    System.out.println(C1.draw());
    }
}
