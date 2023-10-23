package designPatterns.FactoryPizzainterface;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = PizzaFactory.orderpizza("Cheese");
        System.out.println(pizza.getPizza());
    }
}
