
public class Assignment3 {
	public static void main(String[] args)
	{
		int[] a={0,0};
		int a0=0;
		int a1=0;
		int z;
		System.out.printf("%c%s\t%c%s\t\t%c%s\n",'#'," of tosses",'#'," heads",'#'," tails");
		for(int i=1;i<=1000000;i=i*10)
		{
			z = coin();
			if(z==0)
			{
				a[0]=a[0]+1;
				a0=a[0];
			}
			else if(z==1)
			{
				a[1]=a[1]+1;
				a1=a[1];
			}
			if(i%10==0)
			{
			System.out.printf("%d\t\t%d\t\t%d\n",i,a0,a1);
			}
		}
	}
	public static int coin()
	{
		int x=(int)(Math.random()*2);
		return x;
	}
}
