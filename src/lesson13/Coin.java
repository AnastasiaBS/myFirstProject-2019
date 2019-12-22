package lesson13;

public class Coin implements Comparable<Coin> {
    private int diameter;
    private int year;
    private int nominal;

    public Coin() {
    }


    public Coin(int diameter, int year, int nominal) {
        this.diameter = diameter;
        this.year = year;
        this.nominal = nominal;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "diameter=" + diameter +
                ", year=" + year +
                ", nominal=" + nominal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coin)) return false;

        Coin coin = (Coin) o;

        if (getDiameter() != coin.getDiameter()) return false;
        if (getYear() != coin.getYear()) return false;
        return getNominal() == coin.getNominal();
    }

    @Override
    public int hashCode() {
        int result = getDiameter();
        result = 31 * result + getYear();
        result = 31 * result + getNominal();
        return result;
    }

    @Override
    public int compareTo(Coin o) {
        int year1 = this.year;
        int year2 = o.year;
        if (year1 != year2) {
            int result = year2 - year1;
            return result;
        }
        int nominal1 = this.nominal;
        int nominal2 = o.nominal;

        if (nominal1 != nominal2) {
            return nominal2 - nominal1;
        }
        return o.diameter - this.diameter;

    }
}
