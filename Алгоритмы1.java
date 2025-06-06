// 1 вариант 3 эссе 

import java.util.Scanner;

public class SpecialNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для проверки: ");
        int number = scanner.nextInt();

        System.out.print("Введите начальную степень: ");
        int startPower = scanner.nextInt();

        if (isSpecialNumber(number, startPower)) {
            System.out.println("Такая ситуация возможна!");
        } else {
            System.out.println("Такая ситуация невозможна.");
        }

        scanner.close();
    }

    public static boolean isSpecialNumber(int number, int startPower) {
        String numStr = Integer.toString(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }

        int sum = 0;
        int currentPower = startPower;
        for (int digit : digits) {
            sum += Math.pow(digit, currentPower);
            currentPower++;
        }

        if (sum % number == 0) {
            int multiplier = sum / number;
            System.out.printf("%d^%d", digits[0], startPower);
            for (int i = 1; i < digits.length; i++) {
                System.out.printf(" + %d^%d", digits[i], startPower + i);
            }
            System.out.printf(" = %d = %d * %d%n", sum, number, multiplier);
            return true;
        }

        return false;
    }
}
}
