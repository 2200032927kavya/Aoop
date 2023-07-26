interface I
{
abstract void m1();
}
class A implements I
{
void m1()
{
System.out.println("Inside A class m1 method");
}
}
class B implements I
{
void m1()
{
System.out.println("Inside B class m1 method");
}
}
class C implements I 
{
void m1()
{
System.out.println("Inside C class m1 method");
}
}
class Demo3
{
public static void main (String args[])
{
I obj=new A();
obj.m1();

obj=new B();
obj.m1();

obj=new C();
obj.m1();
}
}
