class Display
{
public synchronized void wish(String name)
{
for(int i=0;i<10;i++)
{
System.out.println("Good Morning:");
try
{
Thread.sleep(500);
}
catch(InterruptedException e)
{}
System.out.println(name);
}
}
}
class MyThread extends Thread
{
Display d;
String name;
MyThread(Display d, String name)
{
this.d=d;
this.name=name;
}
public void run()
{
d.wish(name);
}
}
public class SynchronizedDemo1
{
public static void main(String[] args)
{
Display d = new Display();
MyThread t1=new MyThread(d,"dhoni");
//MyThread t2=new MyThread(d,"yuvaraj");
t1.start();
//t2.start();
}
}