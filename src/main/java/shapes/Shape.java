package shapes;

public abstract class Shape {
    /**
     * конструктор класса
     * @param name название фигуры
     */
    protected Shape(String name){
        this.name = name;
    };

    /**
     * название фигуры
     */
    protected String name;

    /**
     * метод вычисления периметра
     * @return периметр фигуры
     */
    public abstract double getPerimeter();

    /**
     * метод вычисления площади
     * @return площадь фигуры
     */
    public abstract double getSquare();

    @Override
    public String toString() {
        return name;
    }
}
