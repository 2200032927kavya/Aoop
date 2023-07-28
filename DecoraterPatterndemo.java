interface Shape

{
public void draw();
}

class Circle implements Shape
{
   public void draw()
 {
   System.out.println("Shape Circle");
 }
}
class Rectangle implements Shape
{
 public void draw()
   {
System.out.println("Shape Rectangle");
   }
 }



abstract class ShapeDecorator implements Shape
{
   Shape decoratorShape;
public ShapeDecorator(Shape decoratorShape)
{
this.decoratorShape=decoratorShape;
}
   public void draw()
{



   decoratorShape.draw();
}
}
class RedShapeDecorator extends ShapeDecorator
{
    public RedShapeDecorator(Shape decoratorShape)
    {
      super(decoratorShape);

     }
 public void draw()
  {


    decoratorShape.draw();
    setRedBorder(decoratorShape);
   }
private void setRedBorder(Shape decoratorShape)
{
System.out.println("Border color:RED");
}
}


class DecoraterPatterndemo
{
 public static void main(String args[])
  {
   Shape circle=new Circle();
    circle.draw();
   Shape rect=new Rectangle();
    rect.draw();
   Shape redRect = new RedShapeDecorator(new Rectangle());
     redRect.draw();
   Shape redCir = new RedShapeDecorator(new Circle());
     redCir.draw();
    }
}