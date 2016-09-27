package task2_1;

public class Ball {

    public int weight;
    public BallColour colour;

    public Ball(int weight) {
        this.weight = weight;
        int i = (int) (1 + Math.random() * 7);
        switch (i) {
            case 1: this.colour = BallColour.BLACK;
                break;
            case 2: this.colour = BallColour.BLUE;
                break;
            case 3: this.colour = BallColour.GREEN;
                break;
            case 4: this.colour = BallColour.PURPLE;
                break;
            case 5: this.colour = BallColour.RED;
                break;
            case 6: this.colour = BallColour.WHITE;
                break;
            default: this.colour = BallColour.YELLOW;
        }
    }
}
