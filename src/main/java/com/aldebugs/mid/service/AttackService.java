package com.aldebugs.mid.service;

import com.aldebugs.mid.attack.AttackStepBuilders;

public interface AttackService {
    AttackStepBuilders.PrayerStep normal();
    AttackStepBuilders.PrayerStep sticky();
    AttackStepBuilders.SequencePrayerStep sequence();

    void reset();
}
