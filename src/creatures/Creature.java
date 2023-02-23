package creatures;

import enums.Size;
import interfaces.Condition;

public abstract class Creature implements Condition {
    private String name;
    private final Size size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        switch (size) {
            case ENORMOUS -> hash = 4;
            case HUGE -> hash = 3;
            case BIG -> hash = 2;
            case NORMAL -> hash = 1;
            case SMALL -> hash = -1;
            case TINY -> hash = -2;
        }
        return hash;
    }

    @Override
    public String toString() {
        return "New creature was created";
    }

    @Override
    public void describe() {
        System.out.println(this);
    }

    public Creature() {
        this.size = Size.UNDEFINED;
        describe();
    }

    public Creature(Size size) {
        this.size = size;
    }
}
