package stringdemo;

public class StringDemo {

    public static void main(String[] args) {

            String s="codekul";
            String s1="codekUl";
        System.out.println(s.hashCode());
            //s=s.concat(s1);
            System.out.println(s);
        System.out.println(s.hashCode());

        String s2=new String("codekul");

        if (s.equals(s2))

        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }

}
