package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class FlowerPackTest {
    private FlowerPack flowerPack;
    private Flower testFlower;

    @BeforeEach
    public void init() {
        // Initialize a test flower with a specific price
        testFlower = new Flower();
        testFlower.setPrice(10.0);

        // Initialize a FlowerPack with the test flower and quantity
        flowerPack = new FlowerPack(testFlower, 5);
    }

    @Test
    public void testGetPrice() {
        // Calculate the expected price based on the test flower's price and quantity
        double expectedPrice = testFlower.getPrice() * 5;

        // Get the actual price from the FlowerPack
        double actualPrice = flowerPack.getPrice();

        // Assert that the actual price matches the expected price
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testSetQuantity() {
        // Test setting a valid quantity
        flowerPack.setQuantity(3);
        Assertions.assertEquals(3, flowerPack.getQuantity());

        // Test setting an invalid quantity (less than 1)
        flowerPack.setQuantity(-2);
        Assertions.assertEquals(1, flowerPack.getQuantity()); // Should default to 1
    }
}
