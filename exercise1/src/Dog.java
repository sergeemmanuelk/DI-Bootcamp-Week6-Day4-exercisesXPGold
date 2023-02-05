public class Dog {
    private int drinkTime;

    public void setDrinkTime(int time) {
        this.drinkTime = time;
    }

    public int getDrinkTime() {
        return this.drinkTime;
    }

    public boolean needsToGo() {
        return (System.currentTimeMillis() - drinkTime) > 4 * 60 * 60 * 1000;
    }
}
