package lesson3;

public class Main4 {
    public static void main(String[] args) {
        String text = "qwerty plus three and two";
        System.out.println(text.length());

        String[] words = text.split(" ");
        for(int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}
