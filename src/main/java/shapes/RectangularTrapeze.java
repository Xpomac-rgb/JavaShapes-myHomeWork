package shapes;

public class RectangularTrapeze extends Trapeze {
    public RectangularTrapeze(double downBase, double upBase, double thirdSide,double fourthSide  ) {
        super(downBase, upBase, thirdSide, fourthSide, thirdSide);
        name = "Прямоугольная " + name;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getSquare() {
        return (firstSide+secondSide)/2*thirdSide;
    }

    @Override
    public String toString() {
        return name
                + "\n Стороны равны " + firstSide + " , " + secondSide + " , "+thirdSide+ " , "+fourthSide
                + "\n Высота равна " + thirdSide
                + "\n Периметр равен " + getPerimeter()
                + "\n Площадь равна " + getSquare()
                + "\n";
    }
}
