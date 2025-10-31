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
        drawTower(50, 50);
        drawTower(750, 50);
        drawTowerNoTopper(350, 50);
        drawTowerNoTopper(450, 50);
        drawRoof(250, 25);
        drawWall(150, 50);
        drawWall(250, 50);
        drawWall(550, 50);
        drawWall(650, 50);
        drawBorders(0, 0);
        drawDoor(0, 0);
    }

    public void drawDoor(int xOffset, int yOffset)
    {
        RectangleZC door = new RectangleZC(100, 150, 400, 225, new Color(127, 81, 18));
        door.makeVisible();
        Circle doorTop = new Circle(100, 400, 175, new Color(127, 81, 18));
        doorTop.makeVisible();
        RectangleZC doorLineVertical = new RectangleZC(4, 200, 448, 175, Color.darkGray);
        doorLineVertical.makeVisible();
        RectangleZC doorLineHorizontal1 = new RectangleZC(100, 4, 400, 325, Color.darkGray);
        doorLineHorizontal1.makeVisible();
        RectangleZC doorLineHorizontal2 = new RectangleZC(100, 4, 400, 250, Color.darkGray);
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
