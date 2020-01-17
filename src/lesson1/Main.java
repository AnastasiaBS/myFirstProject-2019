package lesson1;

public class Main {
    public static void main(String[] args) {
        int sweets = 11;
        int children = 2;
        int ostatokKonfetBRukax = sweets % children;

        if (ostatokKonfetBRukax == 0) {
            System.out.println("Конфет раздали поровну");
        }
        if (ostatokKonfetBRukax != 0) {
            System.out.println("Конфет НЕ раздали поровну");
        }
    }
}
