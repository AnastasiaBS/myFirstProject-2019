package lesson7;

public class Tiger {
    private int age;
    private int cost;
    private String name;
    private String breed;

    public Tiger() {

    }
    public Tiger(int age, String name, int cost, String breed) {
        this.age = age;
        this.name = name;
        this.cost = cost;
        this.breed = breed;

    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}
