public class Square extends Rectangle{

    public Square() {

    }

    public Square(double side) {
        this.width = side;
        this.length = side;
    }

    public Square(double side, String colour, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = colour;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

}
