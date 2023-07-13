// Задание

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

// Решение
// ================================================================================================================

// import java.util.*;
// public class sem5 {
//     public static void main(String[] args) {
//         Map<String, List<String>> phoneBook = new HashMap<>();
//         phoneBook.put("Иван Арбузов", Arrays.asList("81-811", "62-225"));
//         phoneBook.put("Светлана Борисова", Collections.singletonList("33-303"));
//         phoneBook.put("Екатерина Белова", Collections.singletonList("44-344"));
//         phoneBook.put("Анна Володина", Collections.singletonList("45-587"));
//         phoneBook.put("Анна Круглова", Collections.singletonList("12-426"));
//         phoneBook.put("Иван Горин", Collections.singletonList("31-957"));
//         phoneBook.put("Петр Лацков", Collections.singletonList("58-887"));
//         phoneBook.put("Павел Мамаев", Collections.singletonList("99-399"));
//         phoneBook.put("Петр Николаев", Arrays.asList("87-874", "13-552"));
//         phoneBook.put("Мария Осипова", Collections.singletonList("11-722"));
//         phoneBook.put("Марина Орлова", Collections.singletonList("38-444"));
//         phoneBook.put("Мария Савина", Collections.singletonList("59-666"));
//         phoneBook.put("Мария Ракова", Collections.singletonList("37-811"));
//         phoneBook.put("Марина Сысоева", Arrays.asList("66-442", "53-275"));
//         phoneBook.put("Анна Тихомирова", Collections.singletonList("41-033"));
//         phoneBook.put("Иван Ухов", Collections.singletonList("12-404"));
//         phoneBook.put("Петр Федин", Collections.singletonList("30-550"));
//         phoneBook.put("Иван Чижов", Collections.singletonList("54-656"));

//         Map<String, Integer> nameCount = new HashMap<>();
//         for (String name : phoneBook.keySet()) {
//             String firstName = name.split(" ")[0];
//             nameCount.put(firstName, nameCount.getOrDefault(firstName, 0) + 1);
//         }

//         List<Map.Entry<String, Integer>> sortedNames = new ArrayList<>(nameCount.entrySet());
//         Collections.sort(sortedNames, Map.Entry.<String, Integer>comparingByValue().reversed());

//         for (Map.Entry<String, Integer> entry : sortedNames) {
//             if (entry.getValue() > 1) {
//                 System.out.println(entry.getKey() + ": " + entry.getValue());
//             }
//         }
//     }    
// }
