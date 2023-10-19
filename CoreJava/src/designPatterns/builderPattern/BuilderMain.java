package designPatterns.builderPattern;
//The parameters to the constructor are reduced and are provided in highly readable method calls.
//Immutable objects can be built without much complex logic in the object building process.
public class BuilderMain {
    public static void main(String[] args)
    {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        engineer.constructHouse();

        House house = engineer.getHouse();

        System.out.println("Builder constructed: "+ house);
    }
}
