// Задание
// 1) Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg
// =================================================================================================================

// Решение

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class sem2 {
    public static void main(String[] args) {
        List<String> files = get_files();
        for (String file : files)
            System.out.println(file + " - Расширение: " + get_extention(file));
    }
    
    public static String get_extention(String file) {
        int index = file.lastIndexOf(".");
        if (index == -1)
            return "";
        return file.substring(index + 1);
    }
    
    public static List<String> get_files() {

        File dir = new File(".");

        File[] files;
        try {
            files = dir.listFiles();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
        if (files == null)
            return null;

        List<String> list = new ArrayList<String>();
        for (File file : files)
            if (file.isFile())
                list.add(file.getName());

        return list;
    }
}