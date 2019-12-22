package lesson9;

public class Main {
    public static void main(String[] args) {

        FractionNumber fractionNumber1 = new FractionNumberImpl(1, 5);
        FractionNumber fractionNumber2 = new FractionNumberImpl(3, 10);
        FractionNumber fractionNumber3 = new FractionNumberImpl(3, 8);
        FractionNumber fractionNumber4 = new FractionNumberImpl(5, 18);
        FractionNumberOperationImpl calc = new FractionNumberOperationImpl();

        FractionNumber result0 = calc.add(fractionNumber1, fractionNumber2);
        System.out.println(result0);
        FractionNumber result1 = calc.sub(fractionNumber1, fractionNumber2);
        System.out.println(result1);
        FractionNumber result2 = calc.mul(fractionNumber1, fractionNumber2);
        System.out.println(result2);
        FractionNumber result3 = calc.div(fractionNumber1, fractionNumber2);
        System.out.println(result3);

        FractionNumber result4 = calc.add(fractionNumber3, fractionNumber4);
        System.out.println(result4);
        FractionNumber result5 = calc.sub(fractionNumber3, fractionNumber4);
        System.out.println(result5);
        FractionNumber result6 = calc.mul(fractionNumber3, fractionNumber4);
        System.out.println(result6);
        FractionNumber result7 = calc.div(fractionNumber3, fractionNumber4);
        System.out.println(result7);
    }

}
