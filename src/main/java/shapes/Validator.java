package shapes;

public class Validator {

    public static boolean validateTriangle(double firstSide, double secondSide, double thirdSide) {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) return false;
        if (firstSide + secondSide <= thirdSide) return false;
        if (firstSide + thirdSide <= secondSide) return false;
        if (secondSide + thirdSide <= firstSide) return false;
        return true;
    }

}
