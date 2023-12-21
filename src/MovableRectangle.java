public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x, int y, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x,y,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void setSpeed(int xSpeed, int ySpeed) {
        topLeft.setSpeed(xSpeed,ySpeed);
        bottomRight.setSpeed(xSpeed,ySpeed);
    }

    @Override
    public void moveRight() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
}
