class Mythread implements Runnable
{
	String str;
	Mythread(String str)
	{
	   this.str=str;
	}

	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(str+":"+i);
			try
			{
			   Thread.sleep(2000);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
	}
}
class TheatreThreads
{
	public static void main(String args[])
	{
	Mythread obj1=new Mythread("issue ticket");
	Mythread obj2=new Mythread("verify ticket");
	Mythread obj3=new Mythread("allocate ticket");
	
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		Thread t3=new Thread(obj3);

		t1.start();
		t2.start();
		t3.start();
	}
}
 	