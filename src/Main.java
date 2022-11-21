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
                    break;
                case 2:
                    System.out.println("Enter three numbers");
                    num1=sc.nextInt();
                    num2=sc.nextInt();
                    num3=sc.nextInt();
                    if(num1<num2 && num1<num3)
                    {
                        System.out.println("Smallest is "+num1);
                    }
                    else if(num2<num3)
                    {
                        System.out.println("Smallest is "+num2);
                    }
                    else
                    {
                        System.out.println("Smallest is "+num3);
                    }
                    break;
                case 3:
                    System.out.println("Enter a number");
                    int num=sc.nextInt();
                    int i,flag=0;
                    if(num==0||num==1)
                    {
                        System.out.println("Not prime");
                    }
                    else
                    {
                        for(i=2;i<=num/2;i++)
                        {
                            if(num%i==0)
                            {
                                System.out.println("Not prime");
                                flag=1;
                                break;
                            }
                        }
                        if(flag==0)

                        {
                            System.out.println("Prime number");
                        }
                    }
                case 4:
                    System.out.println("Enter a number");
                    num=sc.nextInt();
                    if(num%2==0)
                    {
                        System.out.println("Even");
                    }
                    else
                    {
                        System.out.println("Not even");
                    }



            }


        }
            while (option != 5) ;
        }
    }