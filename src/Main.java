import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

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
}