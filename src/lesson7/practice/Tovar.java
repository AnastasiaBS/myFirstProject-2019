package lesson7.practice;

public class Tovar {
    private int vendorCode;
    private String name;
    private int fullPrice;
    private int discount;
    private Photo[] photos = new Photo[20];
    private String additionally;
    private Review[] reviews = new Review[2000];

    public Tovar() {
    }

        public Tovar(int vendorCode, String name, int fullPrice, int discount, String additionally) {
        this.vendorCode = vendorCode;
        this.name = name;
        this.fullPrice = fullPrice;
        this.discount = discount;
        this.additionally = additionally;
    }

    public void addPhoto(Photo photo) {
        for (int i = 0; i < photos.length; i++) {
            if (photos[i] == null) {
                photos[i] = photo;
                break;

            }

    }
}

    public int getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getAdditionally() {
        return additionally;
    }

    public void setAdditionally(String additionally) {
        this.additionally = additionally;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public Review[] getReviews() {
        return reviews;
    }

    public void setReviews(Review[] reviews) {
        this.reviews = reviews;
    }

    public void printTovar() {
        System.out.printf("Товар: %s, полная цена - %d, скидка - %d ", name, fullPrice, discount);
        System.out.println((char)37);
        System.out.printf("%s", additionally);
        System.out.println();
        for (Photo photo : photos) {
            if (photo != null) {
                System.out.printf("Фото: путь к фото 1 - %s, путь к фото 2 - %s", photo.getPathToSmallPhoto(), photo.getPathToBigPhoto());
                System.out.println();

            }

        }

    }
}
