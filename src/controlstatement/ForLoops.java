package controlstatement;

import keywords.StaticKeyDemo;

import java.util.Date;

public class ForLoops {

    static void getLoopData(){
        for (int i=0,j=2;i<3 && j<4;i++,j++)
        {
            System.out.println(i+""+j);

           /* for (int j=0;j<3;j++) {
                System.out.println(i+""+j);
            }

            for (int k=0;k<3;k++)
            {
                System.out.println(i+""+k);
            }*/

            }
        StaticKeyDemo.countDemo1();
    }

    public static void main(String[] args) {
        /*int a=10;d
        int b=a++;//a=11,b=10
        int c=(++b)+(a++);//c=22,b=11,a=12
        int d=(c++)+(++b)+(a++);//d=46,c=23,b=12,a=13
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);*/

        getLoopData();

        System.out.println(System.currentTimeMillis());
        Date date=new Date();
        date.getMinutes();
    }

}
