package landscapes;

import buildings.Building;
import enums.Shapes;

import java.util.Objects;

public class Caves extends Building {
    private String comment;

    public Caves(Shapes shape) {
        super(null, shape, null);
    }

    public Caves(Shapes shape, String comment) {
        super(null, shape, null);
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Caves of " + this.getShape() + Objects.requireNonNullElse(comment, " shape pass by");
    }
}
