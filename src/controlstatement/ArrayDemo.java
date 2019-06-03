package controlstatement;

public class ArrayDemo {

    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int array1[]=new int[10];
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;

        for (int i=0;i<6;i++){
            System.out.println(array1[i]);
        }
    }
}
