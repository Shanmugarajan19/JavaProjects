import java.util.Scanner; 
class Swapping 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a :");
		int a=s.nextInt();
		System.out.println("Enter b :");
		int b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped value of a is :"+a);
		System.out.println("Swapped value of b is :"+b);
	}
}
