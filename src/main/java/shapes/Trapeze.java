package shapes;

public class Trapeze extends Quadrangle {
    public Trapeze(double downBase, double upBase, double thirdSide, double fourthSide, double height) {
        super(downBase, upBase, thirdSide, fourthSide,0, height);
        name="Произвольная трапеция";
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getSquare() {
        return (firstSide+secondSide)/2 * beta;
    }

    @Override
    public String toString() {
        return name
                + "\n Стороны равны " + firstSide + " , " + secondSide + " , "+thirdSide+ " , "+fourthSide
                + "\n Высота равна " + beta
                + "\n Периметр равен " + getPerimeter()
                + "\n Площадь равна " + getSquare()
                + "\n";
    }
}
