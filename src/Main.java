public class Main {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon("Sardelka", 100);
        Dragon dragon2 = new Dragon("Toothless", 333);

        dragon2.fire(dragon1);
        dragon1.fire(dragon2);

    }
}
