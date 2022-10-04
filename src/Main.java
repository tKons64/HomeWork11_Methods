import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

    }

    public static boolean cheakHighYear(int year) {

        boolean itEveryHundredthYear = (year % 100) == 0;
        boolean itEveryFourHundredthYear = (year % 400) == 0;
        boolean itHighYear = (year % 4) == 0;

        if (itEveryHundredthYear) {
            return false;
        }
        else if (itEveryFourHundredthYear) {
            return false;
        }
        else if (itHighYear) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void task1() {

        System.out.println("");
        System.out.println("Задание №1:");

        var year = 2025;
        boolean itHighYear = cheakHighYear(year);

        if (itHighYear) {
            System.out.println(year + " — високосный год");
        }else {
            System.out.println(year + " — не високосный год");
        }
    }

    public static void cheakOS(int deviceYear, byte typeOS) {

        if (typeOS == 0) {
            if (deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (typeOS == 1) {
            if (deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Ошибка работы сайта! Обратитесь к администратору");
        }
    }

    public static void task2() {

        System.out.println("");
        System.out.println("Задание №2:");

        int clientDeviceYear = LocalDate.now().getYear();
        byte typeOS = 0;

        cheakOS(clientDeviceYear, typeOS);

    }

    public static int calculateDeliveryPeriod(int deliveryDistance) {

        int deliveryPeriod = 1;
        if (deliveryDistance > 20) {
            deliveryPeriod++;
        }
        if (deliveryDistance > 60) {
            deliveryPeriod++;
        }
        if (deliveryDistance > 100) {
            System.out.println("На расстоние более 100 км. не доставляем!");
            deliveryPeriod = 0;
        }

        return deliveryPeriod;
    }

    public static void task3() {

        System.out.println("");
        System.out.println("Задание №3:");

        int deliveryDistance = 90;
        int deliveryPeriod = calculateDeliveryPeriod(deliveryDistance);

        if (deliveryPeriod != 0) {
            System.out.println("Потребуется дней: " + deliveryPeriod);
        }
    }

    public static void sortArray(int[] array) {

        int storage = 0;
        int middleArray = 0;

        middleArray = (int) (array.length / 2) + 1;

        for (int i : array) {
            storage = array[i - 1];
            array[i - 1] = array[array.length - i];
            array[array.length - i] = storage;
            if (i == middleArray) {
                break;
            }
        }

    }

    public static void task4() {
        System.out.println();
        System.out.println("Задание №4. Повышенная сложность");

        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));

        sortArray(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void cheakDuplicatesString(String stringToTest) {

        char originalSymbol;
        char duplicateSymbol;

        for (int i = 0; i < stringToTest.length(); i++){
            originalSymbol = stringToTest.charAt(i);
            for (int y = 0; y < stringToTest.length(); y++){
                duplicateSymbol = stringToTest.charAt(y);
                if (i != y && originalSymbol == duplicateSymbol){
                    System.out.println("В исходной строке обнаружен дубль символа: " + duplicateSymbol);
                    return;
                }
            }
        }
    }

    public static void task5() {
        System.out.println();
        System.out.println("Задание №5. Повышенная сложность");

        String initialString = "aabccddefgghiijjkk";
        cheakDuplicatesString(initialString);

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int calculateTotalSum(int[] arr) {
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }

        return totalSum;
    }

    public static double calculateAverageValueInMonth(int totalSum, int length) {
        return (double) totalSum / length;
    }

    public static void calculateAndPrintAverageValueInMonth(int[] arr) {
        int totalSum;
        double averageValueInMonth = 0;

        totalSum = calculateTotalSum(arr);
        averageValueInMonth = calculateAverageValueInMonth(totalSum, arr.length);

        System.out.println("Средняя сумма трат за месяц составила - " + averageValueInMonth + " рублей");
    }

    public static void task6() {
        System.out.println();
        System.out.println("Задание №6. Повышенная сложность");

        int[] arr = generateRandomArray();
        calculateAndPrintAverageValueInMonth(arr);
    }


}