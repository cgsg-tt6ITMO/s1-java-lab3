package landscapes;

import enums.Unsubstantial;
import interfaces.Condition;

public class Sky implements Condition {
    private Unsubstantial cond;

    @Override
    public void describe() {
        if (cond == Unsubstantial.FROWN)
            System.out.println("Небо хмурится");
        else
            System.out.println("Abracadabra happens");
    }

    // хмуриться
    public void frown() {
        cond = Unsubstantial.FROWN;
        describe();
    }
}
