package com.aldebugs.mid.marker;

public interface MarkerHandle extends AutoCloseable {
    void remove();
    boolean isActive();

    @Override
    default void close() {
        remove();
    }
}