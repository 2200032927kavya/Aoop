interface Father
{
const floatht=5.5f;
void height();
}
interface Mother
{
const floatht=5.0f;
void height()
}
class Child implements Father,Mother
{
float ht;
void height()
{
ht=Motherht+Fatherht/2;
System.out.println("the child height is"+ht);
}
}
class DemoFather
{
public static void main(String args[])
{
Child.c=new Child();
c.height();
}
}
