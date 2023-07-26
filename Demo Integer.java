class Base
{
private int a=10;
public void disp()
{
System.out.println("the base value is"+a);
}
}
class Derived extends Base
{
private int b=20;
public void display()
{
System.out.println("the derived value is"+b);
}
}
class Demo Integer
{
public.static.void main(String args[])
{
Derived d=new derived();
d.display();
d.disp();
}
}