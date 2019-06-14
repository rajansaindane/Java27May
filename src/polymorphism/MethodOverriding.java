package polymorphism;

public class MethodOverriding extends PolymorphismDemo {

    public MethodOverriding() {
        System.out.println("inside child constructor");
    }

    void add(int a, int b){
        System.out.println("add : "+(20+30));
    }

    void checkSuper(){
        add(1,2);
        super.add(1,2);
    }

    public static void main(String[] args) {
    new MethodOverriding().checkSuper();
    }
}
