class Current
{
   public static void main(String args[])
	{
		System.out.println("Current thread");
		Thread t= Thread.currentThread();
		System.out.println("Current thread is"+t);
		System.out.println("the name of thread is"+t.getName());
	}
}

