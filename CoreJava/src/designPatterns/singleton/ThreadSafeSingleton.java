package designPatterns.singleton;

class BasicSingleton
{
    static BasicSingleton instance = null;
    public int x = 10;

    // private constructor can't be accessed outside the class
    private BasicSingleton() {  }

    // Factory method to provide the users with instances
    //synchronized key makes it thread safe
    static public synchronized BasicSingleton getInstance()
    {
        if (instance == null)
            instance = new BasicSingleton();

        return instance;
    }

    static BasicSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (BasicSingleton.class) {
                if (instance == null) {
                    instance = new BasicSingleton();
                }
            }
        }
        return instance;
    }
}

// Driver Class
class ThreadSafeSingletonMain
{
    public static void main(String args[])
    {
        BasicSingleton a = BasicSingleton.getInstance();
        BasicSingleton b = BasicSingleton.getInstance();
        BasicSingleton c = BasicSingleton.getInstanceUsingDoubleLocking();
        BasicSingleton d = BasicSingleton.getInstanceUsingDoubleLocking();

        a.x = a.x + 10;
        System.out.println("Value of a.x = " + a.x);
        System.out.println("Value of b.x = " + b.x);
        System.out.println("Value of c.x = " + c.x);
        System.out.println("Value of d.x = " + d.x);
    }
}