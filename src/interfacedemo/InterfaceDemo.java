package interfacedemo;

public interface InterfaceDemo {

    default void addition(int a,int b){
        System.out.println("inside default method");

    }

    void sub(int a,int b);
}


