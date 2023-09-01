class Sample extends Thread
{
	public void run()
	{
	for(int i=0;i<100;i++)
	{
	System.out.println(i);
	}
	}
}
class SampleDemoThreads
{
	public static void main(String args[])
	{
	Sample obj= new Sample();
	Thread t=new Thread(obj);
	t.start();
	}
}