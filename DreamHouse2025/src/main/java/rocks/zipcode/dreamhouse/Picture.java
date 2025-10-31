package rocks.zipcode.dreamhouse;

import java.awt.Color;

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
        drawCastle(50, 0);
    }

    public void drawCastle(int xOffset, int yOffset)
    {
        drawGrass();
        drawWater();
        drawTower(50 + xOffset, 50 + yOffset);
        drawTower(750 + xOffset, 50 + yOffset);
        drawTowerNoTopper(350 + xOffset, 50 + yOffset);
        drawTowerNoTopper(450 + xOffset, 50 + yOffset);
        drawRoof(250 + xOffset, 25 + yOffset);
        drawWall(150 + xOffset, 50 + yOffset);
        drawWall(250 + xOffset, 50 + yOffset);
        drawWall(550 + xOffset, 50 + yOffset);
        drawWall(650 + xOffset, 50 + yOffset);
        drawBorders(0 + xOffset, 0 + yOffset);
        drawDoor(0 + xOffset, 0 + yOffset);
        drawWindows(200 + xOffset, 175 + yOffset);
        drawWindows(600 + xOffset, 175 + yOffset);
    }

    public void drawWater ()
    {
        RectangleZC water = new RectangleZC(200, 200, 400, 300, new Color(0, 121, 180));
        water.makeVisible();
    }

    public void drawGrass ()
    {
        RectangleZC grass = new RectangleZC(1000, 200, 0, 300, new Color(124, 252, 0));
        grass.makeVisible();
    }

    public void drawWindows (int xOffset, int yOffset)
    {
        for (int i = 0; i < 4; i++)
        {
            drawWindow(80 * (i % 2) + xOffset, 100 * (i/2) + yOffset);
        }
    }

    public void drawWindow (int xOffset, int yOffset)
    {
        Square window = new Square(30, 0 + xOffset, 15 + yOffset, Color.black);
        window.makeVisible();
        Circle windowTop = new Circle(30, 0 + xOffset, 0 + yOffset, Color.black);
        windowTop.makeVisible();
    }

    public void drawDoor(int xOffset, int yOffset)
    {
        RectangleZC door = new RectangleZC(100, 150, 400 + xOffset, 225 + yOffset, new Color(127, 81, 18));
        door.makeVisible();
        Circle doorTop = new Circle(100, 400 + xOffset, 175 + yOffset, new Color(127, 81, 18));
        doorTop.makeVisible();
        RectangleZC doorLineVertical = new RectangleZC(4, 200, 448 + xOffset, 175 + yOffset, Color.darkGray);
        doorLineVertical.makeVisible();
        RectangleZC doorLineHorizontal1 = new RectangleZC(100, 4, 400 + xOffset, 325 + yOffset, Color.darkGray);
        doorLineHorizontal1.makeVisible();
        RectangleZC doorLineHorizontal2 = new RectangleZC(100, 4, 400 + xOffset, 250 + yOffset, Color.darkGray);
        doorLineHorizontal2.makeVisible();
    }

    public void drawBorders(int xOffset, int yOffset)
    {
        RectangleZC[] border = new RectangleZC[4];
        border[0] = new RectangleZC(4, 250, 148 + xOffset, 125 + yOffset, Color.BLACK);
        border[0].makeVisible();
        border[1] = new RectangleZC(4, 250, 348 + xOffset, 125 + yOffset, Color.BLACK);
        border[1].makeVisible();
        border[2] = new RectangleZC(4, 250, 548 + xOffset, 125 + yOffset, Color.BLACK);
        border[2].makeVisible();
        border[3] = new RectangleZC(4, 250, 748 + xOffset, 125 + yOffset, Color.BLACK);
        border[3].makeVisible();
    }

    public void drawRoof(int xOffset, int yOffset)
    {
        Triangle roof = new Triangle(50, 200, 200 + xOffset, 0 + yOffset, Color.darkGray);
        roof.makeVisible();
    }

    public void drawTower(int xOffset, int yOffset) 
    {
        RectangleZC TowerBG = new RectangleZC(100, 300, 0 + xOffset, 25 + yOffset, Color.LIGHT_GRAY);
        TowerBG.makeVisible();
        RectangleZC topLine = new RectangleZC(100,4, 0 + xOffset, 25 + yOffset, Color.BLACK);
        topLine.makeVisible();
        RectangleZC[] topper = new RectangleZC[3];
        
        for (int i = 0; i < topper.length; i++) {
            topper[i] = new RectangleZC(30, 25, 0 + (35 * i) + xOffset, 0 + yOffset, Color.lightGray);
            topper[i].makeVisible();
        }

        RectangleZC[] brickLines = new RectangleZC[30];

        for (int i = 0; i < brickLines.length; i+=5) {
            brickLines[i%5] = new RectangleZC(4, 25, 48 + xOffset, 25 + (50 * (i/5)) + yOffset, Color.BLACK);
            brickLines[i%5].makeVisible();
            brickLines[i%5+1] = new RectangleZC(100,4, 0 + xOffset, 46 + (50 * (i/5)) + yOffset, Color.BLACK);
            brickLines[i%5+1].makeVisible();
            brickLines[i%5+2] = new RectangleZC(4, 25, 23 + xOffset, 50 + (50 * (i/5)) + yOffset, Color.BLACK);
            brickLines[i%5+2].makeVisible();
            brickLines[i%5+3] = new RectangleZC(4, 25, 73 + xOffset, 50 + (50 * (i/5)) + yOffset, Color.BLACK);
            brickLines[i%5+3].makeVisible();
            brickLines[i%5+4] = new RectangleZC(100,4, 0 + xOffset, 71 + (50 * (i/5)) + yOffset, Color.BLACK);
            brickLines[i%5+4].makeVisible();
        }
        
    }

    public void drawTowerNoTopper(int xOffset, int yOffset) 
    {
        RectangleZC TowerBG = new RectangleZC(100, 300, 0 + xOffset, 25 + yOffset, Color.LIGHT_GRAY);
        TowerBG.makeVisible();
        RectangleZC topLine = new RectangleZC(100,4, 0 + xOffset, 25 + yOffset, Color.BLACK);
        topLine.makeVisible();

        RectangleZC[] brickLines = new RectangleZC[30];

        for (int i = 0; i < brickLines.length; i+=5) {
            brickLines[i%5] = new RectangleZC(4, 25, 48 + xOffset, 25 + (50 * (i/5)) + yOffset, Color.BLACK);
            brickLines[i%5].makeVisible();
            brickLines[i%5+1] = new RectangleZC(100,4, 0 + xOffset, 46 + (50 * (i/5)) + yOffset, Color.BLACK);
            brickLines[i%5+1].makeVisible();
            brickLines[i%5+2] = new RectangleZC(4, 25, 23 + xOffset, 50 + (50 * (i/5)) + yOffset, Color.BLACK);
            brickLines[i%5+2].makeVisible();
            brickLines[i%5+3] = new RectangleZC(4, 25, 73 + xOffset, 50 + (50 * (i/5)) + yOffset, Color.BLACK);
            brickLines[i%5+3].makeVisible();
            brickLines[i%5+4] = new RectangleZC(100,4, 0 + xOffset, 71 + (50 * (i/5)) + yOffset, Color.BLACK);
            brickLines[i%5+4].makeVisible();
        }
        
    }

    public void drawWall(int xOffset, int yOffset) 
    {
        RectangleZC TowerBG = new RectangleZC(100, 250, 0 + xOffset, 75 + yOffset, Color.LIGHT_GRAY);
        TowerBG.makeVisible();
        RectangleZC topLine = new RectangleZC(100,4, 0 + xOffset, 75 + yOffset, Color.BLACK);
        topLine.makeVisible();

        RectangleZC[] brickLines = new RectangleZC[25];

        for (int i = 0; i < brickLines.length; i+=5) {
            brickLines[i%5] = new RectangleZC(4, 25, 48 + xOffset, 75 + (50 * (i/5)) + yOffset, Color.BLACK);
            brickLines[i%5].makeVisible();
            brickLines[i%5+1] = new RectangleZC(100,4, 0 + xOffset, 96 + (50 * (i/5)) + yOffset, Color.BLACK);
            brickLines[i%5+1].makeVisible();
            brickLines[i%5+2] = new RectangleZC(4, 25, 23 + xOffset, 100 + (50 * (i/5)) + yOffset, Color.BLACK);
            brickLines[i%5+2].makeVisible();
            brickLines[i%5+3] = new RectangleZC(4, 25, 73 + xOffset, 100 + (50 * (i/5)) + yOffset, Color.BLACK);
            brickLines[i%5+3].makeVisible();
            brickLines[i%5+4] = new RectangleZC(100,4, 0 + xOffset, 121 + (50 * (i/5)) + yOffset, Color.BLACK);
            brickLines[i%5+4].makeVisible();
        }
        
    }

}
