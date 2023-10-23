package designPatterns.FactoryPizzaabstract;

public class AbstractClient {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory= new PizzaFactory();
        Pizza pizza = pizzaFactory.orderpizza("Cheese");
        System.out.println(pizza.getPizza());
    }

}