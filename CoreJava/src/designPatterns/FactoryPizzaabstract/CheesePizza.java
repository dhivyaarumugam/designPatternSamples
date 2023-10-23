package designPatterns.FactoryPizzaabstract;

public class CheesePizza extends Pizza{
    public String getPizza()
    {
        System.out.println("in Cheese pizza creation");
        return "Cheese Pizza created";
    }

}
