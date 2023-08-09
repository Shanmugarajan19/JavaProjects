import java.util.*;
class Perfect 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		int num=s.nextInt();
		int sum=0;
		int temp=num;
		for(int i=1;i<num;i++){
			if(num%i==0){
				sum+=i;
			}

		}
		String res=(temp==sum)?"Perfect Number":"Not Perfect";
		System.out.println("The given num is :"+res);
	}
}
