public class ThinCrustPizza extends Pizza{
    ThinCrustPizza(int cost, String description){
        this.cost=cost;
        this.description=description;
    }

    @Override
    int getCost() {
       return cost;
    }

    @Override
    String getDescription() {
        return description;
    }
}
