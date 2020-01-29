import java.util.Scanner;
class TestReactangle
{
		
	public static void main(String args[])
	{
		double a,b;
		int i;
		
		Scanner sc=new Scanner(System.in);
		rectangle r[]= new rectangle[5]; 
		for(i=0;i<5;++i)
		{
			System.out.println("Enter length: ");
			a=sc.nextDouble();
			System.out.println("Enter breadth: ");
			b=sc.nextDouble();
			r[i]=new rectangle(a,b);
			r[i].area();
			r[i].display();
		}		
			


	 }

}