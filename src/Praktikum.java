import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            // здесь нужно вывести результат
            System.out.println("12.09." + year);
        } else {
            System.out.println("13.09." + year);
        }
    }

    public static boolean isLeapYear(int year) {
        // здесь нужно определить, является ли переданный год високосным
        if (year % 100 != 0) {  // Проверяем кратность на 100 (високосный год не доожен быть кратен 100)
            if (year % 4 == 0) { // Проверяем кратность на 4 и получаем Y (високосный), N (не високосный)
                return true;
            }
            return false;
        } else if (year % 400 == 0) { // Проверяем на кратность 400 и получаем Y (високосный), N (не високосный)
            return true;
        }
        return false;
    }
}