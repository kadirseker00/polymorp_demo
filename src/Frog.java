public class Frog extends Animal{

    public Frog(int x, int y) {
        super(x, y);
    }

    public void move(){
        setX(getX() + 5);
        setY(getY() + 5);
    }

    @Override
    public String toString() {
        return "Frog{" + super.toString() + "}";
    }
}
