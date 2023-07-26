abstract class Shape
{
public void calculate(int);
}
class square extends Shape
{
void calculate(int x)
{
System.out.println("x*x");
}
}

class Squareroot extends Shape
{
void calculate(int x)
{
System.out.println(Math.sqrt("x"));
}
}

class cube extends Shape
{
void calculate(int x)
{
System.out.println("x*x*x");
}
}
class DemoSquare
{
public static void main (string args[])
{
Square s=newSquare();
s.calculate(5);
Square root rt=newSquareroot();
rt.calculate(900);
Cube c=new cube();
c.calculate(5);
}
}
