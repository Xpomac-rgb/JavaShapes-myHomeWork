package shapes;

public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(double side, double base) {
        super(side, side, base);
        this.name = "равнобедренный " + this.name;
    }

    @Override
    public double getPerimeter() {
        return firstSide * 2 + thirdSide;
    }

    @Override
    public double getSquare() {
        return thirdSide * Math.sqrt(firstSide * secondSide - Math.pow(thirdSide, 2)/4) / 2;
    }

    @Override
    public String toString() {
        return name
                + "\nБоковая сторона: " + firstSide
                + "\nОснование: " + thirdSide
                + "\nПериметр: " + getPerimeter()
                + "\nПлощадь: " + getSquare()
                + "\n";
    }
}