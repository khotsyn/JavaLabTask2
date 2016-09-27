import org.junit.Test;
import task2_1.BallColour;
import task2_1.Basket;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestBasket {

    @Test
    public void testFillingBasket() {
        Basket basket = new Basket();
        basket.fillingBasket();
        for (int i = 0; i < basket.bsk.length - 1; i++) {
            assertNotNull(basket.bsk[i]);
        }
    }

    @Test
    public void testWeightBallsInBasket() {
        Basket basket = new Basket();
        basket.fillingBasket();
        int weightBasket1 = basket.weightBallsInBasket();
        basket.bsk[0].weight += 5;
        assertEquals(weightBasket1 + 5, basket.weightBallsInBasket());
    }

    @Test
    public void testAmountColourBalls() {
        Basket basket = new Basket();
        basket.fillingBasket();
        for (int i = 0; i < basket.bsk.length; i++) {
            basket.bsk[i].colour = BallColour.BLUE;
        }
        assertEquals(basket.bsk.length, basket.amountColourBalls(BallColour.BLUE));
    }
}
