package Java101.inheritancec;


public class Animal {

    private String name;
    private int speed;

    public Animal() {
    }
    public Animal(String name,int speed){
        this.name = name;
        this.speed = speed;

    }

    public void move(){
        System.out.println("Animal is moving with "+speed+" speed.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
