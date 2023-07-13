
import java.util.*;

// Задание

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена
// с разными телефонами, их необходимо считать, как одного человека с разными телефонами. 
// Вывод должен быть отсортирован по убыванию числа телефонов.

// Решение
// ===================================================================================================
// public class sem5 {

//     static void sortedPrint(Map<String, ArrayList> map) {
      
//         Set<String> keySet = map.keySet();

//         int maxCount = 0;
//         int minCount = 1_00;
        
//         for (var item : map.entrySet()) {
//             if (maxCount < item.getValue().size())
//                 maxCount = item.getValue().size();
//             if (minCount > item.getValue().size())
//                 minCount = item.getValue().size();  
//         }
         
//         Stack<String> st = new Stack<>();
//         int num = minCount;
//         while (num <= maxCount) {
            
//             for (var item : map.entrySet()) {
//                 if (item.getValue().size() == num) {
//                     st.push(item.getKey());
//                 }  
//             }
//             num += 1;
//         }
        
//         String name;
//         for (int i = 0; i < keySet.size(); i++) {
//             name = st.pop();
//             for (var item : map.entrySet()) {
//                 if (name == item.getKey()) {
//                     System.out.printf("%8s: ", item.getKey());
//                     System.out.println(item.getValue());
//                 }
//             }
//         }
//         System.out.println();
//     }
   
//     public static void main(String[] args) {
        
//         Map<String, ArrayList> abon = new HashMap<>() {
//             {
//                 put("Иванов", new ArrayList<Integer>() {
//                     {
//                         add(87);
//                         add(88);
//                         add(92);
//                     }
//                 });
//                 put("Борисов", new ArrayList<Integer>() {
//                     {
//                         add(12);
//                     }
//                 });
//                 put("Петров", new ArrayList<Integer>() {
//                     {
//                         add(83);
//                         add(23);

//                     }
//                 });
//                 put("Сидоров", new ArrayList<Integer>() {
//                     {
//                         add(89);
//                         add(55);
//                         add(18);
//                         add(99);
//                     }
//                 });
//             }
//         };
//         System.out.println();        
//         System.out.println("Исходные данные: ");
//         sortedPrint(abon);
        
//         Scanner scan = new Scanner(System.in, "cp866");
//         Boolean getOut = false;
//         String st;
//         while (!getOut) {
//             System.out.println("Введите действие (1 - добавить абонента, 9 - выйти из программы):");
//             st = scan.nextLine();
//             String name = "";
//             String phString;
//             switch (st) {
//                 case "1": {
//                     System.out.println("Введите фамилию абонента:");
//                     name = scan.nextLine();
//                     if (abon.containsKey(name)) {
//                         System.out.println("Такая есть. Введите другую!");
//                         System.out.println();
//                         break;
//                     } else {
//                         System.out.println("Введите номера телефонов через запятую: ");
//                         phString = scan.nextLine();
//                         String[] arr = phString.split(",");
//                         ArrayList<Integer> arrInt = new ArrayList<>();
//                         for (String item: arr) {
//                             arrInt.add(Integer.parseInt(item.trim())) ;
//                         }
//                         abon.put(name, arrInt);
//                         System.out.println();
//                         sortedPrint(abon);
//                         break;
//                     }
//                 }
//                 case "9": {
//                     getOut = true;
//                     System.out.println();
//                     System.out.println("До свидания!");
//                     System.out.println();
//                     break;
//                 }   
                    
               
//             }
//         }
//     }

// }
