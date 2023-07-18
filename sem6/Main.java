package sem6;
    
public class Main {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        Cat[] groupOfCats = {
                myCat,
                new Cat("Мурка", "Д", "Белый", 4),
                new Cat("Гаусс", "М", "Рыжий", 6)
        };

        myCat.setName("Маркиз");
        myCat.setGender("М");
        myCat.setColour("Черный");
        myCat.setAge(14);

        for (int i = 0; i < groupOfCats.length; i++) System.out.println(groupOfCats[i].toString(i + 1));

        System.out.println("Общие данные:");
        System.out.println(Cat.getGenderQuantity(groupOfCats));
        System.out.println("Наибольший возрат из " + groupOfCats.length + "  котов - " + Cat.getLargestAge(groupOfCats) + " лет");        
    }
}
