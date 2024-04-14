class Vol {
    // Default constructor
    public Vol() {
        System.out.println("This is default constructor");
    }

    // Overloaded methods
    public static void vol(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void vol(float a, float b) {
        System.out.println("Product: " + (a * b));
    }

    // Volume of a cube
    public static void vol(double a) {
        System.out.println("Volume of cube: " + a * a * a);
    }

    // Copy constructor
    public Vol(Vol copy) {
        System.out.println("This is copy constructor");
    }

    public static void main(String args[]) {
        Vol v1 = new Vol(); // Default constructor
        v1.vol(10, 15); // Overloaded method for sum
        v1.vol(10.5f, 15.5f); // Overloaded method for product
        v1.vol(15.5); // Volume of a cube

        // Creating another Vol object using copy constructor
        Vol v2 = new Vol(v1); // Copy constructor
    }
}

