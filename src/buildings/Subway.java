package buildings;

import enums.Age;
import enums.Shapes;
import interfaces.Condition;

public class Subway extends Building implements Condition {

    private static void stations() {
        System.out.println("In subway there are some stations");
    }

    public Subway() {
        super();
    }

    public Subway(Age age, Shapes shape, String place) {
        super(age, shape, place);

    }

    // вложенный статический класс. В нём мы можем вызывать статические методы и использовать статические переменные внешнего класса
    public static class Station {
        public Station() {
            stations();
        }
    }

    @Override
    public String toString() {
        return "Subway " + super.toString();
    }

    @Override
    public void describe() {
        //System.out.println(this);
    }
}
