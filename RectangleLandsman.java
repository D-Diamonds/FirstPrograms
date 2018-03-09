/*
 * RectangleLandsman class
 *
 * Creates an object of a rectangle
 *
 * Author: Josh Landsman
 */

public class RectangleLandsman {

    // Class variables
    private static int rectangleCount = 0;

    // Default variables
    private static final int DEFAULT_LENGTH = 2;
    private static final int DEFAULT_HEIGHT = 2;

    // Instance Variables
    private int length;
    private int height;
    private int rectangleID;

    // Default Constructor
    public RectangleLandsman() {
        this(DEFAULT_LENGTH, DEFAULT_HEIGHT);
    } // RectangleLandsman()

    // Main constructor
    public RectangleLandsman(int length, int height) {
        if (length > 0)
            this.length = length;
        else
            this.length = DEFAULT_LENGTH;
        if (height > 0)
            this.height = height;
        else
            this.height = DEFAULT_HEIGHT;
        this.rectangleID = rectangleCount += 1;
    } // RectangleLandsman(int, int)

    // Returns rectangleCount
    public static int getRectangleCount() {
        return rectangleCount;
    } // getRectangleCount()

    // Returns area of Rectangle
    public int area() {
        return this.length * this.height;
    } // area()

    // Returns perimeter of Rectangle
    public int perimeter() {
        return this.length * 2 + this.height * 2;
    } // perimeter()

    // Returns whether two Rectangles are equal based on length and height
    public boolean equals(RectangleLandsman r) {
        return (this.height == r.height || this.length == r.height || this.height == r.length || this.length == r.length);
    } // equals(Rectangle)

    // Returns a String of Rectangle instance
    public String toString() {
        //return "Rectangle " + this.rectangleID + ":\nLength: " + this.length + "\nHeight: " + this.height;
        String visual = "Rectangle " + this.rectangleID + ":\nLength: " + this.length + "\nHeight: " + this.height + "\n";
        for (int i = 0; i < this.length; i++) {
            visual += "\u203E ";
        }
        visual += "\n";
        for (int i = 0; i < this.height - 2; i++) {
            visual += "|";
            for (int j = 0; j < this.length - 2; j++) {
                visual += " \u203E";
            }
            visual += " |\n";
        }
        for (int i = 0; i < this.length; i++) {
            visual += "\u203E ";
        }
        return visual;
    } // toString()
} // RectangleLandsman class
