public class FirstDay {

    void sub(){
        System.out.println("Inside sub method");

    }

    public static void main(String[] args) {
        System.out.println("Inside main.");
        add();

    }

   static void add(){
       System.out.println("Inside add method");
     FirstDay firstDay=new FirstDay();
     firstDay.sub();

    }



}
