// import java.io.*;
public class EmployeeTest{
    public static void main(String[] args){
        Employee em01 = new Employee("york");
        em01.emAge(123);
        em01.emDesignation("高级前端");
        em01.emSalary(100000);
        em01.printEmployee();
    }
}