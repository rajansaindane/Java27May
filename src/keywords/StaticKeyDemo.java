package keywords;

public class StaticKeyDemo {
    public static int count;

     public static void countDemo1(){
        count+=1;
    }


    static {
        System.out.println("Inside static block");
    }

    public static void main(String[] args) {
      StaticKeyDemo demo1=new StaticKeyDemo();
      StaticKeyDemo demo2=new StaticKeyDemo();
      countDemo1();
      System.out.println("count in 1st method = "+count );
      countDemo1();
      System.out.println("count in 2st method = "+count);


    }

}
