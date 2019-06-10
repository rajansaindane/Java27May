package controlstatement;


import keywords.StaticKeyDemo;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        int array[]={1,2,3,4,5};

        System.out.println("Enter the size of array : ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int array1[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the value of array at : "+i);
            array1[i]=scanner.nextInt();
        }
        for (int i:array1){
            System.out.println("array of : "+i);
        }

    }
}