package sem3;
// Задание 1

// 1. Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

// ===========================================================================================================================
// Решение

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Random;
// import java.util.Scanner;

// public class sem3 {
//     public static void main(String[] args) throws Exception {
//         System.out.print("Введите длину списка N: ");
//         try (Scanner iScanner = new Scanner(System.in)) {
//             int N = iScanner.nextInt();
//             ArrayList<Integer> a = new ArrayList<Integer>();
//             Random ran = new Random();
            
//             for (int i = 0; i < N; i++) {
//                 int x = ran.nextInt(N);
//                 a.add(x);
//             }
//             System.out.println("Заданный список : \n " + a);

//             for (int i = a.size() - 1; i >= 0; i--) {
//                 int even = a.get(i) % 2;
//                 if (even == 0) {
//                     System.out.println("Четное число: " + a.get(i));
//                     a.remove(i);
//                 }
//             }
//             Collections.sort(a);
//             System.out.println("Требуемый список: \n " + a);

//             int min = a.get(0);
//             int max = a.get(0);
//             float sum = 0;
//             for (int i = 0; i < a.size(); i++) {
//                 int num = a.get(i);
//                 if (num < min) {
//                     min = num;
//                 }
//                 if (num > max) {
//                     max = num;
//                 }
//                 sum += num;
//             }
//             float average = sum / a.size();

//             System.out.println("Мин. значение: " + min);
//             System.out.println("Макс. значение: " + max);
//             System.out.println("Среднее значение: " + average); 
      
//         }
//     }

// }

// -----------------------------------------------------------------------------------------------------------------
// Задание 2

// Для списка из задачи про Солнечную систему удалить все повторяющиеся элементы.
// ====================================================================================================================
// Решение

// import java.util.*;

// public class sem3 {
//     public static void main(String[] arg) {
//         planetsCounter(5);
    
//     }

//     static void planetsCounter(int n){
//         List<String> listPlanets = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter");
//         List<String> randPlanets = new ArrayList<String>(n);
//         Set<String> set = new HashSet<>(randPlanets);
//         int[] counts = new int[listPlanets.size()];

//         Random rand = new Random();

//         for (int i = 0; i < n; i++) {
//             randPlanets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
//             System.out.print(randPlanets.get(i) + " ");
//             counts[listPlanets.indexOf(randPlanets.get(i))]++;
//         }
//         System.out.println();
//         for (int i = 0; i < counts.length; i++) {
//             System.out.printf("%s - %s\n", listPlanets.get(i), counts[i]);
//         }  
//     }   
// }


