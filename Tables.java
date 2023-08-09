import java.util.Scanner;
class Tables 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter the starting number :");
		int start = s.nextInt();
		System.out.println("Enter the ending number :");
		int end = s.nextInt();
		for(;start<=end;start++)
		{
			for(int num=1;num<=10;num++)
			{
				Thread.sleep(500);
				System.out.println(start+" * "+num+" = "+start*num);
			}
			System.out.println("\n************************\n");
		}

	}
}
