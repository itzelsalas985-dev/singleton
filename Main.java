public class Main {
    public static void main(String[] args) {
        // Different parts of the code create their own config...
        AppConfig config1 = new AppConfig();
        AppConfig config2 = new AppConfig();

        config1.setTheme("Dark"); // Change setting in one object...

        config1.printConfig();
        config2.printConfig(); // ...but the other object is unaware! This is bad.

        System.out.println("Are these the same instance? " + (config1 == config2));
    }
}