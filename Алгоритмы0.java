// 1 вариант 1 эссе 

import java.util.Scanner;

public class Main {  // Изменили название класса на Main

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размеров матрицы
        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int cols = scanner.nextInt();

        // Создание и ввод исходной матрицы
        int[][] matrix = new int[rows][cols];
        System.out.println("Введите элементы матрицы построчно:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Транспонирование матрицы
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }

        // Вывод результата
        System.out.println("Транспонированная матрица:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();  // Закрываем Scanner
    }
}
