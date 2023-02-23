package buildings;

import enums.Age;
import enums.Shapes;
import exceptions.NoShapeBuildingException;
import interfaces.Condition;

public class Building implements Condition {
    private Age age;
    private Shapes shape;
    private String place;
    private String name;

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public void setShape(Shapes shape) {
        this.shape = shape;
    }

    public Shapes getShape() {
        return shape;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public Building() {
        age = Age.UNKNOWN;
        shape = Shapes.DEFAULT;
        place = null;
        describe();
    }

    public Building(Age age, Shapes shape) {
        this.setAge(age);
        this.setShape(shape);
        this.setPlace(null);
        describe();
    }

    public Building(Age age, Shapes shape, String place) {
        this.setAge(age);
        this.setShape(shape);
        this.setPlace(place);
        describe();
    }

    public Building(Age age, Shapes shape, String place, String name) {
        this.setAge(age);
        this.setShape(shape);
        this.setPlace(place);
        this.name = name;
        describe();
    }

    @Override
    public String toString() {
        String age, shape;

        if (this.getAge() == Age.OLD) {
            age = "Old";
        } else if (this.getAge() == Age.YOUNG) {
            age = "Modern";
        } else {
            age = null;
        }

        try {
            if (this.getShape() == null) {
                throw new NoShapeBuildingException("The building has no shape");
            }
        }
        catch (NoShapeBuildingException e) {
            this.setShape(Shapes.CUBIC);
            System.out.println(e.getMessage());
        }

        switch (this.getShape()) {
            case CUBIC -> shape = "cubic";
            case ROUND -> shape = "round";
            case SPHERICAL -> shape = "spherical";
            case CYLINDRICAL -> shape = "cylindrical";
            case RECTANGULAR -> shape = "rectangular";
            case FIVE_POINTED -> shape = "five-pointed";
            default -> shape = null;
        }
        if (age != null && place != null) {
            return age + " " + shape + " building is situated in " + place;
        }
        if (age == null && place == null)
            return "One usual " + shape + " building";
        if (age == null)
            return "The " + shape + " building is situated in " + place;
        return "A strange building exists...";
    }

    @Override
    public void describe() {
        if (name != null)
            System.out.println(this + " called " + name);
        else
            System.out.println(this);
    }
}
