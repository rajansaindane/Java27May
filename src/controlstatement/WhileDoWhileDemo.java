package controlstatement;

public class WhileDoWhileDemo {

    static int whileDemo(){

        int i=0;
        while (i<3){
            System.out.println("i in while: "+i);
            i++;
        }

        do {
            System.out.println("i do while: "+i);
            i++;
        }while (i<3);

        return i;
    }

    public static void main(String[] args) {
        whileDemo();
    }

}
