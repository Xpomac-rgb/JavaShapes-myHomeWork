package shapes;

public class Square extends Quadrangle{
    public Square(double side){
        super(side,side,side,side,90,90);
        name = "Квадрат";
    }

    @Override
    public double getPerimeter() {
        return 4*firstSide;
    }

    @Override
    public double getSquare() {
        return firstSide * secondSide;
    }

    @Override
    public String toString() {
        return name
                + "\n Стороны равны " + firstSide
                + "\n Периметр равен " + getPerimeter()
                + "\n Площадь равна " + getSquare()+ "\n";
    }
}
