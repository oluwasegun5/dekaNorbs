package theCreativeTurtle;

import static theCreativeTurtle.Direction.*;

public class Turtle {
    private final Pen biro = new Pen();
    private Direction direction = EAST;
    private Position position = new Position(0,0);

    public boolean isPenDown() {
        return biro.penState() == PenPosition.DOWN;
    }

    public void penDown() {
        biro.drop();
    }

    public void penUp() {
        biro.up();
    }

    public Direction currentDirection() {
        return direction;
    }

    public void turnRight() {
        switch (currentDirection()) {
            case EAST -> turn(SOUTH);
            case SOUTH -> turn(WEST);
            case WEST -> turn(NORTH);
            case NORTH -> turn(EAST);
        }
    }

    public void turnLeft() {
        switch (currentDirection()) {
            case EAST -> turn(NORTH);
            case NORTH -> turn(WEST);
            case WEST -> turn(SOUTH);
            case SOUTH -> turn(EAST);
        }
    }

    private void turn(Direction to) {
        direction = to;
    }

    public void move(int noOfSteps) {
        switch (currentDirection()) {
            case EAST -> position.setColumn(noOfSteps-1);
            case NORTH -> turn(WEST);
            case WEST -> turn(SOUTH);
            case SOUTH -> turn(EAST);
        }
    }
}
