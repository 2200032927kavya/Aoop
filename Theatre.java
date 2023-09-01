class Mythread extends Thread 
{
	public void run()
	{
	 task1();
	 task2();
	 task3();
	}
         void task1()
	  {
		System.out.println("issue ticket");
	   }
          void task2()
	{
		System.out.println("verify ticket");
	}
	  void task3()
	{
		System.out.println("allocate seats");
	}
}
class Theatre
{
	public static void main (String args[])
	{
		Mythread obj=new Mythread();
		Thread t=new Thread(obj);
		t.start();
	}
}


