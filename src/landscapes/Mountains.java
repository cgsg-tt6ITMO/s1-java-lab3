package landscapes;

import enums.Shapes;
import interfaces.Condition;

public class Mountains implements Condition {
    public Mountains() {
        describe();
    }

    public Mountains(boolean isCaves) {
        this();
        if (isCaves) {
            // вложенный нестатический класс
            Caves caves = new Caves(Shapes.ROUND, " are in Mountains") {
                @Override
                public String toString() {
                    return "Caves of round shape are in Mountains!";
                }
            };
        }
    }

    @Override
    public String toString() {
        return "New Mountains exist";
    }

    @Override
    public void describe() {
        System.out.println(this);
    }
}
