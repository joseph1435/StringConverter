public class Main {

    // Access Modifier Example
    private static String privateMessage = "This is a private static message";
    public static String publicMessage = "This is a public static message";

    // Static Nested Class
    static class Outer {

        private String outerMessage = "Hello from Outer class";

        // Non-static inner class
        class Inner {
            void display() {
                System.out.println("Accessing outer class message from Inner: " + outerMessage);
            }
        }

        // Method demonstrating anonymous class
        void greet() {
            // Anonymous class implementing Runnable interface
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Hello from Anonymous Class running Runnable!");
                }
            };

            r.run();
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Access Modifiers Example:");
        System.out.println(publicMessage);
        System.out.println(privateMessage);

        System.out.println("\nNested Class Example:");
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();

        System.out.println("\nAnonymous Class Example:");
        outer.greet();
    }
}
