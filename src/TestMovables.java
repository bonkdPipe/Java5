public class TestMovables {
    public static void main(String[] args) {
        MovableRectangle dabigbox = new MovableRectangle(2,3,5,7,4,10);
        MovableCircle decircle = new MovableCircle(1,2,4,5,5);
        System.out.println("Initial state: ");
        System.out.println(decircle);
        System.out.println("After movement: ");

        decircle.moveDown();
        decircle.moveLeft();
        decircle.moveLeft();

        System.out.println(decircle);

        System.out.println("After set speed to 5, 7: ");

        decircle.setSpeed(5,7);
        decircle.moveDown();
        decircle.moveLeft();
        decircle.moveLeft();

        System.out.println(decircle);

        System.out.println("---------");
        System.out.println("Initial state: ");
        System.out.println(dabigbox);
        System.out.println("After movement: ");

        dabigbox.moveDown();
        dabigbox.moveLeft();
        dabigbox.moveLeft();

        System.out.println(dabigbox);

        System.out.println("After set speed to 5, 7: ");

        dabigbox.setSpeed(5,7);
        dabigbox.moveDown();
        dabigbox.moveLeft();
        dabigbox.moveLeft();

        System.out.println(dabigbox);
    }
}
