package designPatterns.adapterDesign;

public class Sparrow implements Bird
{
    // a concrete implementation of bird
    public void fly()
    {
        System.out.println("Flying as a Sparrow");
    }
    public void makeSound()
    {
        System.out.println("Chirp Chirp sound as Sparrow");
    }
}
