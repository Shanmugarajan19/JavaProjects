import java.util.Scanner;
class Xylem 
{
	static Scanner s =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		int num=s.nextInt();
		int last =num%10;
		int i_sum=0;
		num/=10;
		while(num>9){
			i_sum+=num%10;
            num/=10;
		}
		String res=(i_sum==(last+num))?"Xylem":"Phloem";
		System.out.println("The given number is "+res);
	}
}
