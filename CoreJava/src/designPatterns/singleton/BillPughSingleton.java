package designPatterns.singleton;

 class BillPughSingleton {
    private BillPughSingleton(){}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}


// Driver Class
class BillPughMain {
    public static void main(String args[]) {
        //SingletonHelper class is not loaded into memory and only when someone calls the getInstance() method, this class gets loaded and creates the singleton class instance.
        //Can be applied when synchronization is not required
        BillPughSingleton a = BillPughSingleton.getInstance();
        BillPughSingleton b = BillPughSingleton.getInstance();
    }
}
