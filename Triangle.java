package Exercise4;

//public class Triangle with side1, side2, side3 as parameters
public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    //constructor method
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Boolean class checkSides throwing illegal argument when a triangle is not made
    public boolean checkSides() throws IllegalArgumentException{
        if((side1+ side2) > side3 && (side2+ side3) > side1 && (side1+ side3)> side2) {
            return true;
        }else {
            throw new IllegalArgumentException("Invalid triangle sides.");
        }
    }
}
