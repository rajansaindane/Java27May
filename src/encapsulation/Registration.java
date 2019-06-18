package encapsulation;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        User user=new User();
        System.out.print("Enter id,name ,age and address : ");
        Scanner scanner=new Scanner(System.in);
        user.setId(scanner.nextInt());
        user.setName(scanner.next());
        user.setAge(scanner.nextInt());
        user.setAddress(scanner.next());


        System.out.println("id : "+user.getId());
        System.out.println("name : "+user.getName());
        System.out.println("address : "+user.getAddress());
    }

}
