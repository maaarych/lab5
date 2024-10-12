package flower.store.filter;
import flower.store.FlowerType;
import flower.store.Item;
import flower.store.Flower;

public abstract class FlowerTypeFilter implements SearchFilter {
    private FlowerType targetFlowerType;

    public FlowerTypeFilter(FlowerType targetFlowerType) {
        this.targetFlowerType = targetFlowerType;
    }
    public boolean match(Flower flower) {
        return flower.getFlowerType() == targetFlowerType;
   
    }
}
