// 1 вариант 2 эссе 

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        String formattedName = name.substring(0, 1).toUpperCase()
                + name.substring(1).toLowerCase();

        System.out.println("Привет, " + formattedName + "!");

        scanner.close();
    }
}
