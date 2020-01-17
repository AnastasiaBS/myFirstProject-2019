package lesson15;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(170);
            System.out.println("Успех");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Указан неверный возраст!");
        }
        System.out.println("Конец");

    }
}
