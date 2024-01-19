import java.util.Scanner;

public class LargestNoAmong3No {
    //Java Program to Find the Largest Number Among Three Numbers
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number one");
        int numberOne=sc.nextInt();
        System.out.println("Enter the number two");
        int numberTwo=sc.nextInt();
        System.out.println("Enter the number three");
        int numberThree= sc.nextInt();
        if(numberOne> numberTwo && numberOne> numberThree)
        {
            System.out.println("Number one is greater");

        }
        else if(numberTwo>numberThree && numberTwo>numberOne)
        {
            System.out.println("Number two is greater");
        }
        else
        {
            System.out.println("Number three is greater");
        }
    }
}
