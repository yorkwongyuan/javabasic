import java.io.*;
public class Employee{
    String name;
    int age;
    double salary;
    String designation;
     // 构造方法
    public Employee(String name){
        this.name = name;
    }
    // 设置年龄
    public void emAge(int emAge){
        age = emAge;
    }
    // 设置designation的值
    public void emDesignation(String emDesign){
        designation = emDesign;
    }
    // 设置salary值
    public void emSalary(double emSalary){
        salary = emSalary;
    }
    // 打印信息
    public void printEmployee(){
        System.out.println("姓名是:"+name);
        System.out.println("年龄是:"+age);
        System.out.println("职位是:"+designation);
        System.out.println("薪水是:"+salary);
    }
}
