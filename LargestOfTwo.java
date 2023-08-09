import java.util.Scanner;
class LargestOfTwo 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number a :");
		int a=s.nextInt();
		System.out.println("Enter the number b :");
        int b=s.nextInt();
		int res=(a>b)?a:b;
		System.out.println("Largest number is :"+res);
	}
}
