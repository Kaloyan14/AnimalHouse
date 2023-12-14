package bg.smg;

public class AnimalHouse <T> {
    public T animal;

    public AnimalHouse() {
        this.animal = null;
    }

    public AnimalHouse(T animal) {
        this.animal = animal;
    }
}
