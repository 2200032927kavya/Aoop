interface Father
{
const float ht=5.5f;
void height();
}
interface Mother
{
const float ht=5.0f;
void height();
}
class Child implements Father,Mother
{
float ht;
void height()
{
ht=Mother.ht+Father.ht/2;
System.out.println("the child height is"+ht);
}
}
class Demo1
{
Public static void main(String args[])
{
Child.c=new Child();
c.height();
}
}
