package aggrigation;

public class Employee {

    int empId;
    String empName;
    String empAddress;
    Double empSalary;
    Department department;//entity reference(Aggregation)

    public Employee(int empId, String empName, String empAddress, Double empSalary, Department department) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empSalary = empSalary;
        this.department = department;
    }

    void getData(){

        System.out.println("Name : "+empName+"\nId : "+empId+"\nAddress : "+empAddress+"\nSalary : "+empSalary+"" +
                "\n Department Id : "+department.deptId+"\nDepartment Name : "+department.deptName);

    }


    public static void main(String[] args) {

        Department department=new Department(1,"Android");
        Employee employee=new Employee(101,"Gayatri","Solapur",50000.00,department);
        employee.getData();
    }
}
