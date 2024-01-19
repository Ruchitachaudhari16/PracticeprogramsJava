import java.util.Scanner;

public class EvenOdd {
   //Java Program to Check Whether a Given Number is Even or Odd
    public static  void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to check weather it is even or odd");
        int number= scanner.nextInt();
        if(number %2==0)
        {
            System.out.println("Number is even ");
        }
        else
        {
         System.out.println("Number is odd");
        }

    }
}
