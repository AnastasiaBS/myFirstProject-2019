package lesson3;

public class Main5 {
    public static void main(String[] args) {
        String password = "fg8jKlvfdh";

        if (password.length() < 8) {
            System.out.println("Пароль меньше восьми символов не принимается.");
            return;
        }
        boolean haveNumber = false;
        for (int i = 0; i < 10; i++) {
            if (password.indexOf("" + i) != -1) {
                haveNumber = true;
            }
        }
        if (haveNumber == false) {
            System.out.println("Пароль должен содержать хотя-бы одну цифру");
        }


        boolean hasUpperCase = !password.equals(password.toLowerCase());
        if (!hasUpperCase) {
            hasUpperCase = false;
            System.out.println("Пароль должен содержать хотя-бы одну заглавную букву");
        }

        if (haveNumber == true && hasUpperCase == true) {
            System.out.println("Отличный пароль!");
        }


    }

}