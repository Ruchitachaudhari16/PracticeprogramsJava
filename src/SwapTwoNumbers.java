import java.util.Scanner;

public class SwapTwoNumbers {
    //Java Program to Swap Two Numbers
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numberOne");
        int numberOne=sc.nextInt();
        System.out.println("Enter a numberTwo");
        int numberTwo=sc.nextInt();
        int temp;
        temp=numberOne;
        numberOne=numberTwo;
        numberTwo=temp;
        System.out.println("After swapping of number1:"+numberOne);
        System.out.println("After swapping number2:"+numberTwo);

    }
}
