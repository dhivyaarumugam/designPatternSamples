package designPatterns.basicJava;

// Class 1
class CopyConstructor {

    // Class data members
    private double re, im;

    // Constructor 1
    // Parameterized constructor
    public CopyConstructor(double re, double im)
    {

        // this keyword refers to current instance itself
        this.re = re;
        this.im = im;
    }

    // Constructor 2
    // Copy constructor
    CopyConstructor(CopyConstructor c)
    {

        System.out.println("Copy constructor called");

        re = c.re;
        im = c.im;
    }

    // Overriding the toString() of Object class
    @Override public String toString()
    {

        return "(" + re + " + " + im + "i)";
    }
}

// Class 2
// Main class
 class Main {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of above class
        CopyConstructor c1 = new CopyConstructor(10, 15);

        // Following involves a copy constructor call
        CopyConstructor c2 = new CopyConstructor(c1);

        // Note: Following doesn't involve a copy
        // constructor call
        // as non-primitive variables are just references.
        CopyConstructor c3 = c2;

        // toString() of c2 is called here
        System.out.println(c2);
    }
}