import java.util.Scanner;
class Factorial 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		int num=s.nextInt();
		int f=1;
		for(int i=1;i<=num;i++){
			f=f*i;

		}
		System.out.println("Factorial of "+num+" is "+ f);
	}
}
