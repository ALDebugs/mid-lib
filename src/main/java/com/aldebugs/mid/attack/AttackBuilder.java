package com.aldebugs.mid.attack;

public interface AttackBuilder {
    AttackBuilder ticks(int ticks);
    AttackBuilder priority(int priority);
    AttackHandle add();
}
