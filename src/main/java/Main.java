import shapes.*;

public class Main {
    public static void main(String[] args) {



        Triangle[] triangles = {
                new Triangle(2,3 ,4 ),
            new IsoscelesTriangle(7, 10),
            new EquilateralTriangle(10),
            new RectangularTriangle(3, 4)
        };

        for(int i = 0; i < triangles.length; i++) {
            System.out.println(triangles[i].toString());
        }


        Quadrangle[] quadrangles = {
                new Quadrangle(2,4,6,8,45,15),
                new Square(5),
                new Rhombus(5,9,4),
                new Parallelogram(8,3,45),
                new Trapeze(8,2,5,6,4),
                new IsoscelesTrapeze(8,2,5,4),
                new RectangularTrapeze(8,4,5,7)
        };

        for (int i =0; i<quadrangles.length;i++){
            System.out.println(quadrangles[i].toString());
        }

        Circle[] circles = {
                new Circle(5,5),
                new Ellipse(8,6)
        };

        for (int i = 0;i<circles.length;i++){
            System.out.println(circles[i].toString());
        }


    }
}