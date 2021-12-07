public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world! With changes.");
        while (true) {
            try {
                Thread.sleep(10000);
                System.out.println("Tick Java 3");
            } catch (InterruptedException e) {
                // silent catch
            }
        }
    }
}
