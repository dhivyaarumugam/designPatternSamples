package designPatterns.singleton;

public enum EnumSingleton {
    INSTANCE;

    public static void doSomething() {
            System.out.println("print "+EnumSingleton.INSTANCE);
    }
}

class EnumMain{
    public static void main(String[] args) {
        EnumSingleton.doSomething();
    }
}
