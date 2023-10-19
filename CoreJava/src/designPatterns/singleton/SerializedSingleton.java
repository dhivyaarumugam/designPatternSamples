package designPatterns.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    protected static Object readResolve() {
        return getInstance();
    }

}

class SerializedMain {
    public static void main(String args[]) {
        //SingletonHelper class is not loaded into memory and only when someone calls the getInstance() method, this class gets loaded and creates the singleton class instance.
        //Can be applied when synchronization is not required
        SerializedSingleton a = SerializedSingleton.getInstance();
        SerializedSingleton b = SerializedSingleton.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
