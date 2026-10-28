public class JalapanoesDecorator extends ToppingDecorator {
    Pizza pizza;
    JalapanoesDecorator(Pizza pizza){
        this.pizza=pizza;
    }
    @Override
    int getCost() {
       return pizza.getCost()+20;
    }

    @Override
    String getDescription() {
        return pizza.getDescription()+" Jalapanoes is added !!";
    }
}
