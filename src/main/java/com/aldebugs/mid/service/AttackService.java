package com.aldebugs.mid.service;

import com.aldebugs.mid.attack.AttackBuilder;
import com.aldebugs.mid.attack.AttackSequencer;
import net.runelite.api.Prayer;

public interface AttackService {
    AttackBuilder attack(Prayer prayer);
    void stasis(Prayer prayer);
    void clearStasis();
    AttackSequencer seq();
    void reset();
}
