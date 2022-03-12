import java.util.Scanner;

public class Q3 {
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("How many rows do you want: ");
		int n=kb.nextInt();
		if(n<1)
		{
			System.out.println("Invalid row number...GOODBYE!!!!");
			System.exit(1);
		}
		System.out.println("What letter pattern do you want to be displayed: ");
		char pattern = kb.next().charAt(0);
		switch(pattern)
		{
			case 'A':
			for(int rows=0; rows<=n;rows++)
			{
				for(int i=1;i<=rows;i++)
				{
					System.out.print(i+ " ");
				}
            System.out.println();
			}
			break;
			case 'B':
			for(int rows=0; rows<=n;rows++)
			{
				int num=1;
				for(int i=n-rows;i>0;i--)
				{
					System.out.print(num+ " ");
					num++;
				}
				num=1;
				System.out.println();
			}
			break;
			case 'C':
			for(int rows=0; rows<=n;rows++)
			{
				int num = rows + 1;
				for(int spaces=n-rows;spaces >=0; spaces--)
				{
					System.out.print("  ");//double space to make the values hug the right
				}
				for(int x=0;x<=rows;x++)
				{
					System.out.print(num + " ");
					num--;
				}
				System.out.println();
			}
			break;
			case 'D':
			for(int rows=0; rows<=n;rows++)
			{
				int num=1;
				for(int spaces=0;spaces<=rows;spaces++)
				{
					System.out.print("  ");
				}
				for(int i=n-rows;i>0;i--)
				{
					System.out.print(num+ " ");
					num++;
				}
			num=1;
			System.out.println();
			}
			break;
			default: System.out.println("Invalid letter");
			break;
		}
	}
}
