package controlstatement;

public class TwoDArray {

    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        for (int i=2;i>=0;i--){
            for (int j=2;j>=0;j--){

                    System.out.print(" " + array[i][j]);

                }
            System.out.println();
        }
    }
}
/*
1 2 3
4 5 6
7 8 9

9 8 7
6 5 4
3 2 1

7 4 1
8 5 2
9 6 3


3 2 1
9 6 4
9 8 7

9 6 3
8 5 2
7 4 1

00 01 02
10 11 12
20 21 22

22 21 20
12 11 10
02 01 00*/
