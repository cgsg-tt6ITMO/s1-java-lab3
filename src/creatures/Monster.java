package creatures;

import enums.Size;

/* чудище */
public class Monster extends Creature {
    private final Size size;

    public Monster() {
        size = Size.BIG;
    }

    public Monster(Size s) {
        size = s;
    }

    @Override
    public String toString() {
        return "";
    }
}

