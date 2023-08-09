import java.util.Scanner;
class DigitsCount 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		int num=s.nextInt();
		int count=0;
		while(num!=0){
			num/=10;
			count++;	
		}
		System.out.println("The count of digits is :"+count);
	}
}
