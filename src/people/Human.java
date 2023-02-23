package people;

import creatures.Creature;
import interfaces.Condition;
import enums.Age;

// класс Денфронт будет наследовать этот класс, но у него будет также имя
public abstract class Human extends Creature implements Condition {
    private Age age;
    private boolean isScared;

    public void setAge(Age age) {
        this.age = age;
    }

    public Age getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "New Human was created";
    }

    @Override
    public void describe() {
        // this.toString <=> this
        System.out.println(this);
    }

    public Human() {
        describe();
    }

    public Human(Age a) {
        this();
        setAge(a);
    }

    public abstract void see();
}

