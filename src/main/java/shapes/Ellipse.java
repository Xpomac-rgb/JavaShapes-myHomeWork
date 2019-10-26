package shapes;

public class Ellipse extends Circle{
    public Ellipse(double firstRadius,double secondRadius){
        super(firstRadius,secondRadius);
        name = "Эллипс";
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*Math.sqrt((Math.pow(firstRadius,2)+Math.pow(secondRadius,2))/2);
    }

    @Override
    public double getSquare() {
        return Math.PI*firstRadius*secondRadius;
    }

    @Override
    public String toString() {
        return name
                + "\nПолуоси равны " + firstRadius + " и " + secondRadius
                + "\nДлина эллипса равна" + getPerimeter()
                + "\nПлощадь эллипса равна" + getSquare()
                + "\n";
    }
}
