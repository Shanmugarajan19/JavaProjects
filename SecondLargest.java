import java.util.Scanner;
class SecondLargest 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a : ");
		int a =s.nextInt();
		System.out.println("Enter b : ");
		int b =s.nextInt();
		System.out.println("Enter c : ");
		int c =s.nextInt();
		if(a>b&&a>c){
			//a is largest
			if(b>c)
				{
					System.out.println("The second largest is :"+b);
					}
				else{
					System.out.println("The second largest is :"+c);
				}
		}
		else if(b>c){
			//b is largest
			if(a>c)
				{
				System.out.println("The second largest is :"+a);
				}
				else{
					System.out.println("The second largest is :"+c);
				}
			
		}
		else {
			//c is largest
			if(a>b)
				{
				System.out.println("The second largest is :"+a);
				}
				else{
					System.out.println("The second largest is :"+b);
				}
			}
		}
	}

