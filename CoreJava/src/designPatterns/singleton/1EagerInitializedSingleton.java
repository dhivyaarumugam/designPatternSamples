package designPatterns.singleton;

class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

        // private constructor to avoid client applications using the constructor
    private EagerInitializedSingleton(){}

     static EagerInitializedSingleton getInstance() {
        return instance;
    }
}


class EagerMain
{
    public static void main(String args[])
    {
        EagerInitializedSingleton a = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton b = EagerInitializedSingleton.getInstance();

        System.out.println("Value of a = " + a.hashCode());
        System.out.println("Value of b = " + b.hashCode());
    }
}

