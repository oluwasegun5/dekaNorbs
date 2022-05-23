package theCreativeTurtle;

public class Pen {
    private PenPosition position;

    public void drop() {
         position = PenPosition.DOWN;
    }
    public void up() {
        position = PenPosition.UP;
    }
    public PenPosition penState(){
        return position;
    }
}
