class SingleObject
{
private static SingleObject instance =new  SingleObject();
private  SingleObject()
{
}
public static  SingleObject getInstance;
{
return Instance;
}
public void showMessage()
{
System.out.println("Hello Singleton");
}
class SinglepatternDemo
{
public static void main(String args[])
{
SingleObject obj= SingleObject.getInstance();
obj.showMessage()


