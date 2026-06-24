package al.mid.service;

import al.mid.attack.AttackBuilder;
import al.mid.attack.AttackSequencer;
import net.runelite.api.Prayer;

public interface AttackService {
    AttackBuilder attack(Prayer prayer);
    void stasis(Prayer prayer);
    void clearStasis();
    AttackSequencer seq();
    void reset();
}
