package al.mid.attack;

import net.runelite.api.Prayer;

public interface AttackSequencer {
    // 0 tick offset is instant, anything else is x ticks after calling. Priority counts for all.
    AttackSequencer at(int tickOffset, Prayer prayer);
    AttackSequencer priority(int priority);
    AttackHandle lock();
}
