public class Fish extends Animal{

    public Fish(int x, int y) {
        super(x, y);
    }

    public void move(){
        int currentX = getX();
        super.setX(currentX + 3);

        int currentY = getY();
        super.setY(currentY + 3);

    }

    @Override
    public String toString() {
        return "Fish{" +
                super.toString() + "}";
    }
}
