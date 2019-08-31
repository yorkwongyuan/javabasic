package com.php.test;

public class Test {
  public void pupAge() {
    int age = 0;
    age = 7;
    System.out.println("小狗的年龄是:" + age);
  }

  public static void main(String[] args) {
    Test test = new Test();
    test.pupAge();
  }
}