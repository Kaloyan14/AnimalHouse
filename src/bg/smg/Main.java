package bg.smg;

public class Main {

    public static void main(String[] args) {
        Fish fish = new Fish("Fish");
        Snake snake = new Snake(4);
        AnimalHouse<Fish> fishHouse = new AnimalHouse<>();
        fishHouse.animal = fish;
        AnimalHouse<Snake> snakeHouse = new AnimalHouse<>();
        snakeHouse.animal = snake;

    }
}
