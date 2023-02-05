import java.util.Random;

public class PairOfDice {
    private int die1;
    private int die2;
    private Random random = new Random();

    public PairOfDice() {
        roll();
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public void roll() {
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;
    }

    public int getTotal() {
        return die1 + die2;
    }
}
