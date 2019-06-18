package abstraction;

public class CheckAbstraction extends AbsractDemo{


    @Override
    int add(int a, int b) {
        return a+b;
    }

    @Override
    int sub(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {

        CheckAbstraction abstraction=new CheckAbstraction();

  /*      AbsractDemo demo=new AbsractDemo() {
            @Override
            int add(int a, int b) {

                return 0;
            }

            @Override
            int sub(int a, int b) {
                return 0;
            }
        };
        demo.add(10,29);
        demo.sub(30,40);
*/

  AbsractDemo demo= new AbsractDemo() {
      @Override
      int add(int a, int b) {
          return 0;
      }

      @Override
      int sub(int a, int b) {
          return 0;
      }
  };

    }
}
