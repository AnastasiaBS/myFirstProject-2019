package lesson8;

public class Main1 {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        tiger.setName("Вася");

        Tiger tiger1 = new Tiger();
        tiger1.setName("Коля");

        Monkey monkey = new Monkey();
        monkey.setName("Петя");

        Monkey monkey1 = new Monkey();
        monkey1.setName("Федя");

        Animal[] animals = new Animal[4];
        animals[0] = tiger;
        animals[1] = tiger1;
        animals[2] = monkey;
        animals[3] = monkey1;

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }


    }
}
