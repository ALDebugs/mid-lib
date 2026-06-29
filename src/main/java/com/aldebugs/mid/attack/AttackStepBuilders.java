package com.aldebugs.mid.attack;

public class AttackStepBuilders {


    private AttackStepBuilders() {}

    /*public interface TypeStep {
        PrayerStep single();
        PrayerStep sticky();
        SequencePrayerStep sequence();
    }*/

    public interface PrayerStep {
        TickStep magic();
        TickStep missiles();
        TickStep melee();
    }

    public interface SequencePrayerStep {
        SequenceTickStep magic();
        SequenceTickStep missiles();
        SequenceTickStep melee();
        PriorityStep lockSequence();
    }

    public interface TickStep {
        PriorityStep ticksLeft(int ticksLeft);
    }

    public interface SequenceTickStep {
        SequencePrayerStep ticksLeft(int ticksLeft);
    }

    public interface PriorityStep {
        OptionStep priority(int priority);
    }

    public interface OptionStep<B extends OptionStep<B>> {
        AttackHandle add();
    }

    public interface Options extends OptionStep<Options> {}

}

