import java.util.Scanner;
class OddOrEven 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		int num=s.nextInt();
		if(num%2==0)
			System.out.println("Then given number "+num+" is Even");
		else
			System.out.println("Then given number "+num+" is Odd");
	}
}
