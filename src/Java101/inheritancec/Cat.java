package Java101.inheritancec;

public class Cat extends Animal{
    private int teethNumber;

    public Cat(String name, int speed, int teethNumber) {
        super(name, speed);
        this.teethNumber = teethNumber;
    }

    public int getTeethNumber() {
        return teethNumber;
    }

    public void setTeethNumber(int teethNumber) {
        this.teethNumber = teethNumber;
    }

    @Override
    public void move() {
        System.out.println("Cat is moving");
        super.move();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "teethNumber=" + teethNumber +
                '}';
    }
}
