class Sample
{
private int a;//instance
public Sample()//constructor
{
System.out.println("i am default constructor");
}
public Sample(int a)
{
this.a=a;
System.out.println("constructor output"+a);
}
public void disp()
{
System.out.println("disp methos output"+a);
}
class constDemo
{
public static void main(String args[])
{
Sample S=new Sample();
S.disp();
}
} 
}