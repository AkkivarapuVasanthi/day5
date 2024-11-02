import java.util.Scanner;
class NegativeAmountException extends Exception
{
String msg;
NegativeAmountException(String msg)
{
this.msg=msg;
}
public String toString()
{
return msg;
}
}
public class LabTask2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount:");
int amt=sc.nextInt();
try
{
if(amt<0)
{
throw new NegativeAmountException("Invalid Amount...");
}
else
{
System.out.println("Amount Deposited...");
}
}
catch(NegativeAmountException e)
{
System.out.println(e);
}
}
}