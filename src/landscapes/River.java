package landscapes;

import creatures.Creature;

public class River {
    public River() {
        // local class
        class UnderWaterCreatures extends Creature {
            @Override
            public String toString() {
                return "Underwater Creatures that live in the River scare people";
            }

            @Override
            public void describe() {
                System.out.println(this);
            }

            public UnderWaterCreatures() {
                //describe();
            }
        }
        UnderWaterCreatures eels = new UnderWaterCreatures();

    }
}
