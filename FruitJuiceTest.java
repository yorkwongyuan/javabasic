class FruitJuice {
    enum FruitJuiceSize {
        LARGE, MIDDLE, SMALL
    }

    FruitJuiceSize size;
}

public class FruitJuiceTest {
    public static void main(String[] args) {
        FruitJuice juice = new FruitJuice();
        juice.size = FruitJuice.FruitJuiceSize.LARGE;
        System.out.println(juice.size);
    }
}
