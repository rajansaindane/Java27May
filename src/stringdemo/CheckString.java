package stringdemo;

public class CheckString {

    private String checkString(){
        String s="codekul";
        for (int i=0;i<10000;i++){
            s=s.concat("Institute");
        }
        return s;
    }

    private StringBuffer checkStringBuffer(){
        StringBuffer s=new StringBuffer("codekul");
        for (int i=0;i<10000;i++){
            s.append("Institute");
        }
        return s;
    }

    private StringBuilder checkStringBuilder(){
        StringBuilder s=new StringBuilder("codekul");
        for (int i=0;i<10000;i++){
            s.append("Institute");
        }
        return s;
    }

    public static void main(String[] args) {
        CheckString checkString=new CheckString();
        Long currentTimeBeforeString=System.currentTimeMillis();
        checkString.checkString();
        System.out.println("Time for String  is : "+(System.currentTimeMillis()-currentTimeBeforeString));

        Long currentTimeBeforeStringBuffer=System.currentTimeMillis();
        checkString.checkStringBuffer();
        System.out.println("Time for String Buffer is : "+(System.currentTimeMillis()-currentTimeBeforeStringBuffer));

        Long currentTimeBeforeStringBuilder=System.currentTimeMillis();
        checkString.checkStringBuilder();
        System.out.println("Time for String Builder  is : "+(System.currentTimeMillis()-currentTimeBeforeStringBuilder));

    }

}
