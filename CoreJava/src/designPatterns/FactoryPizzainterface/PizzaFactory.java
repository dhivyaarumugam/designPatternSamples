package designPatterns.FactoryPizzainterface;

public class PizzaFactory {
    public static Pizza orderpizza(String order)
    {
        Pizza pizza = null;
       if (order.equalsIgnoreCase("Cheese"))
        { pizza = new CheesePizza(); }
        else if (order.equalsIgnoreCase("Veggie"))
        { pizza = new VeggiePizza(); }
        else if (order.equalsIgnoreCase("Chicken"))
        {pizza = new ChickenPizza(); }
        return pizza;
    }

}
