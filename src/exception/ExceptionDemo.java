package exception;

public class ExceptionDemo {

    public static void main(String[] args) {

        try{
            int a=10;
            System.out.println("a : "+(a/0));
        }
        catch (NullPointerException e){
            System.out.println("Number cannot divide by 0");
        }
        catch (ArithmeticException e){
            System.out.println("Number cannot divide by 0");
        }


        System.out.println("Rest of the code");

    }

}
