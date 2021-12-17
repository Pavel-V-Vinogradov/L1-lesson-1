public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void compareNumbers() {
        int a = 123;
        int b = 356;
        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }
    }

    private static void printColor() {
        int value = 7;
        if (value <= 0) {
            System.out.println("Красный");
        } else if(value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    private static void checkSumSign() {
        int a = 123;
        int b = 456;
        System.out.println(a + b > 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}
