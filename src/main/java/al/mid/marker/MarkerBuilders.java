package al.mid.marker;

import java.awt.*;

public final class MarkerBuilders {

    private MarkerBuilders() {}



    public interface Base<B extends Base<B>> {
        B ticksLeft(int ticks);

        B label(String text);

        MarkerHandle add();
    }

    public interface WithFill<B extends Base<B>> {
        B fillColour(Color colour);

        B fillAlpha(int alpha);
    }

    public interface WithOutline<B extends Base<B>> {
        B outlineColour(Color colour);

        B outlineWidth(float width);
    }


    public interface Shape extends Base<Shape>, WithFill<Shape>, WithOutline<Shape> {}



    public interface ForWorldPoint {
        Shape tile(Threat threat);

        Shape tile(Color colour);

        Shape area(int width, int height, Threat threat);

        Shape area(int width, int height, Color colour);

        Shape radius(int tiles, Threat threat);

        Shape radius(int tiles, Color colour);
    }

    public interface ForActor {
        Shape tile(Threat threat);

        Shape tile(Color colour);

        Shape area(int width, int height, Threat threat);

        Shape area(int width, int height, Color colour);

        Shape radius(int tiles, Threat threat);

        Shape radius(int tiles, Color colour);

        Shape hull(Threat threat);

        Shape hull(Color colour);

        Shape clickbox(Threat threat);

        Shape clickbox(Color colour);

        Shape outline(Threat threat);

        Shape outline(Color colour);
    }

    public interface ForGameObj {
        Shape tile(Threat threat);

        Shape tile(Color colour);

        Shape area(int width, int height, Threat threat);

        Shape area(int width, int height, Color colour);

        Shape radius(int tiles, Threat threat);

        Shape radius(int tiles, Color colour);

        Shape hull(Threat threat);

        Shape hull(Color colour);

        Shape clickbox(Threat threat);

        Shape clickbox(Color colour);

        Shape outline(Threat threat);

        Shape outline(Color colour);
    }

    public interface ForGfxObj {
        Shape tile(Threat threat);

        Shape tile(Color colour);

        Shape area(int width, int height, Threat threat);

        Shape area(int width, int height, Color colour);
    }

    public interface ForProjectile {
        Shape tile(Threat threat);

        Shape tile(Color colour);

        Shape area(int width, int height, Threat threat);

        Shape area(int width, int height, Color colour);

        Shape outline(Threat threat);

        Shape outline(Color colour);
    }


}