package com.aldebugs.mid.marker;

import java.awt.Color;

public class MarkerStepBuilders {

    private MarkerStepBuilders() {}

    public interface ShapeStep {
        ColourStep tile();
        SizeStep area();
        RadiusStep radius();
    }
    public interface OutlineStep extends ShapeStep {
        ColourStep outline();
    }
    public interface FullShapeStep extends OutlineStep {
        ColourStep hull();
        ColourStep clickbox();
    }

    public interface GroundStep extends ShapeStep {}
    public interface ActorStep extends FullShapeStep {}
    public interface GameObjStep extends FullShapeStep {}
    public interface GfxObjStep extends OutlineStep {}
    public interface ProjectileStep extends OutlineStep {}

    public interface SizeStep {
        ColourStep size(int width, int height);
    }
    public interface RadiusStep {
        ColourStep radius(int tiles);
    }
    public interface ColourStep {

        ThreatFillStep dangerous();
        ThreatFillStep warning();
        ThreatFillStep safe();
        CustomBorderStep colourBorder(Color colour, int borderWidth);

    }
    public interface ThreatFillStep extends Options {
        Options filled();
    }

    public interface CustomBorderStep extends Options {
        Options colourFill(Color colour, int alpha);
    }

    public interface Options {
        Options label(String text);
        MarkerHandle add(int ticks);
        /** Expires when entity/tile is null, or customised expiry **/
        MarkerHandle addPermanent();
    }
}
