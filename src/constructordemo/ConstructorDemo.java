package constructordemo;

public class ConstructorDemo {

    int a;
    int b;

    ConstructorDemo(){
        this(10,20);
        System.out.println("Inside Constructor Demo");
    }

    public ConstructorDemo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void sub(){
        System.out.println("addition : "+(a+b));
    }

    void add(){
        this.sub();
        System.out.println("addition : "+(a+b));
    }


    public static void main(String[] args) {
        ConstructorDemo demo=new ConstructorDemo();
        demo.add();
    }

}
