import java.util.Scanner;
class Strong 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		int num=s.nextInt();
		int sum=0;
		int fact=1;
		int last=0;
		int temp=num;
		while(num>0){
			last=num%10;
		for(int i=1;i<=last;i++){
			fact*=i;
		}
		sum+=fact;
		fact=1;
		num/=10;
		}
		String res=(temp==sum)?"Strong Number":"Not a Strong Number";
		System.out.println("The given num is : "+res);
	}
}
