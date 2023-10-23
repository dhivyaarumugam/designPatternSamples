package designPatterns.FactoryPizzainterface;

public class CheesePizza implements Pizza
{
    @Override
    public String getPizza() {
        return "Cheese pizza prepared";
    }
}
