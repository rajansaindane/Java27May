package controlstatement;


import java.util.Scanner;

public class IfStatements {

    static void checkEvenOdd(int number) {


        if (number<35){
            System.out.println("fail");
        }
        else if(number>=35 && number<60 ){
            System.out.println("Second Class");
        }
        else if(number>=60 && number<75)
        {
            System.out.println("First Class");
        }
        else if(number>=75 && number<=100) {
            System.out.println("Dist");
        }
        else {
            System.out.println("Invalid Input");
        }

    }


    private static void checkBreak(){

        for(int i=0;i<10;i++){
            if (i==5){
                break;
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        checkBreak();
        /*int number;
        System.out.print("Enter Percentage : ");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        checkEvenOdd(number);
        unnati(new String[]{"unnati,anjusha,gayatri"});*/
    }


    public static void unnati(String[] args) {
        System.out.println(args);
    }

}
