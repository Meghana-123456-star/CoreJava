public class Methods{
    public  static void greet(){
        System.out.println("Hello Java");
    }
     public static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {

        // Calling method without parameter
        greet();

        // Calling method with parameter
        greet("Chinnu");
    }
}