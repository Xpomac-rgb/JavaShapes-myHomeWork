package shapes;

public class Parallelogram extends Quadrangle {
    public Parallelogram(double firstSide, double secondSide, int alba) {
        super(firstSide, secondSide, firstSide, secondSide, alba, 0);
        name="Параллелограмм";
    }

    @Override
    public double getPerimeter() {
        return 2*(firstSide+secondSide);
    }

    @Override
    public double getSquare() {
        double rad=Math.toRadians(alba);
        return firstSide*secondSide*Math.cos(rad);
    }

    @Override
    public String toString() {
        return name
                + "\n Стороны равны " + firstSide + " и " + secondSide
                + "\n Периметр равен " + getPerimeter()
                + "\n Площадь равна " + getSquare()
                + "\n";
    }
}
