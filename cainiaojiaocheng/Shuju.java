public class Shuju{
   public static void main(String[] args){
    byte a = 100;
    int b = 1000;
    short c = 100;
    long d = 123123;

    double e = 123.3121342134213434;
    float f = 3.4f; // 必须加上f
    // Float 是一个基于float封装的类
    // Float F2 = new Float(123123); 这个new已经过时了
    // System.out.println(F2);
    Float F = Float.valueOf(123123);
    System.out.println(F);

    char g = 'A'; // 该类型必须为单引号
    boolean h = true;
    // System.out.println("byte size is " + Byte.SIZE);
    // System.out.println("int size is " + Integer.SIZE);
    // System.out.println("short size is " + Short.SIZE);
    // System.out.println("long size is " + Long.SIZE);
    // System.out.println("double size is " + Double.SIZE);
    // System.out.println("float size is " + Float.SIZE);

    System.out.println("the char size is " + Character.SIZE);
    // System.out.println("the char max size is" + Integer.MAX_VALUE);
    // System.out.println("the boolean size is " + Boolean.SIZE); 不存在
    String york = "yorks";
    // System.out.println(york);
    // System.out.println("The byte max value is " + Byte.MAX_VALUE);
    // System.out.println("The int max value is " + Integer.MAX_VALUE);
    int he = 128;
    byte she = (byte)he;
    System.out.println(she);
   }
}