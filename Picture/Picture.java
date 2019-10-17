
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square window1;
    private Square window2;
    private Square window3;
    private Square window4;
    private Square door1;
    private Square door2;
    private Square treeTrunk;
    private Square treeTrunk1;
    private Circle tree;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(160);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(10);
        window.moveVertical(100);
        window.makeVisible();
        
        window1 = new Square();
        window1.changeColor("black");
        window1.moveHorizontal(65);
        window1.moveVertical(100);
        window1.makeVisible();
        
        window2 = new Square();
        window2.changeColor("black");
        window2.moveHorizontal(120);
        window2.moveVertical(100);
        window2.makeVisible();
        
        window3 = new Square();
        window3.changeColor("black");
        window3.moveHorizontal(10);
        window3.moveVertical(170);
        window3.makeVisible();
        
        window4 = new Square();
        window4.changeColor("black");
        window4.moveHorizontal(120);
        window4.moveVertical(170);
        window4.makeVisible();
        
        door1 = new Square();
        door1.changeColor("black");
        door1.moveHorizontal(65);
        door1.moveVertical(180);
        door1.makeVisible();
        
        door2 = new Square();
        door2.changeColor("black");
        door2.moveHorizontal(65);
        door2.moveVertical(210);
        door2.makeVisible();
        
        tree = new Circle();
        tree.changeColor("green");
        tree.moveHorizontal(210);
        tree.moveVertical(110);
        tree.changeSize(60);
        tree.makeVisible();
        
        treeTrunk1 = new Square();
        treeTrunk1.changeColor("black");
        treeTrunk1.moveHorizontal(185);
        treeTrunk1.moveVertical(180);
        treeTrunk1.makeVisible();
        
        treeTrunk = new Square();
        treeTrunk.changeColor("black");
        treeTrunk.moveHorizontal(185);
        treeTrunk.moveVertical(210);
        treeTrunk.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 160);
        roof.moveHorizontal(90);
        roof.moveVertical(65);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
