// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// Решение :

// import java.util.Scanner;
// public class sem1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Введите число: ");
//         int n = sc.nextInt();
//         int sum = 0;
//         int f = 1;
//         for (int i = 1; i<=n; i++){
//              sum+=i;            
//              f*=i;
//             }
//         System.out.println(sum);
//         System.out.println(f);
//         sc.close();

//     }
// }

// 2) Вывести все простые числа от 1 до 1000
// Решение

// import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.List;

// public class sem1 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Введите положительное число: ");
//         int input = scanner.nextInt();
//         scanner.close();
//         List<Integer> primes = new ArrayList<>();

//         for (int i = 2; i <= input; i++) {
//             boolean isPrimeNumber = true;

//             for (int j = 2; j < i; j++) {
//                 if (i % j == 0) {
//                     isPrimeNumber = false;
//                     break;
//                 }
//             }

//             if (isPrimeNumber) {
//                 primes.add(i);
//             }
//         }
//         System.out.println("Простые числа: " + primes);
//     }
// }
