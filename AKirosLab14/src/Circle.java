
public class Circle { // Student Starter code

    private double radius; // circle radius

    /**
     * 
     * Constructor - new circle
     * 
     * @param inRadius radius of the circle
     * 
     */

    public Circle(double inRadius) throws Exception {
        if (inRadius > 0)
            radius = inRadius;
        else
            throw new Exception("Radius cant be negative or zero");

    }

    /**
     * 
     * Return the radius of the circle
     * 
     * @return radius of the circle
     * 
     */

    public double getRadius() {

        return radius;

    }

    /**
     * 
     * set the radius
     * 
     * @param newRadius new radius of the circle
     * 
     */

    public void setRadius(double newRadius) throws Exception {

        if (newRadius > 0)
            radius = newRadius;
        else
            throw new Exception("Radius cant be negative or zero");

    }

    /**
     * 
     * Compute and return the area of the circle
     * 
     * @return the area of the circle
     * 
     */

    public double area() {

        return Math.PI * radius * radius;

    }

    /**
     * 
     * Stretches circle size by multiplying
     * 
     * the radius by the factor provided.
     * 
     * @param factor stretch factor
     * 
     */

    public void stretchBy(double factor) throws Exception {

        if (factor > 0)
            radius = radius * factor;
        else
            throw new Exception("Radius cant be negative or zero");

        // implement body here

    }

    /**
     * 
     * Return a string representation of a circle.
     * 
     * @return a string representing this circle
     * 
     */

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
}