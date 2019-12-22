package lesson7.practice;

import java.util.Date;

public class Review {
    private int id;
    private User user;
    private Date publishingDate;
    private int rating;
    private int like;
    private int dislike;
    private String plusText;
    private String minusText;
    private String comment;

    public Review() {
    }

    public Review(int id, User user, Date publishingDate, int rating, int like, int dislike, String plusText, String minusText, String comment) {
        this.id = id;
        this.user = user;
        this.publishingDate = publishingDate;
        this.rating = rating;
        this.like = like;
        this.dislike = dislike;
        this.plusText = plusText;
        this.minusText = minusText;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(Date publishingDate) {
        this.publishingDate = publishingDate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public String getPlusText() {
        return plusText;
    }

    public void setPlusText(String plusText) {
        this.plusText = plusText;
    }

    public String getMinusText() {
        return minusText;
    }

    public void setMinusText(String minusText) {
        this.minusText = minusText;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    Date date = new Date();


    public void printReview() {
        System.out.printf("Рейтинг товара %d звёзд", rating);
        System.out.println();
        System.out.printf("Достоинства: %s", plusText);
        System.out.println();
        System.out.printf("Недостатки: %s", minusText);
        System.out.println();
        System.out.printf("Комментарий: %s", comment);
        System.out.println();
        System.out.printf("like %d, dislike %d", like, dislike);
        System.out.println();
        System.out.printf("%1$s %2$td %2$tB %2$tY", "Дата публикации и время:", date);
        System.out.println();
    }
}
