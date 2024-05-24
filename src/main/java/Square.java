import java.awt.Color;
public class Square {

    public static void main(String[] args) {
        World world = new World(200, 200);
        Turtle turtle = new Turtle(world, 0, 0);

        int sideLength = 100;  // Length of each side of the square

        turtle.setPenWidth(3);
        turtle.setColor(Color.red);

        for (int i = 0; i < 4; i++) {
            turtle.forward(sideLength);  // Move forward by the length of the side
            turtle.turnRight(90);  // Turn 90 degrees to the right
        }
    }
}
