class Reserve extends Thread
{
	int available=1;
	int wanted;
	public Reserve (int i)
	{
		wanted=i;
	}
		public synchronized void run()
		{
			
			System.out.println("available berths are"+available);
			
				if(available>=wanted)
				{
					String name=Thread.currentThread().getName();
					System.out.println(wanted+"berths reserved for"+name);
					
					try
					{
						Thread.sleep(1500);
						available=available-wanted;
						System.out.println("available berths are"+available);
					}
					catch(InterruptedException ie)
					{
						ie.printStackTrace();
					}
				}
		

				else
					System.out.println("no berths");
		}
			
}

class SynchronizedMethod
{
	public  static void main(String args[])
	{
		Reserve obj=new Reserve(1);
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);

		t1.setName("Firstperson");
		t2.setName("Secondperson");
		t3.setName("Thirdperson");

			t1.start();
			t2.start();
			t3.start();
	}
}