package interfacedemo;

public  class CheckInterface implements InterfaceDemo {

    private void mul(int a,int b){

    }

    @Override
    public void sub(int a, int b) {

    }

    public static void main(String[] args) {
        CheckInterface checkInterface=new CheckInterface();
        checkInterface.sub(10,20);
        checkInterface.addition(20,30);

        InterfaceDemo demo=new CheckInterface();

    }
}
