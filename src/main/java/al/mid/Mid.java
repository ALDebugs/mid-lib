package al.mid;

public final class Mid {
    private static volatile MidApi api;

    private Mid() {}

    public static void startUp(MidApi instance) {
        api = instance;
    }

    public static MidApi api() {
        if (api == null) {
            throw new IllegalStateException("Mid API not initialised yet.");
        }
        return api;
    }

    public static void shutDown() {
        if (api == null) return;
        api.reset();
        api = null;
    }
}
