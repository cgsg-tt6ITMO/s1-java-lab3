package people;

import enums.Age;

import java.util.List;

/* Respected old people class */
public class Elders extends Human {
    public Elders() {
        this.setAge(Age.OLD);
    }

    public void allow(List<String> presents) {
        System.out.print("Elders gifted to Shoggoths");
        for (String gift : presents) {
            System.out.print(" "+ gift);
        }
        System.out.println(".");
    }

    @Override
    public String toString() {
        return "Elders appeared";
    }

    @Override
    public void see() {}
}
