public class Methods {
    public static void main(String[] args) {
        String firstName = "Sujit";
        int x = 7, y = 8;

        greet(firstName);
        System.out.println(add(x, y));
    }

    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    static int add(int a, int b) {
        return a + b;
    }

}

