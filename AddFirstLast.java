import java.util.Scanner;
class AddFirstLast  
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		int num=s.nextInt();
		int last = num%10;
		int first=0;
		while(num>9){
			num/=10;
			first=num;
		}
		System.out.println("The addition of first and last is : "+(first+last));
	}
}
