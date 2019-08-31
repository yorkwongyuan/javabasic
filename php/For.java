public class For{
  public static void main(String []args){
    int x = 10;
    while(x <= 20){
      // System.out.println(x);
      x++;
    }
    for(int y = 0;y<=50;y++){
      // System.out.println(y);
    }

    int numbers [] = {10,20,30,40};
    for(int z:numbers){
      System.out.println(z);
    }

    String [] strings = {"york","nigel","robin"};
    for(String k:strings){
      // System.out.print(k);
    }
  }
}