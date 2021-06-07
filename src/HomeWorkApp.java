public class HomeWorkApp {

    public static void  main (String[] args) {

    PrintThreeWords();

//    int a = 3;
//    int b = -5;
    int sum;

    sum = checkSumSign(3, -5);
    if (sum >= 0) {
        System.out.println("Сумма положительная");
    } else {
        System.out.println("Сумма отрицательная");
    }

        System.out.println(printColor(50));

        System.out.println(compareNumbers(20, 15));


    }

    public static void PrintThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static int checkSumSign(int a, int b) {
        return a + b;
    }

    public static String printColor(int value) {
        if (value <= 0) {
            return "Красный";
        } else if (value > 0 && value <= 100) {
            return "Жёлтый";
        } else {
            return "Зелёный";
        }
    }

    public static String compareNumbers(int a, int b) {
        if (a >= b) {
            return "a>=b";
        } else return "a<b";
    }

}
