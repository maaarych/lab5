package flower.store;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @ToString @NoArgsConstructor
public class Flower {
    private FlowerType flowerType;
    private double price;
    private double sepalLength;
    private FlowerColor color;

    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color= flower.color;
    }

    public String getColor() {
        return color.toString();
    }
}
