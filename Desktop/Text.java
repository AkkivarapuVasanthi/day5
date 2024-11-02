import java.util.Scanner;
class YoungException extends RunTimeException
{
YoungException(String msg)
{
super(msg);
}
}
class Text
{
public static void main(String[] args)
{
int age=integer.ParseInt(args[0])
if(age>60)
{
Throw New YoungException("wait some years");
}
}