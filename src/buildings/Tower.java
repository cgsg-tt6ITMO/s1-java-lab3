package buildings;

import enums.Age;
import enums.Shapes;
import interfaces.Condition;

public class Tower extends Building implements Condition {
    public Tower() {
        super(Age.OLD, Shapes.CYLINDRICAL);
    }

    public Tower(Age age, Shapes shape) {
        super(age, shape);
    }

    @Override
    public String toString() {
        String description = "Cylindrical old tower";
        if (this.getAge() != Age.OLD && this.getShape() != Shapes.ROUND)
            description = "Unusual tower";
        return description;
    }

    @Override
    public void describe() {
        System.out.println(this + " exists");
    }
}
