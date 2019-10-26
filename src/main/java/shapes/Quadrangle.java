package shapes;

import shapes.Shape;

public class Quadrangle extends Shape {
    double firstSide;
    double secondSide;
    double thirdSide;
    double fourthSide;
    double alba;
    double beta;

    public Quadrangle(double firstSide,double secondSide,double thirdSide,double fourthSide,double alba,double beta){
        super("Четырёхуголник");
        this.firstSide=firstSide;
        this.secondSide=secondSide;
        this.thirdSide=thirdSide;
        this.fourthSide=fourthSide;
        this.alba=alba;
        this.beta=beta;
    }


    @Override
    public double getPerimeter() {
        return firstSide+secondSide+thirdSide+fourthSide;
    }

    @Override
    public double getSquare() {
        double p = getPerimeter() /2;
        double degreesAlba=  Math.toRadians(alba);
        double degreesBeta= Math.toRadians(beta);
        return Math.sqrt((p-firstSide)*(p-secondSide)*(p-thirdSide)*(p-fourthSide)
                - firstSide*secondSide *thirdSide *fourthSide
                * Math.pow(Math.cos((degreesAlba+degreesBeta)/2),2));
    }

    @Override
    public String toString() {
        return name
                + "\n Стороны равны " + firstSide + " , " + secondSide + " , "+thirdSide+ " , "+fourthSide
                + "\n Периметр равен " + getPerimeter()
                + "\n Площадь равна " + getSquare()
                + "\n";

    }
}
