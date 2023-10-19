package designPatterns.singleton;


    class LazyInitialized {
        static LazyInitialized instance = null;
        public int x = 10;

        // private constructor can't be accessed outside the class
        private LazyInitialized() {
        }

        // Factory method to provide the users with instances
        public static LazyInitialized getInstance() {
            if (instance == null)
                instance = new LazyInitialized();

            return instance;
        }
    }

    // Driver Class
    class LazyInitializedMain {
        public static void main(String args[]) {
            LazyInitialized a = LazyInitialized.getInstance();
            LazyInitialized b = LazyInitialized.getInstance();
            a.x = a.x + 10;
            System.out.println("Value of a.x = " + a.x);
            System.out.println("Value of b.x = " + b.x);
        }
    }
