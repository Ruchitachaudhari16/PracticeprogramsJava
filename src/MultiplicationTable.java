import java.util.Scanner;

public class MultiplicationTable {
    //Uc7:-Java Program to Print Multiplication Table
    public static void main(String[] args)
    {
        int result = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Number to print a Table");
        int number=sc.nextInt();
        for (int i=1;i<=10;i++) {
            result = number * i;
            System.out.println(result);
        }
    }
}
