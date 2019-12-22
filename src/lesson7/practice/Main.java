package lesson7.practice;
// доделать отзывы, вернуть общий рейтинг товара

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Photo photo1 = new Photo();
        photo1.setPathToSmallPhoto("https://avatars");
        photo1.setPathToBigPhoto("https://avatarsejifekjlfksdjckjzvozjfs");

        Photo photo2 = new Photo();
        photo2.setPathToSmallPhoto("https://avatarlkdjhds");
        photo2.setPathToBigPhoto("https://avatars");

        Tovar tablet = new Tovar();
        tablet.setFullPrice(8990);
        tablet.setDiscount(22);
        tablet.setName("Графический планшет");
        tablet.setAdditionally("Гарантийный срок - 2 г.\n" + "Страна производства - Китай");
        tablet.addPhoto(photo1);
        tablet.addPhoto(photo2);
        tablet.printTovar();

        User user1 = new User();
        user1.setName("Виталий");
        user1.setSurname("Корнеев");
        user1.setDateRegister(new Date ());
        user1.printUser();



        Review user = new Review();
        user.setComment("Соотношение цена-качество вполне устроило, Для работы в фотошопе самое то!");
        user.setRating(5);
        user.setPlusText("Симпатичная модель, много полезных функций! Ручка хорошо пишет даже с наклоном, делать рисунки и записи, работать с фото — одно удовольствие. Кнопки маленькие, но удобные.");
        user.setMinusText("Пока не обнаружил.");
        user.setLike(1);
        user.setDislike(1);
        user.printReview();


    }
}
