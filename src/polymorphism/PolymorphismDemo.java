package polymorphism;

public class PolymorphismDemo {

    public PolymorphismDemo() {
        System.out.println("inside parent constructor");
    }

    void add(int a, int b){
        System.out.println("add "+(10+20)) ;
    }

    void add(float a,float b){
        System.out.println("add "+(a+b)) ;
    }

    public static void main(String[] args) {
        PolymorphismDemo demo=new PolymorphismDemo();
        demo.add(1.1F,2.0F);
    }

}
