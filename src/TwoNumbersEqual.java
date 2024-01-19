import java.util.Scanner;

public class TwoNumbersEqual {
    //UC6:-Java Program to Check if Two Numbers are Equal
    public static  void main(String[] args)
    {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter a number One");
        int numberOne=sc.nextInt();
        System.out.println("Enter a number Two");
        int numberTwo=sc.nextInt();
        if(numberOne==numberTwo)
        {
            System.out.println("Numbers are Equal");
        }
        else
        {
            System.out.println("Numbers are not equal");
        }

    }
}
