package methodreferenceexample;

public class Main {
    public static void main(String[] args){
        Square s = new Square(4);

        Shapes shapes = (Square square) -> {
          return square.calculateArea();
        };

        System.out.println("Area: " + shapes.getArea(s));
    }
}
