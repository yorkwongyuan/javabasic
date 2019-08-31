import java.util.Vector;
import java.util.function.Consumer;
import java.util.Iterator;
import java.util.Enumeration;
public class VectorDemo1{
  public static void main(String args[]){
    Vector<String> v = new Vector<String>(); // 泛型
    v.add("Y");
    v.add("o");
    v.add("r");
    v.addElement("k");
    System.out.println(v);
    // for(String s:v){
    //   System.out.println(s);
    // }

    // v.forEach(new Consumer<String>(){
    //   public void accept(String s){
    //     System.out.println(s);
    //   }
    // });

    // for(int i=0;i<v.size();i++){
    //   System.out.println(v.get(i));
    // }

    // Iterator<String> it = v.iterator();
    // while(it.hasNext()){
    //   String string = (String)it.next();
    //   System.out.println(string);
    // }

    Enumeration enumer = v.elements();
    while(enumer.hasMoreElements()){
      System.out.println(enumer.nextElement().toString());
    }
  }
}