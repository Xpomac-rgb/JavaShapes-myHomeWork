package shapes;

public class Rectangle extends Quadrangle {
    public Rectangle(double length,double width){
        super(length,width,length,width,90,90);
        name="Прямоугольник";
    }

    @Override
    public double getPerimeter() {
        return 2*(firstSide+secondSide);
    }

    @Override
    public double getSquare() {
        return firstSide*secondSide;
    }

    @Override
    public String toString() {
        return name
                + "\n Стороны равны " + firstSide + " и " + secondSide
                + "\n Периметр равен " + getPerimeter()
                + "\n Площадь равна " + getSquare()+ "\n";
    }
}
