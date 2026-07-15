package com.aldebugs.mid.attack;

import net.runelite.api.Prayer;

public class AttackStepBuilders {

    private AttackStepBuilders() {}

    public interface PrayerStep {
        TickStep magic();
        TickStep missiles();
        TickStep melee();
        TickStep resolve(Prayer prayer);
    }

    public interface TickStep {
        PriorityStep ticksLeft(int ticksLeft);
    }

    public interface SequencePrayerStep {
        SequenceTickStep magic();
        SequenceTickStep missiles();
        SequenceTickStep melee();
        SequenceTickStep resolve(Prayer prayer);
        PriorityStep lockSequence();
    }

    public interface SequenceTickStep {
        SequencePrayerStep ticksLeft(int ticksLeft);
    }

    public interface PriorityStep {
        Options priority(int priority);
    }

    public interface Options {
        Options tag(String tag);
        AttackHandle add();
    }



}

