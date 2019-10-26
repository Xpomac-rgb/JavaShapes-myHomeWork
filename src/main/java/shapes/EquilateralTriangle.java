package shapes;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
        name = "равносторонний " + name;
    }

    @Override
    public double getPerimeter() {
        return firstSide * 3;
    }

    @Override
    public double getSquare() {
        return Math.sqrt(3) / 4 * Math.pow(firstSide, 2);
    }

    @Override
    public String toString() {
        return name
            + "\nСторона: " + firstSide
            + "\nПериметр: " + getPerimeter()
            + "\nПлощадь: " + getSquare()
                + "\n";
    }
}