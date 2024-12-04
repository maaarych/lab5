package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket;
    private Flower testFlower;

    @BeforeEach
    public void init() {
        // Initialize a test flower with a specific price
        testFlower = new Flower();
        testFlower.setPrice(10.0);

        // Initialize a FlowerPack with the test flower and quantity
        FlowerPack flowerPack = new FlowerPack(testFlower, 5);

        // Initialize a FlowerBucket and add the flower pack
        flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPack);
    }

    @Test
    public void testGetPrice() {
        // Calculate the expected price based on the test flower's price and quantity
        double expectedPrice = testFlower.getPrice() * 5;

        // Get the actual price from the FlowerBucket
        double actualPrice = flowerBucket.getPrice();

        // Assert that the actual price matches the expected price
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testAddFlowerPack() {
        // Add a new flower pack to the bucket
        FlowerPack newFlowerPack = new FlowerPack(testFlower, 3);
        flowerBucket.addFlowerPack(newFlowerPack);

        // Calculate the expected total price after adding the new flower pack
        double expectedPrice = testFlower.getPrice() * 5 + testFlower.getPrice() * 3;

        // Get the actual total price from the FlowerBucket
        double actualPrice = flowerBucket.getPrice();

        // Assert that the actual price matches the expected price after adding the new flower pack
        Assertions.assertEquals(expectedPrice, actualPrice);
    }
}
