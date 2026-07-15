package com.aldebugs.mid.service;

import com.aldebugs.mid.attack.AttackStepBuilders;

public interface AttackService {
    AttackStepBuilders.PrayerStep normal();
    AttackStepBuilders.StickyPrayerStep sticky();
    AttackStepBuilders.SequencePrayerStep sequence();

    void reset();
}
