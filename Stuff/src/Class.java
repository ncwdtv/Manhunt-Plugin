import java.util.Scanner;
public class Class
{
public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input weight(lb): ");
        int w = in.nextInt();
        System.out.println("Input height(in): " );
        int h = in.nextInt();
        double BMI=(w*703)/h;
        if (BMI <18.5);
        {
            System.out.println("You're underweight");
        }
        elseif (BMI>=18.5 || BMI<=25);
        {
            System.out.println("You're normal weight");
        }
        else (BMI>30);
        {
            System.out.println("You're obese");
        }




    }
}