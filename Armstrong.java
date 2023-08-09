import java.util.*;
class Armstrong 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		int num=s.nextInt();
		int last=0,count=0;
		int temp=num;
		int product=1;
		int sum=0;
		while(num!=0){
			num/=10;
			count++;
		}
      while(num!=0){
		last=num%10;
		for(int i=1;i<=count;i++){
			product*=last;

		}
		sum+=product;
        num/=10;
		product=1;

      }
	  String res=(temp==sum)?"Armstrong number":"Not Armstrong number";
	  System.out.println("The given number is "+res);

	}
}
