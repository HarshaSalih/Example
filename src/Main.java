import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int option;
        do {

            System.out.println("1.Find largest\n2.Find smallest\n3.Check prime or not\n4.Check even or not\n5.Find reverse\n6.Exit");
            System.out.println("Choose an option");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter three numbers");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    int num3 = sc.nextInt();
                    if (num1 > num2 && num1 > num3) {
                        System.out.println("Largest is " + num1);
                    } else if (num2 > num3) {
                        System.out.println("Largest is " + num2);
                    } else {
                        System.out.println("Largest is " + num3);
                    }
            }
        }
            while (option != 5) ;
        }
    }