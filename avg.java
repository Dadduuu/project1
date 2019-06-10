import java.util.Scanner;
class avg
{
int a;
	void getdata()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		a=s.nextInt();
		
	}

public static void main(String arr[])
{
even e=new even();
e.getdata();
if(e.a%2==0)
System.out.println("number is even");
else 
System.out.println("number is odd");
}
}

