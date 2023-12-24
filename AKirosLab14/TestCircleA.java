public class TestCircleA {
    public static void main(String[] args) {
        // read a radius of the circle from command line
        double radius = 0;
        try {
            radius = Double.parseDouble(args[0]);

        } catch (ArrayIndexOutOfBoundsException arr) {
            System.out.println("ArrayIndexOutOfBoundsException occurred...");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred...");
        }

        // Instantiate a Circle object

        Circle aCircle = null;
        try {
            aCircle = new Circle(radius);
        } catch (ShapeException e) {
            System.out.println("ShapeException occurred...");
        }

        // Print current status of the circle

        System.out.println(aCircle);
    }
}