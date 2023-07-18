// package sem6;

// public class Cat {

//     private String name, gender, colour;
    
//     private int age;

//     public Cat(String name, String gender, String colour, int age) {
//         this.name = name;
//         this.gender = gender;        
//         this.colour = colour;        
//         this.age = age;
//     }

//     public Cat() {
//     }
    
//     public static int getLargestAge(Cat[] array) {
//         int max = 0;
//         for (int i = 0; i < array.length; i++) if (max < array[i].getAge()) max = array[i].getAge();
//         return max;
//     }
    
//     public static String getGenderQuantity(Cat[] array) {
//         int male = 0, female = 0;
//         for (int i = 0; i < array.length; i++) {
//             if (array[i].getGender().equals("Д")) female++;
//             else male++;
//         }
//         return "М: " + male + "\nД: " + female;
//     }

//     public String toString(int number) {
        
//         return "№ по п/п: " + number + "\n" +
//                 "Кличка: " + name + "\n" +
//                 "Пол: " + gender + "\n" +                
//                 "Цвет: " + colour + "\n" +
//                 "Возраст: " + age + "\n" ;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getGender() {
//         return gender;
//     }

//     public void setGender(String gender) {
//         this.gender = gender;
//     }
    
//     public String getColour() {
//         return colour;
//     }

//     public void setColour(String colour) {
//         this.colour = colour;
//     }
    
//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }    
// }
