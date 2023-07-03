// Задание
// 1) Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg
// =================================================================================================================

// Решение

// import java.io.File;
// import java.util.ArrayList;
// import java.util.List;

// public class sem2 {
//     public static void main(String[] args) {
//         List<String> files = get_files();
//         for (String file : files)
//             System.out.println(file + " - Расширение: " + get_extention(file));
//     }
    
//     public static String get_extention(String file) {
//         int index = file.lastIndexOf(".");
//         if (index == -1)
//             return "";
//         return file.substring(index + 1);
//     }
    
//     public static List<String> get_files() {

//         File dir = new File(".");

//         File[] files;
//         try {
//             files = dir.listFiles();
//         } catch (Exception ex) {
//             ex.printStackTrace();
//             return null;
//         }
//         if (files == null)
//             return null;

//         List<String> list = new ArrayList<String>();
//         for (File file : files)
//             if (file.isFile())
//                 list.add(file.getName());

//         return list;
//     }
// }
// ------------------------------------------------------------------------------------------------------------------------------
// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

// Решение

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class sem2 {
    static String convertArrayToString(int []arr) {
        StringBuilder stb = new StringBuilder();
        for (int element : arr) {
            stb.append(element).append(" ");
        }
        return stb.toString();
    }

    static void sortByBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            writeToFile(convertArrayToString(arr));
        }
    }

    static void writeToFile( String line) {
        try (FileWriter fw = new FileWriter("fileForArray.txt", true)) {
            fw.write(line);
            fw.write("\n");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static int[] convertFromStringToInt(String [] arr) {
        int [] arrayResult = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrayResult[i] = Integer.parseInt(arr[i]);
        }
        return arrayResult;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Введите числа через зпт: ");
        String numbers = scn.nextLine();
        numbers = numbers.replace(" ", "");
        String [] arrayNumbers = numbers.split(",");
        sortByBubble(convertFromStringToInt(arrayNumbers));
        scn.close();
    }
}