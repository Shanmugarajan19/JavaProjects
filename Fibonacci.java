import java.util.Scanner;
class Fibonacci 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the range :");
		int range=s.nextInt();
		int num1=0,num2=1,num3=0;
		System.out.print(num1+" "+num2+" ");
		for(int i=3;i<=range;i++){
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(num3+" ");
			num3=0;
		}
	}
}
