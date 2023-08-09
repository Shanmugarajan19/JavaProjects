import java.util.Scanner;
class LargestThree 
{
    static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a :");
		int a=s.nextInt();
		System.out.println("Enter b :");
		int b=s.nextInt();
		System.out.println("Enter c :");
		int c=s.nextInt();
		if(a>b&&a>c)
			System.out.println("The largest number is "+a);
		else if(b>c)
            System.out.println("The largest number is "+b);
		else
			System.out.println("The largest number is "+c);
	}
}
