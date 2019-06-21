package controlstatement;

import java.util.Scanner;

public class SwitchCaseDemo {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Choice : \n"+"1.add\n"+"2.sub\n"+"3.mul");
        int choice=scanner.nextInt();
        System.out.print("Enter the value of a and b  :");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("add is : "+(a+b));
                break;

            case 2:
                System.out.println("sub is : "+(a-b));
                break;

            case 3:
                System.out.println("add is : "+(a*b));
                break;

                default:
                    System.out.println("Invalid Choice");
        }
   /*     String msg="My Name Is Rajan";
        String[] msgArray={"My","Name","Is","Rajan"};*/
    }
}
