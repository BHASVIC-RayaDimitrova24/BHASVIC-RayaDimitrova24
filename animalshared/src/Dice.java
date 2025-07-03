import java.util.Random;

public class Dice {
    public int dice;

    public Dice() {
    }

    public int roll() {
        Random r = new Random();
        this.dice = r.nextInt(1,7);
        return this.dice;
    }

    public int same(int d1, int d2) {
        if (d1 == d2) {
            return 1;
        }
        else {
            return 0;
        }
    }


}
