import java.util.*;
class PrimeRange 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter num1 : ");
		int num1=s.nextInt();
		System.out.println("Enter num2 : ");
		int num2=s.nextInt();
		int count=0;
		for(int i=num1;i<=num2;i++){
			for (int j=1;j<=i ;j++ ){
			if(i%j==0){
				count++;
			}
			}
			if(count==2){
				System.out.println(i);
			}
			count=0;
		}

	}
}
