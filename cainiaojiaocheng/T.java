public class T{
    static int grender = 1;
    public void getAge(){
        int age = 0;
        age = age + 7;
        System.out.println(age);
    }

    public static void main(String[] args){
        T t = new T();
        t.getAge();
        int ii = t.grender;
        System.out.println(ii);
    }
}