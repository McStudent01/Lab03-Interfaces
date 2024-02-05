import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BigRectLister 
{
    public static void main(String[] args) 
	{
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1, 2));
        rectangles.add(new Rectangle(3, 2));
        rectangles.add(new Rectangle(4, 1));
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(5, 1));
        rectangles.add(new Rectangle(1, 5));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(3, 3));
        rectangles.add(new Rectangle(4, 4));
        rectangles.add(new Rectangle(5, 5));

        Filter bigRectangleFilter = new BigRectangleFilter();
        List<Rectangle> bigRectangles = ListFilterUtil.collectAll(rectangles, bigRectangleFilter);

        System.out.println("Rectangles with big perimeters:");
        for (Rectangle rectangle : bigRectangles) {
            System.out.println(rectangle);
        }
    }
}
