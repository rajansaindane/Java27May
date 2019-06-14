import java.util.Scanner;

public class DemoClass {



    int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        System.out.print("Enter the value of a and b : ");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("Addition od a and b : "+demoClass.add(a,b));

    }

}
