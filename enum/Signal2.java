public class Signal2 {
  enum Light {
    RED, GREEN, YELLOW
  }

  public static void main(String args[]) {
    Light light = Light.valueOf("YELLOW");
    for (int i = 0; i < Light.values().length; i++) {
      System.out.println(light + "和" + Light.values()[i] + "==>" + light.compareTo(Light.values()[i]));
    }
  }
}