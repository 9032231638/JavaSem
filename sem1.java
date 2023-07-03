// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// Решение :

import java.util.Scanner;

public class sem1 {
    static int getTriangleNumber(int n) {
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum += index + 1;
        }
        return sum;
    }

    static int getFactorial(int n) {
        int result = 1;
        for (int index = 0; index < n; index++) {
            result *= index + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        System.out.printf("Введите натуральное число: ");
        if (!scn.hasNextInt()) {
            System.out.println("Неверное число !");
        } else {
            n = scn.nextInt();
            if (n < 1)
                System.out.println("Введите положительное число !");
            else {
                System.out.printf("Ссума из %d = %s ", n, getTriangleNumber(n));
                System.out.println();
                System.out.printf("Произведение из %d = %s ", n, getFactorial(n));
            }
        }
        scn.close();
    }
}

