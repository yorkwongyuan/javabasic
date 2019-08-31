public class Person {
  int age;
  String name;

  public Person(String myName) {
    name = myName;
    System.out.println("my name is " + name);
  }

  public int getAge() {
    System.out.println(name + " age is" + age);
    return age;
  }

  public void setAge(int ageNum) {
    age = ageNum;
  }

  public static void main(String[] args) {
    Person person = new Person("york");
    person.setAge(99);
    person.getAge();
  }
}