import java.util.Scanner;
class YoungException extends RunTimeException
{
YoungException(String msg)
{
super(msg);
}
}
class Test2
{
public static void main(String[] args)
{
Scanner sc =new Scanner(
int age=Integer.ParseInt(args[0]);
if(age>60)
{
throw new YoungException("wait some years");
}
}
}
