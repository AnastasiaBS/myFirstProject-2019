package lesson5;

public class TourUtils {
    public static void printToursByCountry(String[][] tours, String inputCountry) {
        for (int i = 0; i < tours.length; i++) {
            if (inputCountry.equals(tours[i][1])) {
                System.out.printf("Тур: %s - %s, цена - %s, %s", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
                System.out.println();
            }
        }
    }

    public static void printToursFromToPrice(int from, int to, String[][] toursFromTo) {
        for (int i = 0; i < toursFromTo.length; i++) {
            int priceTour = Integer.parseInt(toursFromTo[i][2]);
            if (priceTour >= from && priceTour <= to) {
                System.out.printf("Тур: %s - %s, цена - %s, %s", toursFromTo[i][0], toursFromTo[i][1], toursFromTo[i][2], toursFromTo[i][3]);
                System.out.println();
            }
        }
    }
    // 1 - напечатать самый дорогой тур

    public static void printMostExpensiveTour(String[][] tours) {
        int numberTour = 0;
        int maxCost = 0;
        for (int i = 0; i < tours.length; i++) {
            int priceTour = Integer.parseInt(tours[i][2]);
            if (priceTour > maxCost) {
                maxCost = priceTour;
                numberTour = i;
            }
        }
        System.out.printf("Самый дорогой тур: %s - %s, цена %s, %s %s", tours[numberTour][0], tours[numberTour][1], tours[numberTour][2], tours[numberTour][3], tours[numberTour][4]);
        System.out.println();
    }

// 2 - все туры от .... звезд ... страны

    public static void printByNumberOfStars(String[][] tours, String fromCountry, int fromStars) {
        for (int i = 0; i < tours.length; i++) {
            int stars = Integer.parseInt(tours[i][3]);
            if (fromCountry.equals(tours[i][1]) && fromStars <= stars) {
                System.out.printf("Тур: %s - %s, цена - %s, %s %s", tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4]);
                System.out.println();
            }
        }

    }
    // 3 - самый дешевый тур в .... страну

    public static void printMostCheapTour(String[][] tours, String intCountry) {
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < tours.length; i++) {
            if (intCountry.equals(tours[i][1])) {
                int priceTour = Integer.parseInt(tours[i][2]);
                minCost = Math.min(minCost, priceTour);
            }

        }
        System.out.println("Стоимость самого дешевого тура составит " + minCost + " рублей.");

    }

// *4 - средняя стоимость тура в ... страну

    public static void printAverageCost(String[][] tours, String fromCountry) {
        int total = 0;
        int country = 0;
        for (int i = 0; i < tours.length; i++) {
            if (fromCountry.equals(tours[i][1])) {
                country++;
                total = total + Integer.parseInt(tours[i][2]);
            }
        }
        int average = total / country;
        System.out.println("Средняя стоимость тура составит " + average + " рублей.");
    }
}
