package controlstatement;


import keywords.StaticKeyDemo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayDemo {
    List<Student> list=new ArrayList<>();
    private List<Student> displayStudents(int i,String name,String std,String div){

        Student student=new Student();
        student.setId(i);
        student.setName(name);
        student.setStd(std);
        student.setDiv(div);
        list.add(student);
        return list;
    }


    public static void main(String[] args) {
        int array[]={1,2,3,4,5};

        //System.out.println("Enter the size of array : ");
        Scanner scanner=new Scanner(System.in);
        //int n=scanner.nextInt();
        /*int array1[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the value of array at : "+i);
            array1[i]=scanner.nextInt();
        }
        for (int i:array1){
            System.out.println("array of : "+i);
        }
*/
        String name,std,div;
        ArrayDemo demo=new ArrayDemo();
        for (int i=1;i<4;i++){
            System.out.print("Enter the name,syd,div: ");
            name=scanner.nextLine();
            std=scanner.next();
            div=scanner.next();
            demo.displayStudents(i,name,std,div);
        }
        System.out.println("List of students  : "+demo.list.get(0).getName());

    }
}