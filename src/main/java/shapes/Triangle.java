package shapes;

public class Triangle extends Shape {
    double firstSide;
    double secondSide;
    double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        super("треугольник");
        if (Validator.validateTriangle(firstSide, secondSide, thirdSide)) {
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
        } else {
            System.out.printf("\n Ошибка таких треуголников не существует!\n");
        }
    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double getSquare() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }

    @Override
    public String toString() {
        return name
                + "\nПервая сторона: " + firstSide
            + "\nВторая сторона: " + secondSide
            + "\nТретья сторона: " + thirdSide
            + "\nПериметр: " + getPerimeter()
            + "\nПлощадь: " + getSquare()
                + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.firstSide, firstSide) != 0) return false;
        if (Double.compare(triangle.secondSide, secondSide) != 0) return false;
        return Double.compare(triangle.thirdSide, thirdSide) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(firstSide);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(secondSide);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(thirdSide);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}