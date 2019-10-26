package shapes;

public class Rhombus extends Quadrangle {
    public  Rhombus(double side,double firstDiagonal,double secondDiagonal){
        super(side,side,firstDiagonal,secondDiagonal,0,0);
        name="Ромб";
    }

    @Override
    public double getPerimeter() {
        return 4*firstSide;
    }

    @Override
    public double getSquare() {
        return thirdSide*fourthSide/2;
    }

    @Override
    public String toString() {
        return name
                + "\n Стороны равны " + firstSide
                + "\n Диагонали равны " + thirdSide + " и " + fourthSide
                + "\n Периметр равен " + getPerimeter()
                + "\n Площадь равна " + getSquare()+ "\n";
    }
}
