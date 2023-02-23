package objects;

import enums.Unsubstantial;
import interfaces.Condition;
import interfaces.Flying;

public class Cloud implements Flying, Condition {
    protected Unsubstantial condition;

    @Override
    public void describe() {
        String line;
        switch (condition) {
            case FLY -> line = "Clouds fly";
            case RUN -> line = "Облака бегут по небу";
            case RUN_FAST -> line = "Облака быстро бегут по небу";
            case CHANGE -> line = "Облака могут дополнить картину";
            case DISTORT -> line = "Облака могут исказить картину";
            case SUPPLEMENT -> line = "Воображение может разукрасить картину";
            default -> line = "Abracadabra happens";

        }
        System.out.println(line);
    }

    public Cloud() {}

    @Override
    public void fly() {
        condition = Unsubstantial.FLY;
        describe();
    }

    @Override
    public void run(boolean isFast) {
        if (isFast)
            condition = Unsubstantial.RUN_FAST;
        else
            condition = Unsubstantial.RUN;
        describe();
    }

    public void change() {
        condition = Unsubstantial.CHANGE;
        describe();
    }

    // исказить
    public void distort() {
        condition = Unsubstantial.DISTORT;
        describe();
    }

}
