package assignment1;

public class Exception  {
	
	public static void main(String args[])
	{
	int i=15;
	int r=1;
	try {
r =15/0;
	}
	catch(ArithmeticException ae)
	{
		ae.printStackTrace();
	}
	finally
	{
		System.out.println("code executed!!!");
	}
System.out.println("result is :"+r);
System.out.println(divide(15,0));
	}

public static int divide(int x,int y) {
	int ans = 0;
	try {
		ans=x/y;
	}
	catch(ArithmeticException e) 
	{
		ans=0;
	}finally {
		return ans; //This is always executed
	}



}
}