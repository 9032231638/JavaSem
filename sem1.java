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
//         System.out.println("Сумма = " + sum);
//         System.out.println("Произведение = " + f);
//         sc.close();
//     }
// }
// __________________________________________________________________________________________________________________________________________________________________________

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
// ===================================================================================================================================================

// 3) Реализовать простой калькулятор

// Решение

// import java.util.Scanner;
// public class sem1 {
//    public static void main(String[] args) {
//       int num1;
//       int num2;
//       int ans;
//       char op;
//       Scanner scanner = new Scanner(System.in);
//       System.out.print("Введите два числа через пробел: ");
//       num1 = scanner.nextInt();
//       num2 = scanner.nextInt();
//       System.out.print("\nEnter an operator (+, -, *, /): ");
//       op = scanner.next().charAt(0);
//       switch(op) {
//          case '+': ans = num1 + num2;
//             break;
//          case '-': ans = num1 - num2;
//             break;
//          case '*': ans = num1 * num2;
//             break;
//          case '/': ans = num1 / num2;
//             break;
//          default:  System.out.printf("Ошибка");
//             return;
//       }
//       System.out.print("\nОтвет:\n");
//       System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
//    }
// }
// ==========================================================================================================
// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

// Решение 1 вариант

// public class sem1 {
//     public static void main(String[] args) {

//         System.out.println("\n\nЗадано выражение: 2? + ?5 = 69 . Восстановить выражение до верного равенства.");
//         int count = 0;
//         for (int i = 0; i < 10; i++) {
//             for (int j = 0; j < 10; j++) {
//                 if (20 + i + j * 10 + 5 == 69) {
//                     count += 1;
//                     System.out.println(count + ") 2" + i + " + " + j + "5" + " = 69");
//                 }
//             }
//         }
//         System.out.println("\n");
//         if (count == 0) {
//             System.out.println("Решений нет\n");
//         }

//     }
// }

// решение вар 2
// import java.util.Scanner;

// public class sem1 {
//     static boolean isRightEquation(String q, String w, String e) {
//         int a = Integer.parseInt(q);
//         int b = Integer.parseInt(w);
//         int c = Integer.parseInt(e);
//         if (a + b == c) {
//             return true;
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.printf("Введите уравнение в виде (q + w = e): ");
//         String equation = scn.nextLine();
//         equation = equation.replace(" ", "");
//         String[] numbersArray = equation.split("[+=]");
//         boolean isCorrectInput = true;

//         for (String element : numbersArray) {
//             element = element.replace("?", "0");
//             int number = Integer.parseInt(element);
//             if (number < 0) {
//                 isCorrectInput = false;
//                 break;
//             }           
//         }

//         if (!isCorrectInput || numbersArray.length != 3) {
//             System.out.println("Введено неправильное уравнение");
//         } else {
//             boolean isSolution = false;
//             for (int x = 0; x < 10; x++) {
//                 String[] tempArray = numbersArray.clone();
//                 for (int i = 0; i < 3; i++) {
//                     String c = Integer.toString(x);
//                     tempArray[i] = tempArray[i].replace("?", c);
//                 }

//                 if (isRightEquation(tempArray[0], tempArray[1], tempArray[2])) {
//                     System.out.printf("%s + %s = %s", tempArray[0], tempArray[1], tempArray[2]);
//                     isSolution = true;
//                     break;
//                 }                
//             }
//             if (! isSolution) {
//                System.out.println("Нет решения"); 
//             } 
//         }
//         scn.close();
//     }
// }


