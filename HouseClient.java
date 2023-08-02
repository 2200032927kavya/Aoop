abstract class HouseTemplate
{
      public final void buildHouse()
{
      buildFoundation();
       buildPillars();
       buildWalls();
       buildWindows();
}


public void buildFoundation()
{
 System.out.println("building foundation with concrete cement and sand);
}
  public void buildWindows()
  {
  System.out.println("glass windows");
  }


 {
public abstract void buildPillars();
public abstract void buildWalls();
public abstract void buildWindows();
}


class WoodenHouse extends  HouseTemplate
   {
     public void buildPillars()
   {
      System.out.println("Building WoodenPillars");
   }
       public void buildWalls()
   {
       System.out.println("Building WoodenWalls");
   }
      public void buildWindows()
   {
       System.out.println("Building WoodenWindows");
   }
   }


class GlassHouse extends HouseTemplate
{
  public void buildPillars()
  {
   System.out.println("Building GlassPillars");
  }
  public void buildWalls()
  {
  System.out.println("Building GlassWalls");
  }
  public void buildWindows()
  {
   System.out.println("Building GlassWindows");
  }
}

class HouseClient
{
  public static void main(String args[])
  {
   HouseTemplate ht=new WoodenHouse();
   System.out.println("WoodenHouse");
   ht.buildHouse();
  }
}
System.out.println("GlassHouse");
 ht=new GlassHouse();
 ht.buildHouse();
}
}


   


