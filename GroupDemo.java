import java.util.*;
   class Employee
	{
  	    int id;
   	    String name;
    public Employee (int i, String n)
        {
           id=i;
	   name=n;
         }


    public void displayData()
       {
          System.out.println(id+"\t"+name);
       }
       }


class GroupDemo
    {
  public static void main(String args[])
    {
   Scanner sc=new Scanner(System.in);
   Employee arr[]=new Employee[5];
   for(int i=0;i<5;i++)
   {
   System.out.println("enter id");
      int j=sc.nextInt();
   System.out.println("enter name");
     String n=sc.next();
   arr[i]=new Employee (j,n);
   }
       
System.out.println("the employerecords are");
 for(int i=0;i<arr.length;i++)
 {
 arr[i].displayData();
}
}
}