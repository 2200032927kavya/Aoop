import java.util.*;
 class student
{
   private int sno;
           String sname;
           int sm1;
int sm2;
int sm3;
int tot;
           float avg;
   public void input()
{
     Scanner sc=new Scanner(System.in);
             System.out.println("enter student no");
             sno=sc.nextInt();
            System.out.println("enter student name");
             sname=sc.next();
            System.out.println("enter student marks");
            sm1=sc.nextInt();
            System.out.println("enter student marks");
            sm2=sc.nextInt();
             System.out.println("enter student marks");
            sm3=sc.nextInt();
            tot=sm1+sm2+sm3;
            avg=tot/3;
 }
   void output()
  {
       System.out.println(" student number is"+sno);

       System.out.println(" student name is"+sname); 

       System.out.println(" student marks"+sm1);

       System.out.println(" student marks"+sm2);

       System.out.println(" student marks"+sm3);

       System.out.println("total is"+tot);

       System.out.println("average is"+avg);
}
}

class demostudent
{
  public static void main(String args[])
       {
          student ravi=new student();
          ravi.input();
          ravi.output();
       }  
}
    







