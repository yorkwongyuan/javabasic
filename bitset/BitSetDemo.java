import java.util.BitSet;

public class BitSetDemo {
  public static void main(String args[]) {
    BitSet bitset1 = new BitSet(16);
    BitSet bitset2 = new BitSet(16);
    for (int i = 0; i < 16; i++) {
      if (i % 2 == 0)
        bitset1.set(i);
      if (i % 5 != 0)
        bitset2.set(i);
    }

    System.out.println(bitset1);
    System.out.println(bitset2);

    System.out.println("and");
    bitset2.and(bitset1); // bitset1 和 bitset2的交集
    System.out.println(bitset2);

    System.out.println("or");
    bitset2.or(bitset1);
    System.out.println(bitset2);
  }
}