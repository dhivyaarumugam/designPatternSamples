package designPatterns.adapterDesign;

class PlasticToyDuck implements ToyDuck
{
    public void squeak()
    {
        System.out.println("Squeak as a Toy");
    }
}