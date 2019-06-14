package inheritance;

public class Employee extends Department {

     void empName(){

     }

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.empName();
        employee.deptName();
        employee.deptTechnologies();
    }

}
