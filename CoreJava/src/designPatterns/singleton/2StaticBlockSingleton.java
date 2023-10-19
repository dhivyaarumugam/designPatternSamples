package designPatterns.singleton;

class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

     static StaticBlockSingleton getInstance() {
        return instance;
    }
}

class StaticBlockMain
{
    public static void main(String args[])
    {
        StaticBlockSingleton a = StaticBlockSingleton.getInstance();
        StaticBlockSingleton b = StaticBlockSingleton.getInstance();

        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }
}