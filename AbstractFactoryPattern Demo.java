
interface Shape
{
public void draw();
}
  class Square implements Shape
    {
   public void draw()
  {
    System.out.println("inside square class draw method");
  }
     }
class Rectangle implements Shape
  {
    public void draw()
{
  System.out.println("inside rectangle class draw method");
} 
   }
class RoundedSquare implements Shape
{
public void draw()
{
System.out.println("inside Rounded square class draw method");
}
}
class RoundedRectangle implements Shape
{
 public void draw()
{
System.out.println("inside Rounded rectangle class draw method");
}
}


abstract class AbstractFactory
{
abstract Shape getShape(String shapeType);
}

class ShapeFactory extends AbstractFactory
{
public Shape getShape(String shapeType)

{
if(shapeType.equalsIgnoreCase("SQUARE"))
return new Square();

else if (shapeType.equalsIgnoreCase("RECTANGLE"))
return new Rectangle();
return null;
}
}

class RoundedShapeFactory extends AbstractFactory
{
public Shape getShape(String shapeType)
{

if(shapeType.equalsIgnoreCase("SQUARE"))
return new RoundedSquare();
else if(shapeType.equalsIgnoreCase("RECTANGLE"))
return new RoundedRectangle();
return null;
}
}
class Factoryproducer
{
public static AbstractFactory getFactory(boolean b)
{
if(b)
{
return new RoundedShapeFactory();
}
else
{
return new ShapeFactory();
}
}
}

     class AbstractFactoryPatternDemo
{
public static void main(String args[])
{
AbstractFactory af=Factoryproducer.getFactory(false);
Shape s1=af.getShape("Rectangle");
s1.draw();
Shape s2=af.getShape("Square");
s2.draw();
AbstractFactory af1=Factoryproducer.getFactory(false);                                  
Shape s3=af1.getShape("Rectangle");
s3.draw();
Shape s4=af1.getShape("Square");
s4.draw();
}
}



  
