import java.util.Scanner;
class DigitalSum 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		int num=s.nextInt();
		int sum=0;
		while(num>0){
		     sum=sum+num%10;    
             num/=10;	
		}
		System.out.println("The sum of the digit is : "+sum);
	}
}
