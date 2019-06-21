package operators;

import interfacedemo.InterfaceDemo;
import interfacedemo.InterfaceDemo1;

public class OperatorDemo implements InterfaceDemo, InterfaceDemo1 {

    public static void main(String[] args) {

        int a=10;//a=10
        int b=20;//b=20
        int c=(++a)+(b++);//c=31 a=11 b=21
        int d=(++c)+(b++)+(++a);//d=65 a=12 b=22 c=32
        int e=(++c)+(b++)+(++a)+(d++);//e=133 d=66 c=33 b=23 a=13

        System.out.println("a : "+a);//g=13  gaytri=  sh=13
        System.out.println("b : "+b);//g=23 sh=20
        System.out.println("c : "+c);//31 g=31 sh=33
        System.out.println("d : "+d);//64 g=64 sh=64
        System.out.println("e : "+e);//g=133 p=132 sh=130

    }

    @Override
    public void addition(int a, int b) {

    }

    @Override
    public void sub(int a, int b) {

    }
}
