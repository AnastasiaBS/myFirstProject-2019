package lesson9;

public class FractionNumberOperationImpl implements FractionNumberOperation {


    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException("Число 1 или число 2 - пусты");
        }
        int numerator = (a.getDividend() * b.getDivisor()) + (b.getDividend() * a.getDivisor());
        int denominator = a.getDivisor() * b.getDivisor();
        int x = 0;
        do {
            x = 0;
            for (int i = numerator; i > 0; i--) {
                if (numerator % i == 0 && denominator % i == 0) {
                    numerator /= i;
                    denominator /= i;
                    x++;
                }
            }
        } while (x == 0);
        if (numerator > denominator && numerator % denominator != 0) {
        }
        FractionNumberImpl result = new FractionNumberImpl(numerator, denominator);
        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException("Число 1 или число 2 - пусты");
        }
        int numeratorSub = (a.getDividend() * b.getDivisor()) - (b.getDividend() * a.getDivisor());
        int denominatorSub = a.getDivisor() * b.getDivisor();
        int y = 0;
        do {
            y = 0;
            for (int i = 11; i > 0; i--) {
                if (numeratorSub % i == 0 && denominatorSub % i == 0) {
                    numeratorSub /= i;
                    denominatorSub /= i;
                    y++;
                }
            }
        } while (y == 0);
        if (numeratorSub > denominatorSub && numeratorSub % denominatorSub != 0) {
        }
        FractionNumberImpl result = new FractionNumberImpl(numeratorSub, denominatorSub);
        return result;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException("Число 1 или число 2 - пусты");
        }
        int numeratorMul = a.getDividend() * b.getDividend();
        int denominatorMul = a.getDivisor() * b.getDivisor();
        int j = 0;
        do {
            j = 0;
            for (int i = numeratorMul; i > 0; i--) {
                if (numeratorMul % i == 0 && denominatorMul % i == 0) {
                    numeratorMul /= i;
                    denominatorMul /= i;
                    j++;
                }
            }
        } while (j == 0);
        if (numeratorMul > denominatorMul && numeratorMul % denominatorMul != 0) {
        }
        FractionNumberImpl result = new FractionNumberImpl(numeratorMul, denominatorMul);
        return result;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        if (a == null || b == null) {
            throw new NullPointerException("Число 1 или число 2 - пусты");
        }
        if (a.getDivisor() == 0 || b.getDivisor() == 0) {
            throw new ArithmeticException("Деление на 0 запрещено!");
        }
        int numeratorDiv = a.getDividend() * b.getDivisor();
        int denominatorDiv = a.getDivisor() * b.getDividend();
        int l = 0;
        do {
            l = 0;
            for (int i = 11; i > 0; i--) {
                if (numeratorDiv % i == 0 && denominatorDiv % i == 0) {
                    numeratorDiv /= i;
                    denominatorDiv /= i;
                    l++;
                }
            }
        } while (l == 0);
        if (numeratorDiv > denominatorDiv && numeratorDiv % denominatorDiv != 0) {
        }
        FractionNumberImpl result = new FractionNumberImpl(numeratorDiv, denominatorDiv);
        return result;
    }
}
