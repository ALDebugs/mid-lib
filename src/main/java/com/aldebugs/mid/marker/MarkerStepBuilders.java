package com.aldebugs.mid.marker;

import net.runelite.api.Actor;
import net.runelite.api.GameObject;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Projectile;
import net.runelite.api.coords.WorldPoint;

import java.awt.*;

public class MarkerStepBuilders {

    private MarkerStepBuilders() {}

    public interface EntityStep {
        GroundStep point(WorldPoint wp);
        ActorStep actor(Actor actor);
        GameObjStep gameObj(GameObject gameObject);
        GfxObjStep gfxObj(GraphicsObject graphicsObject);
        ProjectileStep projectile(Projectile projectile);
    }

    public interface GroundStep {
        ColourStep tile();
        SizeStep area();
        RadiusStep radius();
    }
    public interface ActorStep {
        ColourStep tile();
        ColourStep hull();
        ColourStep clickbox();
        ColourStep outline();
        SizeStep area();
        RadiusStep radius();
    }
    public interface GameObjStep {
        ColourStep tile();
        ColourStep hull();
        ColourStep clickbox();
        ColourStep outline();
        SizeStep   area();
        RadiusStep radius();
    }
    public interface GfxObjStep {
        ColourStep tile();
        ColourStep outline();
        SizeStep   area();
        RadiusStep radius();
    }
    public interface ProjectileStep {
        ColourStep tile();
        SizeStep   area();
        RadiusStep radius();
        ColourStep outline();
    }
    public interface SizeStep {
        ColourStep size(int width, int height);
    }
    public interface RadiusStep {
        ColourStep radius(int tiles);
    }
    public interface ColourStep {
        OptionStep threat(Threat threat);
        CustomBorderColourStep colourFill(Color colour, int alpha);
    }
    public interface CustomBorderColourStep {
        OptionStep colourBorder(Color colour, int borderWidth);
    }

    public interface OptionStep<B extends OptionStep<B>> {
        B label(String text);
        /** Expires after a set amount of game ticks **/
        MarkerHandle add(int ticks);
        /** Expires when entity/tile is null, or customised expiry **/
        MarkerHandle addPermanent(); // convenience for Integer.MAX_VALUE
    }

    public interface Options extends OptionStep<Options> {}
}
