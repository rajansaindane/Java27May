package inheritance;

public class Department {

    void deptName(){
        System.out.println("CS dept");
    }

    void deptTechnologies(){
        System.out.println("Java Technologies");
    }

    public static void main(String[] args) {
        Department department=new Department();
        department.deptName();
        department.deptTechnologies();
    }
}
