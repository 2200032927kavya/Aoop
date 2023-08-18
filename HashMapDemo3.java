import java.util.*;
import java.util.HashMap;

class HashMapDemo3
	{
	public static void main(String args[])
	{
	HashMap<String,Long>hm=new HashMap<String,Long>();
	String name;
	long phno;
	Scanner sc=new Scanner(System.in);

	while(true)
	{
	System.out.println("1.enter phone key value pairs");
	System.out.println("2.retrive values from keys");
	System.out.println("3.display all keys");
	System.out.println("4.exit");
	System.out.println("enter ur choice");
	int choice=sc.nextInt();



	switch(choice)
	{
	case 1:
	System.out.println("enter name");
	name=sc.next();
	System.out.println("enter phno");
	phno=sc.nextLong();
	hm.put(name,phno);
	break;


	case 2:
	System.out.println("enter name");
	name=sc.next();
	phno=hm.get(name);
	System.out.println("phno="+phno);
	break;


	case 3:
	Set<String>set=new HashSet<String>();
	set=hm.keySet();
	System.out.println(set);
	break;
	default:return;
	}
	}
	}
}




	