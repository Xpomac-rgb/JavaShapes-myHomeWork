package shapes;

public class IsoscelesTrapeze extends Trapeze {
    public IsoscelesTrapeze(double downBase, double upBase, double side,  double height) {
        super(downBase, upBase, side, side, height);
        name = "Равнобедренная " + name;
    }

    @Override
    public double getPerimeter() {
        return 2*thirdSide+firstSide+secondSide;
    }

    @Override
    public double getSquare() {
        return super.getSquare();
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
