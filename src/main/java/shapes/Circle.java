package shapes;

public class Circle extends Shape {
    double firstRadius;
    double secondRadius;

    public Circle(double firstRadius,double secondRadius){
        super("Круг");
        this.firstRadius=firstRadius;
        this.secondRadius=secondRadius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*firstRadius;
    }

    @Override
    public double getSquare() {
        return Math.PI*Math.pow(firstRadius,2);
    }

    @Override
    public String toString() {
        return name
                + "\nРадиус равен" + firstRadius
                + "\nДлина окружности равна" + getPerimeter()
                + "\nПлощадь окружности равна" + getSquare()
                + "\n";
    }
}
