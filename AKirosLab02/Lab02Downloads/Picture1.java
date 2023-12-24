import java.awt.*;
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 */
public class Picture1
{
    private Canvas canvas;
    private Rectangle wall;
    private Rectangle window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture1()
    {
       canvas = new Canvas("Picture1", 400, 400);
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Rectangle(40, 140, 100, 100, Color.BLUE, true);
        
        window = new Rectangle(60, 160, 30, 30, true);

        roof = new Triangle(20, 100, 140, 40, Color.MAGENTA, true);  
        
        sun = new Circle(180, 20, 20, Color.RED, true);
        
        canvas.draw(wall);
        canvas.draw(window);
        canvas.draw(roof);
        canvas.draw(sun);
    }
}
