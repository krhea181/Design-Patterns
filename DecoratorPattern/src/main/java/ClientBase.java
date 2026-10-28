public class ClientBase {
    public static void main(String[] args){
        System.out.println("Decorator pattern is!!");
        Pizza thickCrustPizza = new ThickCrustPizza(340,"Thick crust pizza : ");
        // We are changing original pizza object we just need decorators for it!!
        //ToppingDecorator.addJalapano(thickCrustPizza);
        //ToppingDecorator.addCheese(thickCrustPizza);
        Pizza pizza = new CheeseDecorator(thickCrustPizza);
        Pizza pizza1 = new JalapanoesDecorator(pizza);
        System.out.println("Cost is : " + pizza1.getCost() + " " + "Description is : "+pizza1.getDescription());

    }
}
