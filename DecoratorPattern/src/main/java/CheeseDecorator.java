public class CheeseDecorator extends ToppingDecorator{
    Pizza pizza;

    CheeseDecorator(Pizza pizza){
        this.pizza=pizza;
    }
    @Override
    int getCost() {
        return pizza.getCost()+50;
    }

    @Override
    String getDescription() {
       return pizza.getDescription()+" Cheese is added!!";
    }
}
