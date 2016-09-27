package task2_1;

public class Basket {
    public Ball[] bsk = new Ball[20];

    public void fillingBasket() {
        for (int i = 0; i < bsk.length; i++) {
            bsk[i] = new Ball((int) (1 + Math.random() * 11));
        }
    }

    public int weightBallsInBasket() {
        int w = 0;
        for (int i = 0; i < bsk.length; i++) {
            w += bsk[i].weight;
        }
        return w;
    }

    public int amountColourBalls(BallColour colour) {
        int amount = 0;
        for (int i = 0; i < bsk.length; i++) {
            if (colour.equals(bsk[i].colour)) {
                amount++;
            }
        }
        return amount;
    }

    public void showColourBalls() {
        for (int i = 0; i < bsk.length; i++) {
            System.out.println(bsk[i].colour);
        }
    }

}