interface Shape 
{
void draw();
}
    class Circle implements Shape
{
public void draw()
{
System.out.println("inside Circle draw method");
}
}
    class Square implements Shape
{
public void draw()
{
System.out.println("inside Square draw method");
}
}
    class Rectangle implements Shape
{
public void draw()
{
System.out.println("inside Rectangle draw method");
}
}
   public ShapeFactory
 {
public Shape getShape(String shapeType)
{
	if(shapeType==null)
	{
		return null;
	}
	if(shapeType.equalsIgnoreCase("RECTANGLE"))
	{
		return new Rectangle();
	}
	if(shapeType.equalsIgnoreCase("SQUARE"))
	{
		return new Rectangle();
	}
	if(shapeType.equalsIgnoreCase("CIRCLE"))
	{
		return new Rectangle();
	}
	return null;
}
}
class FactoryPatternDemo
{
public static void main(String args[])
{
ShapeFactory sf=new ShapeFactory();
Shape s1=sf.getShape("Circle");
s1.draw();
Shape s2=sf.getShape("Square");
s2.draw();
Shape s3=sf.getShape("Rectangle");
s3.draw();
}
}

