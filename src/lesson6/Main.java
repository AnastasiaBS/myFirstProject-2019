package lesson6;

public class Main {
//    public static void main(String[] args) {
//        String source = "Алгоритмы+Данные=Программы";
//        // Определяем позицию символа '+‘
//        int p1 = source.indexOf('+');
//        // Определяем позицию символа '=‘
//        int p2 = source.indexOf('=');
//        // Вырезаем первое слово
//        String alg = source.substring(0, p1);
//        // Вырезаем второе слово
//        String dat = source.substring(p1 + 1, p2);
//        // Вырезаем третье слово
//        String prg = source.substring(p2 + 1);
//        // Сшиваем все по-новому
//        String target = alg + "=" + prg + "-" + dat;
//        System.out.println(target);
//
//    }

    public static void main(String[] args) {
        String s1 = "qwe12qwe345qwe678qwe90qwe";
        String s2 = "qwe";
        StringBuffer s = new StringBuffer(s1);
        int p = -1;
        while ( (p = s.toString().indexOf(s2)) >= 0 ) {
            s.delete(p, p + s2.length());
        }
        s1 = s.toString();
        System.out.println(s1);

    }
}
