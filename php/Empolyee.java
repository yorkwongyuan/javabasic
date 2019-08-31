// import java.io.*;

public class Empolyee {
  String name;
  int age;
  String designation;
  double salary;

  public Empolyee(String name) {
    this.name = name;
  }

  public void emAge(int emAge) {
    age = emAge;
  }

  public void emDesignation(String emDesignation) {
    designation = emDesignation;
  }

  public void emSalary(double emSalary) {
    salary = emSalary;
  }

  public void print() {
    System.out.println("name = " + name);
    System.out.println("age = " + age);
    System.out.println("designation = " + designation);
    System.out.println("salary = " + salary);
  }
}