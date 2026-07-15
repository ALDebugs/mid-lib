package com.aldebugs.mid.attack;

public interface AttackHandle extends AutoCloseable {
    void cancel();
    boolean isActive();

    @Override
    default void close() {
        cancel();
    }
}
