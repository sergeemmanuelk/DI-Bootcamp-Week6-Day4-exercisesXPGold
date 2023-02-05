public class Main {
    public static void main(String[] args) {

        PairOfDice dice = new PairOfDice();
        int rollCount = 0;

        while (dice.getTotal() != 2) {
            dice.roll();
            rollCount++;
        }

        System.out.println("Total rolls before getting 2: " + rollCount);
    }
}