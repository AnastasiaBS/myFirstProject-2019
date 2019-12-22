package lesson3;

public class Main3 {
    public static void main(String[] args) {
        char[] chars = {'q', 'a', 'e', '\\' , '8', '\''};
        for (char currentElement : chars) {
            if(currentElement == 'a' || currentElement == 'e' || currentElement == 'i') {
                System.out.println(currentElement);
            }
        }
    }
}
