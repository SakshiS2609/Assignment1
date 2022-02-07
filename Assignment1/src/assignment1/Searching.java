package assignment1;
import java.util.*;
public class Searching {
	
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length");
int n=sc.nextInt();
System.out.println("enter element");
int s=sc.nextInt();

int i;
int ar[]=new int[n];
System.out.println("array elements");
for (i=0;i<n;i++)
{
	ar[i]=sc.nextInt();
}

for (i=0;i<n;i++)
{
if(s==ar[i])
{
	System.out.println("found!!!@"+i);
	break;
}



}


}

}
