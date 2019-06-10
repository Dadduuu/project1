import java.util.Scanner;
class avg
{
float w1;
float w2;
int q1;
int q2;

	void getdata()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter weight of first item");
		w1=s.nextInt();
		System.out.println("enter quantity of first item");
		q1=s.nextInt();
		
		System.out.println("enter weight of second item");
		w2=s.nextInt();
		System.out.println("enter quantity of second item");
		q2=s.nextInt();
	}
	void average()
	{
	float avge=((w1*q1)+(w2*q2))/(q1+q2);
	System.out.println("average= "+avge);
	}
public static void main(String arr[])
{
avg o=new avg();
o.getdata();
o.average();
}
}
