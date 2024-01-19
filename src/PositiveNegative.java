import java.util.Scanner;

public class PositiveNegative {
    //Java Program to Check Whether a Number is Positive or Negative
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Check weathet number is +ve or -ve");
        int number=sc.nextInt();
        if(number >0)
        {
            System.out.println("Number is positive");
        }
        else
        {
        System.out.println("Number is negative");
        }
    }
}
