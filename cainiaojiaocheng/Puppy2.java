public class Puppy2 {
    int puppyAge;

    // 构造方法，相当于js中的constructor()
    public Puppy2(String name) {
        System.out.println("The name is:" + name);
    }

    // 获取年龄方法
    public int getAge() {
        return puppyAge;
    }

    // 设置年龄
    public void setAge(int age) {
        System.out.println("大神的年龄是:" + age);
        puppyAge = age;
    }

    // 入口
    public static void main(String[] args) {
        Puppy2 myPuppy2 = new Puppy2("york");
        myPuppy2.setAge(29);
        myPuppy2.getAge();
        System.out.println("变量值是:" + myPuppy2.puppyAge);
    }
}