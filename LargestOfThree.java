import java.util.Scanner;
class LargestOfThree 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter number a:");
		int a=s.nextInt();
		System.out.println("Enter number b:");
		int b=s.nextInt();
		System.out.println("Enter number c:");
		int c=s.nextInt();
		int res=(a>b&&a>c)?a:(b>c)?b:c;
		System.out.println("Largest of three number is "+res);
	}
}
